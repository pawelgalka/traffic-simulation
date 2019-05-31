package Model.Junction;

import Model.Road.Lane;
import Model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;

public class JunctionLane extends Lane {

    private Lane previousLane;
    ArrayList<TURN> directionPossibilities = new ArrayList();
    public enum TURN {
        LEFT,RIGHT,NO;
    }

    public JunctionLane(int maxLength_, DIRECTION x, Lane previousLane, TURN... dirPossibilities) {
        super(maxLength_, x, true);
        directionPossibilities.addAll(Arrays.asList(dirPossibilities));
        this.previousLane=previousLane;
    }

    public void update(){
        super.update();
        previousLane.getAndClearVehiclesOutOfLane().forEach((k,v)->addVehice((Vehicle)k,(int)v));
    }

    @Override
    public String toString() {
        String tmp = new String();
        for (int i=0;i<maxLength;i++){
            if (getPositionOnRoad()[i]!=null)
                tmp=tmp+i;
        }
        return tmp;
    }
}
