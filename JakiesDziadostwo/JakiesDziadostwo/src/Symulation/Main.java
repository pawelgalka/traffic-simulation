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

        Lane left1 = new Lane(50, Lane.DIRECTION.LEFT,false);
        Lane left2 = new Lane(50, Lane.DIRECTION.LEFT,false);

        Lane right1 = new Lane(50, Lane.DIRECTION.RIGHT,false);
        Lane right2 = new Lane(50, Lane.DIRECTION.RIGHT,false);

        Road road = new Road(new ArrayList(Arrays.asList(left1,left2)), new ArrayList(Arrays.asList(right1,right2)));

        int id=0;
        Random r = new Random();

        while(true){

            Vehicle tmp;
            int vehSpeed= r.nextInt(3)+2;
            if(true) {
                //System.out.print(id);
                int random = (int) (Math.random() * 4);
                tmp = new Vehicle(++id, random + 1, vehSpeed);
                //System.out.print(random);
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

            road.update();
            i++;
        }


        /*
        Vehicle tmp2 = new Vehicle(i++,5,10,20);
        Vehicle tmp3 = new Vehicle(i++,12,10,20);
        Vehicle tmp4 = new Vehicle(i++,30,10,20);

        Vehicle tmp5 = new Vehicle(i++,0,10,20);
        Vehicle tmp6 = new Vehicle(i++,5,10,20);
        Vehicle tmp7 = new Vehicle(i++,12,10,20);
        Vehicle tmp8 = new Vehicle(i++,22,10,20);
        */

    }
}
