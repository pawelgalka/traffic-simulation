package Model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Junction {
    private Road[] arrayOfRoads = new Road[4];


    Junction(Road... roads){
        arrayOfRoads[0] = roads[0];
        arrayOfRoads[1] = roads[1];
        arrayOfRoads[2] = roads[2];
        arrayOfRoads[3] = roads[3];
    }

    private enum Lights{
        RED, GREEN, LEFT;
    }

    private Map<Integer,Lights> lightsMap = new HashMap<Integer, Lights>();

}
