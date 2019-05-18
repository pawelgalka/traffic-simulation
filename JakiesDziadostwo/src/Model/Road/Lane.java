package src.Model.Road;

import src.Model.Vehicle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Lane {
    protected HashMap  vehiclesOutOfLane = new HashMap ();
    protected int maxLength;
    private Vehicle positionOnRoad[];
    boolean canLeave;

    DIRECTION dir;

    public enum DIRECTION {
        LEFT,RIGHT
    }

    public Lane(int maxLength_,DIRECTION x,boolean canLeave_){
        maxLength=maxLength_;
        positionOnRoad=new Vehicle[maxLength];
        dir = x;
        canLeave=canLeave_;
    }

    public HashMap getAndClearVehiclesOutOfLane() {
        HashMap tmp = vehiclesOutOfLane;
        tmp.forEach((x,y) -> System.out.println(x));
        vehiclesOutOfLane.clear();
        return tmp;
    }

    public void update(){
        vehiclesOutOfLane = new HashMap ();
        for (int i=positionOnRoad.length-1 ; i>=0 ; i--) {
            if (positionOnRoad[i] != null) {
                accelerate(i);
                randomslow(i);
                decelerate(i);
                int nextPos=moveOrReturnPosition(i);
                if (nextPos!=-1){
                    //System.out.println(nextPos);
                    vehiclesOutOfLane.putIfAbsent(positionOnRoad[i],positionOnRoad[i].getVelocity()+i-maxLength);
                    positionOnRoad[i]=null;
                }
            }
        }
    }

    private void accelerate(int index){
        positionOnRoad[index].accelerate();
    }

    private void decelerate(int index) {
        int nextCar=0;
        for (int i=index+1;i != maxLength && i<maxLength;i++){
            if (positionOnRoad[i]!=null){
                nextCar=i;
                break;
            }
        }
        Vehicle currVehicle = positionOnRoad[index];
        if (nextCar !=0 && currVehicle.getVelocity() >= Math.abs(index - nextCar) ) {
            currVehicle.setVelocity(0);
        }
        else if(nextCar == 0){
            if (index+currVehicle.getVelocity()>=maxLength && !canLeave){
                currVehicle.setVelocity(maxLength-1-index);
            }
        }

    }

    private void randomslow(int index){
        if (positionOnRoad[index].getSlowProbability()>Math.random()){
            positionOnRoad[index].setVelocity(positionOnRoad[index].getVelocity()-1);
        }
    }

    protected int moveOrReturnPosition(int index){
        Vehicle tmp= positionOnRoad[index];
        if(tmp==null)
            System.out.println(index);
        if (index+tmp.getVelocity() < maxLength){
            positionOnRoad[index]=null;
            positionOnRoad[index+tmp.getVelocity()]=tmp;
        }
        else
            return index;
        return -1;
    }

    public boolean addVehice(Vehicle x){
        if (positionOnRoad[0]==null){
            positionOnRoad[0]=x;
            return true;
        }
        return false;
    }

    public boolean addVehice(Vehicle x,int pos){
        if (positionOnRoad[pos]==null){
            positionOnRoad[pos]=x;
            return true;
        }
        return false;
    }

    //TODO
    public boolean isAvaliableSpace(){
        return true;
    }

    public DIRECTION getDir() {
        return dir;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void redLight(){
        canLeave = false;
    }

    public Vehicle[] getPositionOnRoad() {
        return positionOnRoad;
    }

    public HashMap getVehiclesToJunction() {
        return vehiclesOutOfLane;
    }
}
