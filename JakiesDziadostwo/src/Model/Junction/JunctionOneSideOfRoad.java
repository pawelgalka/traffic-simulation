package src.Model.Junction;

import src.Model.Road.Road;
import src.Model.Vehicle;

import java.util.ArrayList;

public class JunctionOneSideOfRoad{

    /*
    private int id;
    ArrayList<JunctionLane> junctionLanes = new ArrayList<>();
    ArrayList<Lane> laneAfterLeftTurn = new ArrayList<>();
    ArrayList<Lane> laneAfterRightTurn = new ArrayList<>();
    ArrayList<Lane> straightLane = new ArrayList<>();


    private JunctionOneSideOfRoad(final Builder builder){
        this.id=builder.id;
        this.junctionLanes=builder.junctionLanes;
        this.laneAfterLeftTurn=builder.laneAfterLeftTurn;
        this.laneAfterRightTurn=builder.laneAfterRightTurn;
        this.straightLane=builder.straightLane;
    }

    public void update(){
        junctionLanes.forEach(x->x.update());
        straightLane.forEach(x->x.update());
    }

    public static class Builder
    {
        private int id;
        ArrayList<JunctionLane> junctionLanes = new ArrayList<>();
        ArrayList<Lane> laneAfterLeftTurn = new ArrayList<>();
        ArrayList<Lane> laneAfterRightTurn = new ArrayList<>();
        ArrayList<Lane> straightLane = new ArrayList<>();

        public Builder(final int id){
            this.id=id;
        }

        public Builder lanes(final ArrayList junctionLanes){
            this.junctionLanes=junctionLanes;
            return this;
        }

        public Builder rightLanes(final ArrayList laneAfterRightTurn){
            this.laneAfterRightTurn=laneAfterRightTurn;
            return this;
        }

        public Builder leftLanes(final ArrayList laneAfterLeftTurn){
            this.laneAfterLeftTurn=laneAfterLeftTurn;
            return this;
        }

        public Builder straightLanes(final ArrayList straightLane){
            this.straightLane=straightLane;
            return this;
        }

        public JunctionOneSideOfRoad build(){
            return new JunctionOneSideOfRoad(this);
        }
    }
    */
}
