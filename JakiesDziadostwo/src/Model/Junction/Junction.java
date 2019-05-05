package src.Model.Junction;

import src.Model.Road.Road;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Junction {
    private Road[] arrayOfRoads = new Road[4];
    ArrayList<JunctionOneSideOfRoad> arrayOfJunctionRoads = new ArrayList<>();

    public Junction(JunctionOneSideOfRoad... roads){
        arrayOfJunctionRoads.addAll(Arrays.asList(roads));
    }

    private enum Lights{
        RED, GREEN, LEFT;
    }


}
