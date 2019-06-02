package Model.SimpleJunction;

import Model.Road.Road;
import Model.Vehicle;

import java.util.HashMap;

public class LaneManager {
    private Road.Lane previousLane;
    private Road.Lane nextLane;
    boolean canTurn;


    public LaneManager(Road.Lane previousLane, Road.Lane nextLane, boolean canTurn) {
        this.previousLane = previousLane;
        this.nextLane = nextLane;
        this.canTurn = canTurn;
    }

    public void toNextLane(){
        HashMap tmp = previousLane.getAndClearVehiclesOutOfLane();

        for(Object x : tmp.keySet()){
            int pos = (int)tmp.get(x);
            if(((Vehicle)x).getDestination().getExit()==0){
                nextLane.addVehice((Vehicle)x,pos);
            }
        }
    }

}
