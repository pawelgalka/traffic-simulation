package src.Model;

import java.util.HashSet;

public class Vehicle implements Cloneable {
    final private int id;
    //private int positionX;
    private int velocity;
    private int maxVelocity;
    final private double slowProbability;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    static HashSet<Integer> vectorOfMaxes = new HashSet<>();
    public int getMaxVelocity() {
        return maxVelocity;
    }


    public static HashSet<Integer> getVectorOfMaxes() {
        return vectorOfMaxes;
    }
    private enum TURN{
        LEFT,FORWARD,RIGHT,AROUND;
    }


    public Vehicle(int id_, int velocity_, int maxVelocity_) {
        id = id_;
        velocity = velocity_;
        maxVelocity = maxVelocity_;
        slowProbability = 0.05;
        vectorOfMaxes.add(maxVelocity_);
    }

    public Vehicle(int id_, int velocity_, int maxVelocity_,int slowProbability_) {
        id = id_;
        velocity = velocity_;
        maxVelocity = maxVelocity_;
        slowProbability = slowProbability_;
        vectorOfMaxes.add(maxVelocity_);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Vehicle))
            return false;

        return id == ((Vehicle)o).id;
    }

    @Override
    public int hashCode() {
        return 13*Integer.hashCode(id);
    }

    public void accelerate(){
        if(velocity+1 >= maxVelocity)
            velocity=maxVelocity;
        else
            velocity += 1;
    }

    public boolean decreaseAcceleration(int value_){
        if (velocity-value_>0) {
            velocity = velocity - value_;
            return true;
        }
        return false;
    }

    public double getSlowProbability() {
        return slowProbability;
    }

    public void decelerate(){
        if(slowProbability > Math.random()){
            velocity -= 1;
        }
    }

    public void changeVelocity(){
        accelerate();
        decelerate();
    }



    public int getId() {
        return id;
    }


    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return id + " " +velocity;
    }
}
