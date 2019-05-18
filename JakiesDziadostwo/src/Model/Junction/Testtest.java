package src.Model.Junction;

import src.Model.Road.Road;
import src.Model.Vehicle;

import java.util.HashMap;

public class Testtest {
    private Road.Lane previousLane;
    private Road.Lane nextLane;
    private Road.Lane nextLeftLane;
    private Road.Lane nextRightLane;
    private Turn turn;

    public enum Turn{
        left,right;
    }

    public Testtest(Road.Lane previousLane, Road.Lane nextLane) {
        this.previousLane = previousLane;
        this.nextLane = nextLane;
    }

    public Testtest(Road.Lane previousLane, Road.Lane nextLane, Road.Lane nextLeftLane,Turn turn  ) {
        this.previousLane = previousLane;
        this.nextLane = nextLane;
        this.nextLeftLane= nextLeftLane;
        this.turn=turn;
    }

    public Testtest(Road.Lane previousLane, Road.Lane nextLane, Road.Lane nextLeftLane, Road.Lane nextRightLane ) {
        this.previousLane = previousLane;
        this.nextLane = nextLane;
        this.nextLeftLane= nextLeftLane;
        this.nextRightLane= nextRightLane;
    }

    public void toNextLane(){
        HashMap tmp = previousLane.getAndClearVehiclesOutOfLane();
        for(Object x : tmp.keySet()){
            int pos = (int)tmp.get(x);
            if(nextLeftLane != null && ((Vehicle)x).getDestination().getExit()==1){
                nextLeftLane.addVehice((Vehicle)x,pos);
            }
            else if(nextRightLane != null && ((Vehicle)x).getDestination().getExit()==2){
                nextRightLane.addVehice((Vehicle)x,pos);
            }
            else {
                nextLane.addVehice((Vehicle)x,pos);
            }
        }
    }



}
