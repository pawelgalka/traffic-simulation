package src.Model.Junction;

import src.Model.Road.Road;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Junction {
    ArrayList<JunctionOneSideOfRoad> arrayOfJunctionRoads = new ArrayList<>();

    public Junction(JunctionOneSideOfRoad... roads){
        arrayOfJunctionRoads.addAll(Arrays.asList(roads));
    }


    public void update(){
        //arrayOfJunctionRoads.forEach(x->x.update());

    }


}
