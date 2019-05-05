package src.Model.Junction;

import src.Model.Road.Lane;
import src.Model.Road.Road;
import src.Model.Vehicle;

import java.util.ArrayList;

public class JunctionOneSideOfRoad{

    private int id;
    ArrayList<JunctionLane> junctionLanes = new ArrayList<>();
    ArrayList<Lane> laneAfterLeftTurn = new ArrayList<>();
    ArrayList<Lane> laneAfterRightTurn = new ArrayList<>();
    ArrayList<Lane> straightLane = new ArrayList<>();

    public JunctionOneSideOfRoad(int id_, ArrayList junctionLanes_, ArrayList laneAfterLeftTurn_, ArrayList laneAfterRightTurn_,ArrayList straightLane_){
        id=id_;
        junctionLanes=junctionLanes_;
        laneAfterLeftTurn=laneAfterLeftTurn_;
        laneAfterRightTurn=laneAfterRightTurn_;
        straightLane=straightLane_;
    }

    public void update(){
        for (JunctionLane x:junctionLanes) {
            x.update();
        }
        //Tylko na jeden pas
        for (JunctionLane x:junctionLanes) {
            for (Object vehicle:x.getVehiclesToJunction()) {
                Vehicle tmp = ((Vehicle)vehicle);
                tmp.setPositionX(tmp.getPositionX()-x.getMaxLength());
                straightLane.get(0).add(tmp);
            }
        }


    }


}
