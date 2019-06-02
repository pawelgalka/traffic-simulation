package sample;

import Model.Road.Road;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    Sim sim = new Sim();

    @FXML
    Text hour;

    @FXML
    Pane pane;

    @FXML
    GridPane mainGrid;

    @FXML
    GridPane grid;

    @FXML
    Pane p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12;

    public void print(MouseEvent event){
        System.out.println("AAAA");
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        sim.run();
        sim.setText(hour);
    }
    public void p1(MouseEvent event){
        makePart(1);
    }
    public void p2(MouseEvent event){
        makePart(2);
    }
    public void p3(MouseEvent event){
        makePart(3);
    }
    public void p4(MouseEvent event){
        makePart(4);
    }
    public void p5(MouseEvent event){
        Stage stage = makePart(5);
        Road road = sim.getPlaszowLeg();
        Road road1 = sim.getLegDywizjonu308();
        Road road2 = sim.getDywizjonu308Czyzyny();

        ArrayList<Integer> coordinates = new ArrayList<>(Arrays.asList(510,530,640,600,1000,880,400,0));
        Thread thread = new Thread(new Runnable() {
            Pane p = (Pane) stage.getScene().getRoot();
            int x1 = coordinates.get(0),x2=coordinates.get(1),x3=coordinates.get(2),x4=coordinates.get(3),y1=coordinates.get(4),y2=coordinates.get(5),y3=coordinates.get(6),y4=coordinates.get(7);
            int ile1 = road.getRightLanes().get(0).getMaxLength();
            int ile2 = road1.getRightLanes().get(0).getMaxLength();
            int ile3 = road2.getRightLanes().get(0).getMaxLength();
            double a1 = ((double)(y2-y1))/((double)(x2-x1));
            double ap1 = -1/a1;

            double b1 = y2-a1*x2;
            double bp1 = y2-ap1*x2;

            double a2 = ((double)(y3-y2))/((double)(x3-x2));
            double ap2 = -1/a2;

            double b2 = y2-a2*x2;
            double bp2 = y2-ap2*x2;

            double a3 = ((double)(y4-y3))/((double)(x4-x3));
            double ap3 = -1/a3;

            double b3 = y3-a3*x3;
            double bp3 = y3-ap3*x3;
            double d1 = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/ile1;
            double d2 = Math.sqrt(Math.pow((y2-y3),2)+Math.pow((x3-x2),2))/ile2;
            double d3 = Math.sqrt(Math.pow((y4-y3),2)+Math.pow((x4-x3),2))/ile3;
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public synchronized void run() {
//                        System.out.println(x1+"_________"+y1+"_________"+"__________"+x2+"_________"+y2+"________"+((double)(y2-y1))/((double)(x2-x1)));
                        x1 = coordinates.get(0);
                        x2 = coordinates.get(1);
                        x3 = coordinates.get(2);
                        x4 = coordinates.get(3);
                        y1 = coordinates.get(4);
                        y2 = coordinates.get(5);
                        y3 = coordinates.get(6);
                        y4 = coordinates.get(7);
                        x2 += 15;
                        y2 -= 15;
                        p.getChildren().clear();
                        for (Road.Lane lane : road.getLeftLanes()) {
                            x2 -= 15 * lane.getId();
                            y2 += 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x2 - i * d1 * Math.cos(Math.atan(a1)), y2 - i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road.getRightLanes()) {

                            x1 += 15 * (lane.getId()) + 15;
                            y1 -= 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x1 + i * d1 * Math.cos(Math.atan(a1)), y1 + i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
//                            p.getChildren().add(t);
                        }
                        x1 = coordinates.get(0);
                        x2 = coordinates.get(1);
                        x3 = coordinates.get(2);
                        x4 = coordinates.get(3);
                        y1 = coordinates.get(4);
                        y2 = coordinates.get(5);
                        y3 = coordinates.get(6);
                        y4 = coordinates.get(7);
                        for (Road.Lane lane : road1.getLeftLanes()) {
                            x3 -= 15 * lane.getId();
                            y3 += 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x3 - i * d1 * Math.cos(Math.atan(a1)), y3 - i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road1.getRightLanes()) {

                            x2 += 15 * (lane.getId()) + 15;
                            y2 -= 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x2 + i * d2 * Math.cos(Math.atan(a2)), y2 + i * d2 * Math.sin(Math.atan(a2)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
                        }
                        x1 = coordinates.get(0);
                        x2=coordinates.get(1);
                        x3=coordinates.get(2);
                        x4=coordinates.get(3);
                        y1=coordinates.get(4);
                        y2=coordinates.get(5);
                        y3=coordinates.get(6);
                        y4=coordinates.get(7);
                        for (Road.Lane lane : road2.getLeftLanes()) {
                            x4 -= 15 * lane.getId();
                            y4 += 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x4 - i * d3 * Math.cos(Math.atan(a2)), y4 - i * d3 * Math.sin(Math.atan(a2)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road2.getRightLanes()) {

                            x3 += 15 * (lane.getId()) + 15;
                            y3 -= 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x3 + i * d3 * Math.cos(Math.atan(a3)), y3 + i * d3 * Math.sin(Math.atan(a3)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
                        }
                    }
                };
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        return ;
                    }
                    finally {

                    }
                    p.getChildren().removeAll();
                    // UI update is run on the Application thread
                    Platform.runLater(updater);
                }
            }
        });
        thread.start();
        stage.show();
    }
    public void p6(MouseEvent event){
        Stage stage = makePart(6);
        Road road = sim.getKabelPlaszow();
        Road road1 = sim.getPlaszowLegPart();
        ArrayList<Integer> coordinates = new ArrayList<>(Arrays.asList(150,430,510,1000,650,0));
        Thread thread = new Thread(new Runnable() {
            Pane p = (Pane) stage.getScene().getRoot();
            int x1 = coordinates.get(0),x2=coordinates.get(1),x3=coordinates.get(2),y1=coordinates.get(3),y2=coordinates.get(4),y3=coordinates.get(5);
            int ile1 = road.getRightLanes().get(0).getMaxLength();
            int ile2 = road1.getRightLanes().get(0).getMaxLength();
            double a1 = ((double)(y2-y1))/((double)(x2-x1));
            double ap1 = -1/a1;

            double b1 = y2-a1*x2;
            double bp1 = y2-ap1*x2;

            double a2 = ((double)(y3-y2))/((double)(x3-x2));
            double ap2 = -1/a2;

            double b2 = y2-a2*x2;
            double bp2 = y2-ap2*x2;

            double d1 = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/ile1;
            double d2 = Math.sqrt(Math.pow((y2-y3),2)+Math.pow((x3-x2),2))/ile2;
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public synchronized void run() {
//                        System.out.println(x1+"_________"+y1+"_________"+"__________"+x2+"_________"+y2+"________"+((double)(y2-y1))/((double)(x2-x1)));
                        x1 = coordinates.get(0);
                        x2 = coordinates.get(1);
                        x3 = coordinates.get(2);
                        y1 = coordinates.get(3);
                        y2 = coordinates.get(4);
                        y3 = coordinates.get(5);
                        x2 += 15;
                        y2 -= 15;
                        p.getChildren().clear();
                        for (Road.Lane lane : road.getLeftLanes()) {
                            x2 += 15 * lane.getId();
                            y2 -= 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x2 - i * d1 * Math.cos(Math.atan(a1)), y2 - i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road.getRightLanes()) {

                            x1 += 15 * (lane.getId()) + 15;
                            y1 -= 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x1 + i * d1 * Math.cos(Math.atan(a1)), y1 + i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
//                            p.getChildren().add(t);
                        }
                        x1 = coordinates.get(0);
                        x2 = coordinates.get(1);
                        x3 = coordinates.get(2);
                        y1 = coordinates.get(3);
                        y2 = coordinates.get(4);
                        y3 = coordinates.get(5);
                        for (Road.Lane lane : road1.getLeftLanes()) {
                            x3 -= 15 * lane.getId();
                            y3 += 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x3 - i * d1 * Math.cos(Math.atan(a1)), y3 - i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road1.getRightLanes()) {

                            x2 += 15 * (lane.getId()) + 15;
                            y2 -= 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x2 + i * d2 * Math.cos(Math.atan(a2)), y2 + i * d2 * Math.sin(Math.atan(a2)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
                        }
                    }
                };
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        return ;
                    }
                    finally {

                    }
                    p.getChildren().removeAll();
                    // UI update is run on the Application thread
                    Platform.runLater(updater);
                }
            }
        });
        thread.start();
        stage.show();
    }
    public void p7(MouseEvent event){
        Stage stage = makePart(7);
        Road road = sim.getKabelPlaszowPart1();
        ArrayList<Integer> coordinates = new ArrayList<>(Arrays.asList(0,150,250,0));
        Thread thread = new Thread(new Runnable() {
            Pane p = (Pane) stage.getScene().getRoot();

            private boolean flaga = true;
            double x1 = coordinates.get(0),x2=coordinates.get(1),y1=coordinates.get(2),y2=coordinates.get(2);
            int ile = road.getRightLanes().get(0).getMaxLength();
            double a = ((double)(y2-y1))/((double)(x2-x1));
            double ap = -1/a;

            double b = y2-a*x2;
            double bp = y2-ap*x2;
            double d = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/ile;
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public synchronized void run() {
                        x1 = coordinates.get(0);
                        x2 = coordinates.get(1);
                        y1 = coordinates.get(2);
                        y2 = coordinates.get(3);
                        x2+=15;
                        y2-=15;
                        p.getChildren().clear();
                        for (Road.Lane lane: road.getLeftLanes()){
                            x2 += 15*lane.getId();
                            y2 -= 15*lane.getId();
                            for(int i=0; i<lane.getMaxLength(); i++){
                                if(lane.getPositionOnRoad()[i]!=null){
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x2-i*d*Math.cos(Math.atan(a)),y2-i*d*Math.sin(Math.atan(a)),4,Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane: road.getRightLanes()){

                            x1 -= 15*(lane.getId())+15;
                            y1 += 15*(lane.getId())-15;
//                            System.out.println(lane.getId()+" "+x1+ " "+y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for(int i=0; i<lane.getMaxLength(); i++){

                                if(lane.getPositionOnRoad()[i]!=null){
                                    Circle tmp = new Circle(x1+i*d*Math.cos(Math.atan(a)),y1+i*d*Math.sin(Math.atan(a)),4,Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
//                            p.getChildren().add(t);
                        }
                    }
                };
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        return ;
                    }
                    finally {

                    }
                    p.getChildren().removeAll();
                    // UI update is run on the Application thread
                    Platform.runLater(updater);
                }
            }
        });
        thread.start();
        stage.show();
    }
    public void p8(MouseEvent event){
        Stage stage = makePart(8);
        Road road = sim.getLagiewnikiKabel();
        Road road1 = sim.getKabelPlaszowPart();
        ArrayList<Integer> coordinates = new ArrayList<>(Arrays.asList(0,730,1000,880,330,250));
        Thread thread = new Thread(new Runnable() {
            Pane p = (Pane) stage.getScene().getRoot();
            int x1 = coordinates.get(0),x2=coordinates.get(1),x3=coordinates.get(2),y1=coordinates.get(3),y2=coordinates.get(4),y3=coordinates.get(5);
            int ile1 = road.getRightLanes().get(0).getMaxLength();
            int ile2 = road1.getRightLanes().get(0).getMaxLength();
            double a1 = ((double)(y2-y1))/((double)(x2-x1));
            double ap1 = -1/a1;

            double b1 = y2-a1*x2;
            double bp1 = y2-ap1*x2;

            double a2 = ((double)(y3-y2))/((double)(x3-x2));
            double ap2 = -1/a2;

            double b2 = y2-a2*x2;
            double bp2 = y2-ap2*x2;

            double d1 = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/ile1;
            double d2 = Math.sqrt(Math.pow((y2-y3),2)+Math.pow((x3-x2),2))/ile2;
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public synchronized void run() {
//                        System.out.println(x1+"_________"+y1+"_________"+"__________"+x2+"_________"+y2+"________"+((double)(y2-y1))/((double)(x2-x1)));
                        x1 = coordinates.get(0);
                        x2 = coordinates.get(1);
                        x3 = coordinates.get(2);
                        y1 = coordinates.get(3);
                        y2 = coordinates.get(4);
                        y3 = coordinates.get(5);
                        x2 += 15;
                        y2 -= 15;
                        p.getChildren().clear();
                        for (Road.Lane lane : road.getLeftLanes()) {
                            x2 += 15 * lane.getId();
                            y2 -= 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x2 - i * d1 * Math.cos(Math.atan(a1)), y2 - i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road.getRightLanes()) {

                            x1 += 15 * (lane.getId()) + 15;
                            y1 -= 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x1 + i * d1 * Math.cos(Math.atan(a1)), y1 + i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
//                            p.getChildren().add(t);
                        }
                        x1 = coordinates.get(0);
                        x2 = coordinates.get(1);
                        x3 = coordinates.get(2);
                        y1 = coordinates.get(3);
                        y2 = coordinates.get(4);
                        y3 = coordinates.get(5);
                        for (Road.Lane lane : road1.getLeftLanes()) {
                            x3 -= 15 * lane.getId();
                            y3 += 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x3 - i * d1 * Math.cos(Math.atan(a1)), y3 - i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road1.getRightLanes()) {

                            x2 += 15 * (lane.getId()) + 15;
                            y2 -= 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x2 + i * d2 * Math.cos(Math.atan(a2)), y2 + i * d2 * Math.sin(Math.atan(a2)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
                        }
                    }
                };
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        return ;
                    }
                    finally {

                    }
                    p.getChildren().removeAll();
                    // UI update is run on the Application thread
                    Platform.runLater(updater);
                }
            }
        });
        thread.start();
        stage.show();
    }
    public void p9(MouseEvent event){
        Stage stage = makePart(9);
        Road road = sim.getRuczajSolvay();
        Road road1 = sim.getSolvayLagiewniki();
        Road road2 = sim.getLagiewnikiKabelSquare();
        ArrayList<Integer> coordinates = new ArrayList<>(Arrays.asList(0,336,698,1000,260,445,762,880));
        Thread thread = new Thread(new Runnable() {
            Pane p = (Pane) stage.getScene().getRoot();
            int x1 = coordinates.get(0),x2=coordinates.get(1),x3=coordinates.get(2),x4=coordinates.get(3),y1=coordinates.get(4),y2=coordinates.get(5),y3=coordinates.get(6),y4=coordinates.get(7);
            int ile1 = road.getRightLanes().get(0).getMaxLength();
            int ile2 = road1.getRightLanes().get(0).getMaxLength();
            int ile3 = road2.getRightLanes().get(0).getMaxLength();
            double a1 = ((double)(y2-y1))/((double)(x2-x1));
            double ap1 = -1/a1;

            double b1 = y2-a1*x2;
            double bp1 = y2-ap1*x2;

            double a2 = ((double)(y3-y2))/((double)(x3-x2));
            double ap2 = -1/a2;

            double b2 = y2-a2*x2;
            double bp2 = y2-ap2*x2;

            double a3 = ((double)(y4-y3))/((double)(x4-x3));
            double ap3 = -1/a3;

            double b3 = y3-a3*x3;
            double bp3 = y3-ap3*x3;
            double d1 = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/ile1;
            double d2 = Math.sqrt(Math.pow((y2-y3),2)+Math.pow((x3-x2),2))/ile2;
            double d3 = Math.sqrt(Math.pow((y4-y3),2)+Math.pow((x4-x3),2))/ile3;
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public synchronized void run() {
//                        System.out.println(x1+"_________"+y1+"_________"+"__________"+x2+"_________"+y2+"________"+((double)(y2-y1))/((double)(x2-x1)));
                        x1 = coordinates.get(0);
                        x2 = coordinates.get(1);
                        x3 = coordinates.get(2);
                        x4 = coordinates.get(3);
                        y1 = coordinates.get(4);
                        y2 = coordinates.get(5);
                        y3 = coordinates.get(6);
                        y4 = coordinates.get(7);
                        x2 += 15;
                        y2 -= 15;
                        p.getChildren().clear();
                        for (Road.Lane lane : road.getLeftLanes()) {
                            x2 += 15 * lane.getId();
                            y2 -= 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x2 - i * d1 * Math.cos(Math.atan(a1)), y2 - i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road.getRightLanes()) {

                            x1 -= 15 * (lane.getId()) + 15;
                            y1 += 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x1 + i * d1 * Math.cos(Math.atan(a1)), y1 + i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
//                            p.getChildren().add(t);
                        }
                        x1 = coordinates.get(0);
                        x2 = coordinates.get(1);
                        x3 = coordinates.get(2);
                        x4 = coordinates.get(3);
                        y1 = coordinates.get(4);
                        y2 = coordinates.get(5);
                        y3 = coordinates.get(6);
                        y4 = coordinates.get(7);
                        for (Road.Lane lane : road1.getLeftLanes()) {
                            x3 += 15 * lane.getId();
                            y3 -= 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x3 - i * d1 * Math.cos(Math.atan(a1)), y3 - i * d1 * Math.sin(Math.atan(a1)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road1.getRightLanes()) {

                            x2 -= 15 * (lane.getId()) + 15;
                            y2 += 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x2 + i * d2 * Math.cos(Math.atan(a2)), y2 + i * d2 * Math.sin(Math.atan(a2)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
                        }
                        x1 = coordinates.get(0);
                        x2=coordinates.get(1);
                        x3=coordinates.get(2);
                        x4=coordinates.get(3);
                        y1=coordinates.get(4);
                        y2=coordinates.get(5);
                        y3=coordinates.get(6);
                        y4=coordinates.get(7);
                        for (Road.Lane lane : road2.getLeftLanes()) {
                            x4 += 15 * lane.getId();
                            y4 -= 15 * lane.getId();
                            for (int i = 0; i < lane.getMaxLength(); i++) {
                                if (lane.getPositionOnRoad()[i] != null) {
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x4 - i * d3 * Math.cos(Math.atan(a2)), y4 - i * d3 * Math.sin(Math.atan(a2)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane : road2.getRightLanes()) {

                            x3 -= 15 * (lane.getId()) + 15;
                            y3 += 15 * (lane.getId()) - 15;
//                            System.out.println(lane.getId() + " " + x1 + " " + y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for (int i = 0; i < lane.getMaxLength(); i++) {

                                if (lane.getPositionOnRoad()[i] != null) {
                                    Circle tmp = new Circle(x3 + i * d3 * Math.cos(Math.atan(a3)), y3 + i * d3 * Math.sin(Math.atan(a3)), 4, Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
                        }
                    }
                };
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        return ;
                    }
                    finally {

                    }
                    p.getChildren().removeAll();
                    // UI update is run on the Application thread
                    Platform.runLater(updater);
                }
            }
        });
        thread.start();
        stage.show();
    }
    public void p10(MouseEvent event){
        Stage stage = makePart(10);
        Road road = sim.getPrzegorzalyRuczaj();
        ArrayList<Integer> coordinates = new ArrayList<>(Arrays.asList(780,1000,0,260));
        Thread thread = new Thread(new Runnable() {
            Pane p = (Pane) stage.getScene().getRoot();

            private boolean flaga = true;
            int x1 = coordinates.get(0),x2=coordinates.get(1),y1=coordinates.get(2),y2=coordinates.get(3);
            int ile = road.getRightLanes().get(0).getMaxLength();
            double a = (y2-y1)/(x2-x1);
            double ap = -1/a;

            double b = y2-a*x2;
            double bp = y2-ap*x2;
            double d = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/ile;
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public synchronized void run() {
                        x1 = coordinates.get(0);
                        x2=coordinates.get(1);
                        y1=coordinates.get(2);
                        y2=coordinates.get(3);
                        x2+=15;
                        y2-=15;
                        p.getChildren().clear();
                        for (Road.Lane lane: road.getLeftLanes()){
                            x2 += 15*lane.getId();
                            y2 -= 15*lane.getId();
                            for(int i=0; i<lane.getMaxLength(); i++){
                                if(lane.getPositionOnRoad()[i]!=null){
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x2-i*d*Math.cos(Math.atan(a)),y2-i*d*Math.sin(Math.atan(a)),4,Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane: road.getRightLanes()){

                            x1 -= 15*(lane.getId())+15;
                            y1 += 15*(lane.getId())-15;
                            System.out.println(lane.getId()+" "+x1+ " "+y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for(int i=0; i<lane.getMaxLength(); i++){

                                if(lane.getPositionOnRoad()[i]!=null){
                                    Circle tmp = new Circle(x1+i*d*Math.cos(Math.atan(a)),y1+i*d*Math.sin(Math.atan(a)),4,Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
//                            p.getChildren().add(t);
                        }
                    }
                };
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        return ;
                    }
                    finally {

                    }
                    p.getChildren().removeAll();
                    // UI update is run on the Application thread
                    Platform.runLater(updater);
                }
            }
        });
        thread.start();
        stage.show();
    }
    public void p11(MouseEvent event){
        Stage stage = makePart(11);
        Road road = sim.getPrzegorzalyRuczaj();
        ArrayList<Integer> coordinates = new ArrayList<>(Arrays.asList(286,780,0,1000));
        Thread thread = new Thread(new Runnable() {
            Pane p = (Pane) stage.getScene().getRoot();

            private boolean flaga = true;
            int x1 = 286,x2=780,y1=0,y2=1000;
            int ile = road.getRightLanes().get(0).getMaxLength();
            double a = (y2-y1)/(x2-x1);
            double ap = -1/a;

            double b = y2-a*x2;
            double bp = y2-ap*x2;
            double d = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/ile;
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public synchronized void run() {
                        x1 = 286;
                        x2=780;
                        y1=0;
                        y2=1000;
                        x2+=15;
                        y2-=15;
                        p.getChildren().clear();
                        for (Road.Lane lane: road.getLeftLanes()){
                            x2 += 15*lane.getId();
                            y2 -= 15*lane.getId();
                            for(int i=0; i<lane.getMaxLength(); i++){
                                if(lane.getPositionOnRoad()[i]!=null){
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x2-i*d*Math.cos(Math.atan(a)),y2-i*d*Math.sin(Math.atan(a)),4,Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane: road.getRightLanes()){

                            x1 -= 15*(lane.getId())+15;
                            y1 += 15*(lane.getId())-15;
                            System.out.println(lane.getId()+" "+x1+ " "+y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for(int i=0; i<lane.getMaxLength(); i++){

                                if(lane.getPositionOnRoad()[i]!=null){
                                    Circle tmp = new Circle(x1+i*d*Math.cos(Math.atan(a)),y1+i*d*Math.sin(Math.atan(a)),4,Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
//                            p.getChildren().add(t);
                        }
                    }
                };
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        return ;
                    }
                    finally {

                    }
                    p.getChildren().removeAll();
                    // UI update is run on the Application thread
                    Platform.runLater(updater);
                }
            }
        });
        thread.start();
        stage.show();
    }
    public void p12(MouseEvent event){
        Stage stage = makePart(12);
        Road road = sim.getZarzeczePrzegorzaly();
        ArrayList<Integer> coordinates = new ArrayList<>(Arrays.asList(200,327,0,1000));
        Thread thread = new Thread(new Runnable() {
            Pane p = (Pane) stage.getScene().getRoot();

            private boolean flaga = true;
            int x1 = 200,x2=327,y1=0,y2=1000;
            int ile = road.getRightLanes().get(0).getMaxLength();
            double a = (y2-y1)/(x2-x1);
            double ap = -1/a;

            double b = y2-a*x2;
            double bp = y2-ap*x2;
            double d = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/ile;
            @Override
            public void run() {
                Runnable updater = new Runnable() {
                    @Override
                    public synchronized void run() {
                        x1 = 200;
                        x2=327;
                        y1=0;
                        y2=1000;
                        x2+=15;
                        y2-=15;
                        p.getChildren().clear();
                        for (Road.Lane lane: road.getLeftLanes()){
                            x2 += 15*lane.getId();
                            y2 -= 15*lane.getId();
                            for(int i=0; i<lane.getMaxLength(); i++){
                                if(lane.getPositionOnRoad()[i]!=null){
//                                    tmp.setFill(Color.BLUE);
                                    Circle tmp = new Circle(x2-i*d*Math.cos(Math.atan(a)),y2-i*d*Math.sin(Math.atan(a)),4,Color.BLUE);
                                    p.getChildren().add(tmp);

                                }

                            }
                        }
                      /*  x1-=15;
                        y1+=15;*/
                        for (Road.Lane lane: road.getRightLanes()){

                            x1 -= 15*(lane.getId())+15;
                            y1 += 15*(lane.getId())-15;
                            System.out.println(lane.getId()+" "+x1+ " "+y1);

//                            Text t = new Text(x1,x2,Integer.toString(lane.getId()));
//                            t.setFill(Color.WHITE);

                            for(int i=0; i<lane.getMaxLength(); i++){

                                if(lane.getPositionOnRoad()[i]!=null){
                                    Circle tmp = new Circle(x1+i*d*Math.cos(Math.atan(a)),y1+i*d*Math.sin(Math.atan(a)),4,Color.BLUE);
                                    p.getChildren().add(tmp);
//                                    tmp.setFill(Color.BLUE);
                                }

                            }
//                            p.getChildren().add(t);
                        }
                    }
                };
                while (!Thread.currentThread().isInterrupted()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        return ;
                    }
                    finally {

                    }
                    p.getChildren().removeAll();
                    // UI update is run on the Application thread
                    Platform.runLater(updater);
                }
            }
        });
        thread.start();
        stage.show();
    }

    private Stage makePart(int i) {
        Pane root = new Pane();
        Stage stage = new Stage();
        stage.setScene(new Scene(root,1000,1000));
        root.setStyle("-fx-background-image: url('file:C:/Users/pkgal/IdeaProjects/guifinal/graphics/p"+i+".jpg')");
        return stage;
    }
}
