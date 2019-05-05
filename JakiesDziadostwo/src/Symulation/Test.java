package src.Symulation;


import src.Model.Road.Lane;
import src.Model.Road.Road;
import src.Model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Throwable{

        int i=0;

        Lane left1 = new Lane(50, Lane.DIRECTION.LEFT);
        Lane left2 = new Lane(50, Lane.DIRECTION.LEFT);

        Lane right1 = new Lane(50, Lane.DIRECTION.RIGHT);
        Lane right2 = new Lane(50, Lane.DIRECTION.RIGHT);

        Road road = new Road(new ArrayList(Arrays.asList(left1,left2)), new ArrayList(Arrays.asList(right1,right2)));

        int id=0;
        while(true){
            Vehicle tmp;

            if(i==0) {
                //System.out.print(id);

                tmp = new Vehicle(++id, 7,2,5);
                road.getLeftLanes().get(0).add(tmp);

                tmp = new Vehicle(++id, 5,3,5);
                road.getLeftLanes().get(0).add(tmp);

                tmp = new Vehicle(++id, 3,5,5);
                road.getLeftLanes().get(0).add(tmp);
            }

            for (Vehicle x:road.getLeftLanes().get(0).getListOfVehicles()) {
                System.out.println(x);
            }

            View zajebistywidok = new View(road);
            zajebistywidok.view();

            road.update();
            i++;


        }

    }
}
