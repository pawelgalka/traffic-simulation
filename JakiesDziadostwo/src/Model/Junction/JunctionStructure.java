package src.Model.Junction;

import src.Model.Road.Road;

public class JunctionStructure {
    private Road west;
    private Road east;
    private Road south;
    private Road north;


    public JunctionStructure(Road west, Road east, Road south, Road north) {
        this.west = west;
        this.east = east;
        this.south = south;
        this.north = north;

        west.redLight();
        east.redLight();
        north.greenLight();
        south.greenLight();
    }

    //TODO throw exception ?
    public void update(int timer, int maxLightTime){
        try {
            if(timer%maxLightTime==0){
                changeLights();
            }
            System.out.println("junctionStructure");
            west.update();
            east.update();
            south.update();
            north.update();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void changeLights(){
        if(west.isRedLight()){
            west.greenLight();
            east.greenLight();
            south.redLight();
            north.redLight();
        }
        else {
            west.redLight();
            east.redLight();
            south.greenLight();
            north.greenLight();
        }
    }


    public Road getWest() {
        return west;
    }

    public Road getEast() {
        return east;
    }

    public Road getSouth() {
        return south;
    }

    public Road getNorth() {
        return north;
    }

    public int getNumberOfLanes(){
        return west.getNumberOfLanes()+east.getNumberOfLanes()+
                south.getNumberOfLanes()+north.getNumberOfLanes();
    }
}
