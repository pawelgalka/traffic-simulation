package Model.SimpleJunction;

import Model.Road.Road;

public class ManagerOf3Lanes {
    private LaneManager firstRightLane;
    private LaneManager secondRightLane;
    private LaneManager thirdRightLane;

    private LaneManager firstLeftLane;
    private LaneManager secondLeftLane;
    private LaneManager thirdLeftLane;

    public ManagerOf3Lanes(JunctionStructure junctionStructure){
        firstRightLane = new LaneManager(junctionStructure.getPrevious().getRightLanes().get(0),
                junctionStructure.getNext().getRightLanes().get(0),true);

        secondRightLane = new LaneManager(junctionStructure.getPrevious().getRightLanes().get(1),
                junctionStructure.getNext().getRightLanes().get(1),false);

        thirdRightLane = new LaneManager(junctionStructure.getPrevious().getRightLanes().get(2),
                junctionStructure.getNext().getRightLanes().get(2),true);


        firstLeftLane = new LaneManager(junctionStructure.getPrevious().getLeftLanes().get(0),
                junctionStructure.getNext().getLeftLanes().get(0),true);

        secondLeftLane = new LaneManager(junctionStructure.getPrevious().getLeftLanes().get(1),
                junctionStructure.getNext().getLeftLanes().get(1),false);

        thirdLeftLane = new LaneManager(junctionStructure.getPrevious().getLeftLanes().get(2),
                junctionStructure.getNext().getLeftLanes().get(2),true);
    }

    public void toNextRoad(){

        firstRightLane.toNextLane();
        secondRightLane.toNextLane();
        thirdRightLane.toNextLane();

        firstLeftLane.toNextLane();
        secondLeftLane.toNextLane();
        thirdLeftLane.toNextLane();
    }
}
