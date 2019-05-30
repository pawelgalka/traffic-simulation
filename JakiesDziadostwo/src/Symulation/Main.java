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
        int id=0;
        Random r = new Random();

        while(true){

            Vehicle tmp;
            int vehSpeed= r.nextInt(3)+2;
            if(true) {
                //System.out.print(id);
                int random = (int) (Math.random() * 4);
                int r1 = (int) (Math.random()*10);
                Vehicle.TYPE type = (r1 < 5) ? Vehicle.TYPE.BUS : Vehicle.TYPE.CAR;
                tmp = new Vehicle(++id, random + 1, vehSpeed, type);

                int rand = (int)(Math.random()*20);
                if (type == Vehicle.TYPE.BUS){
                    if (rand<2) {
                        road.getLeftLanes().get(2).addVehice(tmp);
                    }
                    else if (rand<5)
                        road.getRightLanes().get(0).addVehice(tmp);
                    continue;
                }
                else {
                if(rand<2)
                    road.getLeftLanes().get(0).addVehice(tmp);
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
            }}


            View zajebistywidok = new View(road);
            zajebistywidok.view();
            left1.getAndClearVehiclesOutOfLane().forEach((x,y)->System.out.println(y));
            road.update();
            i++;
        }
    }
}
