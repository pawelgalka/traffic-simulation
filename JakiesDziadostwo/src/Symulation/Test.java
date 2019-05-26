package src.Symulation;


import src.Model.Destination;
import src.Model.Junction.TurnOnJunction;
import src.Model.Road.Road;
import src.Model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) throws Throwable{

        int i=0;
        Road road = new Road();
        Road.Lane left1 = road.new Lane(10, Road.DIRECTION.LEFT,true,0);

        Road.Lane right1 = road.new Lane(10, Road.DIRECTION.RIGHT,true,1);


//        Road road = new Road(new ArrayList(Arrays.asList(left1,left2)), new ArrayList(Arrays.asList(right1,right2)));
        road.setLeftLanes(new ArrayList(Arrays.asList(left1)));
        road.setRightLanes(new ArrayList(Arrays.asList(right1)));



        Road road2 = new Road();
        Road.Lane left21 = road.new Lane(10, Road.DIRECTION.LEFT,true,0);
        Road.Lane right21 = road.new Lane(10, Road.DIRECTION.RIGHT,true,1);
//        Road road = new Road(new ArrayList(Arrays.asList(left1,left2)), new ArrayList(Arrays.asList(right1,right2)));
        road2.setLeftLanes(new ArrayList(Arrays.asList(left21)));
        road2.setRightLanes(new ArrayList(Arrays.asList(right21)));


        Road road3 = new Road();
        Road.Lane left31 = road.new Lane(10, Road.DIRECTION.LEFT,true,0);
        Road.Lane right31 = road.new Lane(10, Road.DIRECTION.RIGHT,true,1);
//        Road road = new Road(new ArrayList(Arrays.asList(left1,left2)), new ArrayList(Arrays.asList(right1,right2)));
        road3.setLeftLanes(new ArrayList(Arrays.asList(left21)));
        road3.setRightLanes(new ArrayList(Arrays.asList(right21)));

        TurnOnJunction xd= new TurnOnJunction (left1,left21,left31, TurnOnJunction.Turn.right);







        int id=0;
        Random r = new Random();
        Destination destinationStraight = new Destination(0,0);
        Destination destinationRight = new Destination(0,1);



        while(true){

            Vehicle tmp;
            int vehSpeed= r.nextInt(3)+2;
            System.out.println(i);
            if(i==0) {
                int random = (int) (Math.random() * 4);
                tmp = new Vehicle(++id, random + 1, vehSpeed,destinationStraight);
                if(id==1)
                    road.getLeftLanes().get(0).addVehice(tmp);
            }
            if(i==3) {
                int random = (int) (Math.random() * 4);
                tmp = new Vehicle(++id, random + 1, vehSpeed,destinationRight);
                road.getLeftLanes().get(0).addVehice(tmp);
            }



            View zajebistywidok = new View(road);
            zajebistywidok.view();
            road.update();

            xd.toNextLane();
            View zajebistywidok2 = new View(road3);
            zajebistywidok2.view();
            road2.update();


            i++;
        }
    }
}
