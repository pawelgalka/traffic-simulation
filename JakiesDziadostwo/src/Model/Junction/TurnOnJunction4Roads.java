package src.Model.Junction;

import src.Model.Road.Road;

public class TurnOnJunction4Roads {
    JunctionStructure junctionStructure;
    private TurnOnJunction west;
    private TurnOnJunction east;
    private TurnOnJunction south;
    private TurnOnJunction north;

    public TurnOnJunction4Roads(JunctionStructure junctionStructure) {
        this.junctionStructure=junctionStructure;

        //South -> North || East
        if(junctionStructure.getSouth().getNumberOfLanes()==1){
            Road northRoad = junctionStructure.getNorth();
            Road eastRoad = junctionStructure.getEast();

            south=new TurnOnJunction(northRoad.getRightLanes().get(0),
                    eastRoad.getRightLanes().get(0));
        }

        //North ->South || West
        if(junctionStructure.getNorth().getNumberOfLanes()==1){
            Road southRoad = junctionStructure.getSouth();
            Road westRoad = junctionStructure.getWest();

            south=new TurnOnJunction(southRoad.getRightLanes().get(0),
                    westRoad.getRightLanes().get(0));
        }

        //East -> West || North
        if(junctionStructure.getEast().getNumberOfLanes()==1){
            Road northRoad = junctionStructure.getNorth();
            Road westRoad = junctionStructure.getWest();

            south=new TurnOnJunction(westRoad.getRightLanes().get(0),
                    northRoad.getRightLanes().get(0));
        }

        //West ->South || East
        if(junctionStructure.getWest().getNumberOfLanes()==1){
            Road southRoad = junctionStructure.getSouth();
            Road eastRoad = junctionStructure.getEast();

            south=new TurnOnJunction(eastRoad.getRightLanes().get(0),
                    southRoad.getRightLanes().get(0));
        }

    }

    public TurnOnJunction getWest() {
        return west;
    }

    public TurnOnJunction getEast() {
        return east;
    }

    public TurnOnJunction getSouth() {
        return south;
    }

    public TurnOnJunction getNorth() {
        return north;
    }
}
