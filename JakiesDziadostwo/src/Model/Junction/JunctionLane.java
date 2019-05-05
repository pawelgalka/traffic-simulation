package src.Model.Junction;

import src.Model.Road.Lane;
import src.Model.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JunctionLane extends Lane {

    ArrayList<TURN> directionPossibilities = new ArrayList();
    public enum TURN {
        LEFT,RIGHT,NO;
    }

    public JunctionLane(int maxLength_, DIRECTION x, TURN... dirPossibilities) {
        super(maxLength_, x);
        directionPossibilities.addAll(Arrays.asList(dirPossibilities));
    }

    public boolean availableSpace(){
        if(getListOfVehicles().size()==getMaxLength())
            return false;
        return true;
    }

    public void setAndUpdatePositionOfVehicles(Lane laneToJunction){
        listOfVehicles = laneToJunction.getVehiclesToJunction();
        for (Vehicle x:listOfVehicles) {
            x.setPositionX(x.getPositionX()-laneToJunction.getMaxLength());
            x.setVelocity(2);
        }
    }

    public boolean update(){
        ArrayList remove = new ArrayList();
        for (int i=0;i<listOfVehicles.size();i++){
            move(i);

            if(listOfVehicles.get(i).getPositionX()>=maxLength)
                remove.add(listOfVehicles.get(i));
        }

        vehiclesOutOfLane= (ArrayList) remove.clone();
        listOfVehicles.removeAll(remove);


        return true;
    }





}
