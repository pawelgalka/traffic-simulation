package Symulation;

import Model.JunctionNOTUSED.Junction;
import Model.JunctionNOTUSED.JunctionLane;
import Model.JunctionNOTUSED.JunctionOneSideOfRoad;
import Model.Road.Lane;
import Model.Road.Road;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class JunctionTest {
    public static void main(String[] args) throws Throwable {

        int i=0;

        Lane left1 = new Lane(15, Lane.DIRECTION.LEFT,true);
        Lane right1 = new Lane(15, Lane.DIRECTION.RIGHT,true);
        Road road1 = new Road(new ArrayList(Arrays.asList(left1)), new ArrayList(Arrays.asList(right1)));

        Lane left2 = new Lane(15, Lane.DIRECTION.LEFT,true);
        Lane right2 = new Lane(15, Lane.DIRECTION.RIGHT,true);
        Road road2 = new Road(new ArrayList(Arrays.asList(left2)), new ArrayList(Arrays.asList(right2)));

        JunctionLane jLane1 = new JunctionLane(15, Lane.DIRECTION.LEFT,left2, Model.JunctionNOTUSED.JunctionLane.TURN.NO);
        JunctionLane jLane2 = new JunctionLane(15, Lane.DIRECTION.RIGHT,right1, Model.JunctionNOTUSED.JunctionLane.TURN.NO);

        ArrayList tmpLanes= new ArrayList();
        tmpLanes.add(jLane1);

        JunctionOneSideOfRoad leftSideofRoad = new JunctionOneSideOfRoad.Builder(1)
                .lanes(new ArrayList(Arrays.asList(jLane1)))
                .straightLanes(new ArrayList(Arrays.asList(left1)))
                .build();

        JunctionOneSideOfRoad rightSideofRoad = new JunctionOneSideOfRoad.Builder(2)
                .lanes(new ArrayList(Arrays.asList(jLane2)))
                .straightLanes(new ArrayList(Arrays.asList(right2)))
                .build();

        Junction junction1 = new Junction(leftSideofRoad,rightSideofRoad);

        int id=0;
        Random r = new Random();
        while(true){
            Vehicle tmp;
            if(i==0) {
                //System.out.print(id);
                int random = (int) (Math.random() * 4);
//                tmp = new Vehicle(++id, random + 1, 2);
                //System.out.print(random);

//                road1.getLeftLanes().get(0).addVehice(tmp);
            }



            View zajebistywidok1 = new View(road1);
            zajebistywidok1.view();

            View zajebistywidok2 = new View(road2);
            zajebistywidok2.view();

            road1.update();
            road2.update();
            junction1.update();
            System.out.println(jLane1.toString());
            System.out.println(jLane2.toString());
            i++;
        }
    }
}
