package src.Symulation;

import src.Model.Junction.Junction;
import src.Model.Junction.JunctionStructure;
import src.Model.Road.Road;

public class JunctionView {

    private JunctionStructure x;
    public JunctionView(JunctionStructure x_){
        x=x_;
    }

    public void view(){
        System.out.println("======NORTH======");
        System.out.println(x.getNorth().toString());
        System.out.println("======SOUTH======");
        System.out.println(x.getSouth().toString());
        System.out.println("======WEST======");
        System.out.println(x.getWest().toString());
        System.out.println("======EAST======");
        System.out.println(x.getEast().toString());
    }
}
