package src.Model;

public class Vehicle {
    final private int id;
    private int positionX;
    private int velocity;
    private int maxVelocity;
    final private double slowProbability;



    private enum TURN{
        LEFT,FORWARD,RIGHT,AROUND;
    }


    public Vehicle(int id_, int positionX_, int velocity_, int maxVelocity_) {
        id = id_;
        positionX = positionX_;
        velocity = velocity_;
        maxVelocity = maxVelocity_;
        slowProbability = 0.05;
    }

    public Vehicle(int id_, int positionX_, int velocity_, int maxVelocity_,int slowProbability_) {
        id = id_;
        positionX = positionX_;
        velocity = velocity_;
        maxVelocity = maxVelocity_;
        slowProbability = slowProbability_;
    }

    public int check(Vehicle o){
        if(positionX+velocity < o.positionX+o.velocity)
            return 0;
        return o.positionX+o.velocity - positionX+velocity -1;
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

    public void move(){
        //TODO sprawdzanie czy koniec drogi
        positionX += velocity;
    }

    public int getId() {
        return id;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    @Override
    public String toString() {
        return id + " " + positionX+ " " + velocity;
    }
}
