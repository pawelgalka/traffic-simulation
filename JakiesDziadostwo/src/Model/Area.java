package src.Model;

import java.util.ArrayList;

public class Area {
    private static int length;
    ArrayList<Road> roads = new ArrayList<>();

    public Area(ArrayList<Road> roads_){
        length=roads_.size();
        roads=roads_;
    }

    public void add(Road x_){
        roads.add(x_);
    }
}
