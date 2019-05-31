package sample;

import Model.Road.Road;
import Model.Vehicle;
import Symulation.View;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.util.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        final Parent root = loader.load();
       /* try {
            root = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        Controller controller = loader.getController();
        try {
            controller.setStage(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        primaryStage.setTitle("DataFrame Graphic Environment");
        Node b = ((Pane)root).getChildren().get(0);
//        ((Pane)b).getChildren().add(new Circle(50,50,50));
        Map<Integer, Double> intensityOfMotion = new HashMap<>();
        int values[] = {40,30,20,
                20,20,20,
                20,20,20,
                20,20,30,
                30,30,40,
                40,50,50,
                50,60,60,
                80,90,100,
                130,140,150,
                160,160,160,
                150,150,140,//
                130,130,125,
                130,120,110,
                100,90,90,
                90,100,95,
                120,120,120,
                130,130,150,
                160,170,180,
                190,200,200,
                170,170,160,
                160,150,150,//
                140,130,120,
                100,90,80,
                70,60,50
        };
        for (int i = 0; i< 3*24; i++){
//            System.out.println(20*i);
            intensityOfMotion.put(20*i,(double)values[i]);
        }
//        System.out.println(intensityOfMotion);
        final int[] i = {0};
        Road road = new Road();
        Road.Lane left1 = road.new Lane(50, Road.DIRECTION.LEFT,true,0);
        Road.Lane left2 = road.new Lane(50, Road.DIRECTION.LEFT,true,1);
        Road.Lane left3 = road.new Lane(50, Road.DIRECTION.LEFT,true,2);
        Road.Lane right1 = road.new Lane(50, Road.DIRECTION.RIGHT,true,2);
        Road.Lane right2 = road.new Lane(50, Road.DIRECTION.RIGHT,true,1);
        Road.Lane right3 = road.new Lane(50, Road.DIRECTION.RIGHT,true,0);
//        Road road = new Road(new ArrayList(Arrays.asList(left1,left2)), new ArrayList(Arrays.asList(right1,right2)));
        road.setLeftLanes(new ArrayList(Arrays.asList(left1,left2,left3)));
        road.setRightLanes(new ArrayList(Arrays.asList(right1,right2,right3)));
        road.setNumberoflanes(Math.max(road.getRightLanes().size(),road.getLeftLanes().size()));
        controller.setRoad(road);

        final int[] id = {0};
        Random r = new Random();
        final int[] time = {0};
        final int[] j = { 0 };

        int xx=0;
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public void run() {
                        System.out.println(((Pane) b).getChildren());
                        Vehicle tmp;
                        int vehSpeed= r.nextInt(3)+2;
                        if(true) {
                            //System.out.print(id);
                            int random = (int) (Math.random() * 4);
                            int r1 = (int) (Math.random()*10);
                            Vehicle.TYPE type = (r1 < 3) ? Vehicle.TYPE.BUS : Vehicle.TYPE.CAR;
                            tmp = new Vehicle(++id[0], random + 1, vehSpeed, type);
                            int randOfHour = 0;// (int) (Math.random()*210);
                            if (intensityOfMotion.get(j[0])>randOfHour){
                                int rand = (int)(Math.random()*20);//to choose lane
                                if (type == Vehicle.TYPE.BUS){
                                    /*if (rand<2) {
                                        road.getLeftLanes().get(2).addVehice(tmp);
                                    }
                                    else if (rand<5)
                                        road.getRightLanes().get(0).addVehice(tmp);
*/
                                }
                                else {
                                    tmp.setCenterX(242);
                                    tmp.setCenterY(421);
                                    tmp.setRadius(5);
//                                    rand = 1;
                                    if(rand<2) {
                                        tmp.setCenterX(242);
                                        tmp.setCenterY(421);
                                        tmp.setRadius(5);
                                        road.getLeftLanes().get(0).addVehice(tmp);

                                    }
//                                        Circle c = new Circle(242,421,5);
//                                        controller.map.put(tmp,c);
//                                    ((Pane)b).getChildren().add(c);
//                                }
                                    else if (rand <5)
                                        road.getLeftLanes().get(1).addVehice(tmp);
                                    else if(rand<8)
                                        road.getRightLanes().get(0).addVehice(tmp);
                                    else if (rand <11)
                                        road.getRightLanes().get(1).addVehice(tmp);
                                    else if (rand<15)
                                        road.getLeftLanes().get(2).addVehice(tmp);
                                    else
                                        road.getRightLanes().get(2).addVehice(tmp);

                                    ((Pane) b).getChildren().add(tmp);
                                }}}



                        left1.getAndClearVehiclesOutOfLane().forEach((x,y)-> System.out.println(y));
                        try {
                            View zajebistywidok = new View(road);
                            System.out.println(time);
                            zajebistywidok.view();
                            road.update();
                            controller.setToScene();
                            System.out.println(((Pane) b).getChildren());
                        } catch (Exception e) {
                            e.printStackTrace();
                        } catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                        i[0]++;
                        time[0]+=5;
                        if (time[0]%20 == 0) j[0]=time[0];

                       /* TranslateTransition translateTransition = new TranslateTransition();
                        translateTransition.setDuration(Duration.seconds(1));
                        translateTransition.setNode(((Pane)b).getChildren().get(0));
                        translateTransition.setByY(40);
                        translateTransition.setByX(40);
                        translateTransition.setDelay(Duration.seconds(0));
                        translateTransition.setAutoReverse(true);
                        translateTransition.play();*/

                        }
                };

                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                    }

                    // UI update is run on the Application thread
                    Platform.runLater(updater);
                }
            }
        });
        t.setDaemon(true);
        t.start();
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
