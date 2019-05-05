package src.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Lane {
    private ArrayList <Vehicle> listOfVehicles = new ArrayList<>();
    private int maxLength;
    DIRECTION dir;

    public Lane(int maxLength_,DIRECTION x){
        maxLength=maxLength_;
        dir = x;
    }

    public enum DIRECTION {
        LEFT,RIGHT
    }

    public Lane add(Vehicle x){
        listOfVehicles.add(x);
        return this;
    }

    private void accelerate(int index){
        listOfVehicles.get(index).accelerate();
    }

    private void decelerate(int index) {
        if (index == 0) return;
        else {
            Vehicle currentVehicle = listOfVehicles.get(index);
            Vehicle previousVehicle = listOfVehicles.get(index-1);

            if (currentVehicle.getVelocity() >= Math.abs(currentVehicle.getPositionX() - previousVehicle.getPositionX()) ) {
                System.out.println(currentVehicle.getPositionX()+ " " + currentVehicle.getVelocity() +" "+ previousVehicle.getPositionX() + " " + previousVehicle.getVelocity());
                currentVehicle.setPositionX(listOfVehicles.get(index).getPositionX());
                currentVehicle.setVelocity(0);
            }
        }
    }
    private void randomslow(int index){
        if (listOfVehicles.get(index).getSlowProbability()>Math.random()){
            listOfVehicles.get(index).setVelocity(listOfVehicles.get(index).getVelocity()-1);
        }
    }

    private void move(int index){
        listOfVehicles.get(index).setPositionX(listOfVehicles.get(index).getPositionX()+listOfVehicles.get(index).getVelocity());
    }
    public boolean update(){
        ArrayList remove = new ArrayList();
        for (int i=0;i<listOfVehicles.size();i++){
            accelerate(i);
            decelerate(i);
            randomslow(i);
            move(i);

            if(listOfVehicles.get(i).getPositionX()>=maxLength)
                remove.add(listOfVehicles.get(i));
        }
        listOfVehicles.removeAll(remove);


        return true;
    }

    public DIRECTION getDir() {
        return dir;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public ArrayList<Vehicle> getListOfVehicles() {
        return listOfVehicles;
    }

    public void redLight(){
        Vehicle tmp = listOfVehicles.get(0);
        if (tmp.getPositionX()+tmp.getVelocity()>=49) {
            listOfVehicles.get(0).setPositionX(49);
            listOfVehicles.get(0).setVelocity(0);
        }
    }


}
