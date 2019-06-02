package Model.Road;

import java.util.ArrayList;

public class RoadUpdateStructure {
    ArrayList<Road> listOfRoads;
    public RoadUpdateStructure(){
        listOfRoads = new ArrayList<>();
    }
    public void addRoad(Road road){
        listOfRoads.add(road);
    }


    public void update(){
        listOfRoads.forEach((x) -> {
            try {
                x.update();
            } catch (Exception e) {
                throw new RuntimeException("Coś kurwa nie gra!!");
                //TODO zmienic komunikat
            }
        });
    }

}
