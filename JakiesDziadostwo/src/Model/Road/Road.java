package src.Model.Road;

import java.util.ArrayList;

public class Road {
    private int id;
    protected ArrayList<Lane> leftLanes = new ArrayList<>() ;
    protected ArrayList<Lane> rightLanes = new ArrayList<>();

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
            x.update();
        }
        for (Lane x:rightLanes) {
            x.update();
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