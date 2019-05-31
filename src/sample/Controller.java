package sample;

import Model.Road.Road;
import Model.Vehicle;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

public class Controller {
    Stage myStage;
    Road road;
    Map<Vehicle, Circle> map = new HashMap<Vehicle, Circle>();
    void setStage(Stage stage) throws Exception{
        myStage = stage;
        Image image = new Image(new FileInputStream("C:\\Users\\pkgal\\IdeaProjects\\untitled5\\src\\sample\\droga.jpg"));
        //Image image = new Image("my/res/flower.png", 100, 100, false, false);//directly resizing
        ImageView imageView = new ImageView(image);
        BorderPane pane = new BorderPane();
        pane.setCenter(imageView);
    }

    public void setRoad(Road road) {
        this.road = road;
    }

    public void setToScene(){
        for (Road.Lane lane: road.getRightLanes()){
//        Road.Lane lane = road.getLeftLanes().get(0);

            Parent p = myStage.getScene().getRoot();
            Node n = ((Pane)p).getChildren().get(0);
            int x1=242,x2=571;
            int y1=421,y2=86;
            double a = (y2-y1)/(x2-x1);
            double ap = -1/a;

            double b = y2-a*x2;
            double bp = y2-ap*x2;
            x1 -= 40*lane.getId()*Math.cos(Math.atan(ap));
            x2 -= 40*lane.getId()*Math.cos(Math.atan(ap));
            y1 -= 40*lane.getId()*Math.sin(Math.atan(ap));
            y2 -= 40*lane.getId()*Math.sin(Math.atan(ap));
            double d = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/lane.getMaxLength();
            System.out.println(Math.atan(a)+" "+d);

            for (int i=0; i<lane.getMaxLength(); i++){
                if (lane.getPositionOnRoad()[i] != null){
                    lane.getPositionOnRoad()[i].setCenterX(x2-i*d*Math.cos(Math.atan(a)));
                    lane.getPositionOnRoad()[i].setCenterY(y2+i*d*Math.cos(Math.atan(a)));
                    Color c = Color.rgb(255/lane.getPositionOnRoad()[i].getMaxVelocity()*(lane.getPositionOnRoad()[i].getMaxVelocity()-lane.getPositionOnRoad()[i].getVelocity()),255*lane.getPositionOnRoad()[i].getVelocity()/lane.getPositionOnRoad()[i].getMaxVelocity(),128);
//                    lane.getPositionOnRoad()[i].setFill(c);
                }
//            else if (lane.getPositionOnRoad()[i] == null && map.)
            }
        }
        for (Road.Lane lane: road.getLeftLanes()){
//        Road.Lane lane = road.getLeftLanes().get(0);

        Parent p = myStage.getScene().getRoot();
        Node n = ((Pane)p).getChildren().get(0);
        int x1=242,x2=571;
        int y1=421,y2=86;
        double a = (y2-y1)/(x2-x1);
        double ap = -1/a;

        double b = y2-a*x2;
        double bp = y2-ap*x2;
        x1 += 40*(lane.getId()+1)*Math.cos(Math.atan(ap));
        x2 += 40*(lane.getId()+1)*Math.cos(Math.atan(ap));
        y1 += 40*(lane.getId()+1)*Math.sin(Math.atan(ap));
        y2 += 40*(lane.getId()+1)*Math.sin(Math.atan(ap));
        double d = Math.sqrt(Math.pow((y2-y1),2)+Math.pow((x2-x1),2))/lane.getMaxLength();
        System.out.println(Math.atan(a)+" "+d);

        for (int i=0; i<lane.getMaxLength(); i++){
            if (lane.getPositionOnRoad()[i] != null){
                lane.getPositionOnRoad()[i].setCenterX(x1+i*d*Math.cos(Math.atan(a)));
                lane.getPositionOnRoad()[i].setCenterY(y1-i*d*Math.cos(Math.atan(a)));
                Color c = Color.rgb(255/lane.getPositionOnRoad()[i].getMaxVelocity()*(lane.getPositionOnRoad()[i].getMaxVelocity()-lane.getPositionOnRoad()[i].getVelocity()),255*lane.getPositionOnRoad()[i].getVelocity()/lane.getPositionOnRoad()[i].getMaxVelocity(),128);
//                lane.getPositionOnRoad()[i].setFill(c);
            }
//            else if (lane.getPositionOnRoad()[i] == null && map.)
        }
    }
    }
}
