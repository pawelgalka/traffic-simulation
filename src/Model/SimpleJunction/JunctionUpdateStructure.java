package Model.SimpleJunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JunctionUpdateStructure{
    ArrayList<Junction> listOfJunction;

    public JunctionUpdateStructure(){
        listOfJunction = new ArrayList<>();
    }
    public void addRoad(List<Junction> list){
        listOfJunction.addAll(list);
    }

    public void update(int time){
        listOfJunction.forEach((x) -> x.update(time));
    }

}
