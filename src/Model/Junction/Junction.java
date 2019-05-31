package Model.Junction;

import java.util.ArrayList;
import java.util.Arrays;

public class Junction {
    ArrayList<JunctionOneSideOfRoad> arrayOfJunctionRoads = new ArrayList<>();

    public Junction(JunctionOneSideOfRoad... roads){
        arrayOfJunctionRoads.addAll(Arrays.asList(roads));
    }

    private enum Lights{
        RED, GREEN, LEFT;
    }

    public void update(){
        arrayOfJunctionRoads.forEach(x->x.update());

    }


}
