package src.Symulation;

import src.Model.Road.Lane;
import src.Model.Road.Road;
import src.Model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws Throwable{

        int i=0;
        Road road = new Road();
        Road.Lane left1 = road.new Lane(50, Lane.DIRECTION.LEFT,true,0);
        Road.Lane left2 = road.new Lane(50, Lane.DIRECTION.LEFT,true,1);

        Road.Lane right1 = road.new Lane(50, Lane.DIRECTION.RIGHT,true,1);
        Road.Lane right2 = road.new Lane(50, Lane.DIRECTION.RIGHT,true,0);

//        Road road = new Road(new ArrayList(Arrays.asList(left1,left2)), new ArrayList(Arrays.asList(right1,right2)));
        road.setLeftLanes(new ArrayList(Arrays.asList(left1,left2)));
        road.setRightLanes(new ArrayList(Arrays.asList(right1,right2)));
        int id=0;
        Random r = new Random();

        while(true){

            Vehicle tmp;
            int vehSpeed= r.nextInt(3)+2;
            if(true) {
                //System.out.print(id);
                int random = (int) (Math.random() * 4);
                tmp = new Vehicle(++id, random + 1, vehSpeed);

                int rand = (int)(Math.random()*10);

                if(rand<2)
                    road.getLeftLanes().get(0).addVehice(tmp);
                else if (rand <5)
                    road.getLeftLanes().get(1).addVehice(tmp);
                else if(rand<8)
                    road.getRightLanes().get(0).addVehice(tmp);
                else if (rand <11)
                    road.getRightLanes().get(1).addVehice(tmp);
            }


            View zajebistywidok = new View(road);
            zajebistywidok.view();
            left1.getAndClearVehiclesOutOfLane().forEach((x,y)->System.out.println(y));
            road.update();
            i++;
        }
    }
}
