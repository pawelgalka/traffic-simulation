package Symulation;

import Model.Road.Road;
import Model.Vehicle;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
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
        int time = 0, j=0;
        while(true){

            Vehicle tmp;
            int vehSpeed= r.nextInt(3)+2;
            if(true) {
                //System.out.print(id);
                int random = (int) (Math.random() * 4);
                int r1 = (int) (Math.random()*10);
                Vehicle.TYPE type = (r1 < 3) ? Vehicle.TYPE.BUS : Vehicle.TYPE.CAR;
                tmp = new Vehicle(++id, random + 1, vehSpeed, type);
                int randOfHour = (int) (Math.random()*210);
                if (intensityOfMotion.get(j)>randOfHour){
                int rand = (int)(Math.random()*20);//to choose lane
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
            }}}


            View zajebistywidok = new View(road);
            System.out.println(time);
            zajebistywidok.view();

            left1.getAndClearVehiclesOutOfLane().forEach((x,y)-> System.out.println(y));
            road.update();
            i++;
            time+=5;
            if (time%20 == 0) j=time;
        }
    }
}
