package src.Symulation;

import src.Model.Junction.Junction;
import src.Model.Junction.JunctionLane;
import src.Model.Junction.JunctionOneSideOfRoad;
import src.Model.Road.Lane;
import src.Model.Road.Road;
import src.Model.Vehicle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class JunctionTest {
    public static void main(String[] args) throws Throwable{

        int i=0;

        Lane left1 = new Lane(15, Lane.DIRECTION.LEFT);
        Lane right1 = new Lane(15, Lane.DIRECTION.RIGHT);
        Road road1 = new Road(new ArrayList(Arrays.asList(left1)), new ArrayList(Arrays.asList(right1)));

        Lane left2 = new Lane(15, Lane.DIRECTION.LEFT);
        Lane right2 = new Lane(15, Lane.DIRECTION.RIGHT);
        Road road2 = new Road(new ArrayList(Arrays.asList(left1)), new ArrayList(Arrays.asList(right1)));

        JunctionLane jLane1 = new JunctionLane(15, Lane.DIRECTION.LEFT, src.Model.Junction.JunctionLane.TURN.NO);
        JunctionLane jLane2 = new JunctionLane(15, Lane.DIRECTION.RIGHT, src.Model.Junction.JunctionLane.TURN.NO);

        JunctionOneSideOfRoad leftSideofRoad = new JunctionOneSideOfRoad(0,(ArrayList)Arrays.asList(jLane1), (ArrayList)Collections.emptyList(),(ArrayList)Collections.emptyList(),(ArrayList)Arrays.asList(left2));
        JunctionOneSideOfRoad rightSideofRoad = new JunctionOneSideOfRoad(1,(ArrayList)Arrays.asList(jLane2), (ArrayList)Collections.emptyList(),(ArrayList)Collections.emptyList(),(ArrayList)Arrays.asList(right2));

        Junction junction1 = new Junction(leftSideofRoad,rightSideofRoad);

        int id=0;
        Random r = new Random();
        while(true){
            Vehicle tmp;
            int vehSpeed= r.nextInt(3)+2;
            if(true) {
                //System.out.print(id);
                int random = (int) (Math.random() * 4);
                tmp = new Vehicle(++id, 0, random + 1, vehSpeed);
                //System.out.print(random);
                int rand = (int)(Math.random()*10);

                if(rand<6)
                    road1.getLeftLanes().get(0).add(tmp);
                else if(rand<11)
                    road1.getRightLanes().get(0).add(tmp);
            }


            View zajebistywidok = new View(road1);
            zajebistywidok.view();

            road1.update();
            i++;
        }
    }
}
