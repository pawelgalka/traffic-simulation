package src.Model;

import src.Model.Lane;

import java.util.ArrayList;

public class Road {
    private int id;
    private ArrayList<Lane> leftLanes = new ArrayList<>() ;
    private ArrayList<Lane> rightLanes = new ArrayList<>();

    public Road(ArrayList lLanes, ArrayList rLanes){
        leftLanes=lLanes;
        rightLanes=rLanes;
    }

    public Road(int id_){
        id=id_;
    }

    public void addLeft(Lane x){
        leftLanes.add(x);
    }

    public void addRight(Lane x){
        rightLanes.add(x);
    }

    public boolean update(){
        for (Lane x:leftLanes) {
            if (!x.update())
                return false;
        }
        for (Lane x:rightLanes) {
            if (!x.update())
                return false;
        }

        return true;
    }

    public ArrayList<Lane> getLeftLanes() {
        return leftLanes;
    }

    public ArrayList<Lane> getRightLanes() {
        return rightLanes;
    }

}
