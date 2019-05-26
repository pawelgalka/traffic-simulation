package src.Symulation;

import src.Model.Destination;
import src.Model.Junction.Junction;
import src.Model.Junction.JunctionStructure;
import src.Model.Road.Road;
import src.Model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class JunctionTest {
    public static void main(String[] args) throws Throwable{

        int i=0;
        Road roadNorth = new Road();
        roadNorth.setLeftLanes(new ArrayList(Arrays.asList(roadNorth.new Lane(10, Road.DIRECTION.LEFT,true,0))));
        roadNorth.setRightLanes(new ArrayList(Arrays.asList(roadNorth.new Lane(10, Road.DIRECTION.RIGHT,true,0))));

        Road roadEast = new Road();
        roadEast.setLeftLanes(new ArrayList(Arrays.asList(roadEast.new Lane(10, Road.DIRECTION.LEFT,true,0))));
        roadEast.setRightLanes(new ArrayList(Arrays.asList(roadEast.new Lane(10, Road.DIRECTION.RIGHT,true,0))));

        Road roadWest = new Road();
        roadWest.setLeftLanes(new ArrayList(Arrays.asList(roadWest.new Lane(10, Road.DIRECTION.LEFT,true,0))));
        roadWest.setRightLanes(new ArrayList(Arrays.asList(roadWest.new Lane(10, Road.DIRECTION.RIGHT,true,0))));

        Road roadSouth = new Road();
        roadSouth.setLeftLanes(new ArrayList(Arrays.asList( roadSouth.new Lane(10, Road.DIRECTION.LEFT,true,0))));
        roadSouth.setRightLanes(new ArrayList(Arrays.asList( roadSouth.new Lane(10, Road.DIRECTION.RIGHT,true,0))));

        //Exit 0 - prosto   1 - prawo   2- lewo
        Destination destinationStraight = new Destination(0,0);
        Destination destinationRight = new Destination(0,2);

        Vehicle tmp1 = new Vehicle(1, 2, 5,destinationStraight);
        Vehicle tmp2 = new Vehicle(2, 3, 4,destinationStraight);
        //roadNorth.getRightLanes().get(0).addVehice(tmp1);
        roadNorth.getRightLanes().get(0).addVehice(tmp2,3);

        JunctionStructure junctionStructure = new JunctionStructure(roadWest,roadEast,roadSouth,roadNorth);
        Junction junction = new Junction(junctionStructure,5);

        int timer=0;
        while(true){
            System.out.println(roadSouth.getRightLanes().get(0).toString());

            JunctionView zajebistywidok = new JunctionView(junctionStructure);
            //zajebistywidok.view();
            junction.update(timer);
            timer++;
            TimeUnit.SECONDS.sleep(3/2);
        }
    }
}
