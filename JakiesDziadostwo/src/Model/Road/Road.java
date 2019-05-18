package src.Model.Road;

import src.Model.Vehicle;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Road {
    private int id;
    protected ArrayList<Road.Lane> leftLanes = new ArrayList<>() ;
    protected ArrayList<Road.Lane> rightLanes = new ArrayList<>();
    private int numberoflanes;

    public void setNumberoflanes(int numberoflanes) {
        this.numberoflanes = numberoflanes;
    }

    public void setRightLanes(ArrayList<Lane> rightLanes) {
        this.rightLanes = rightLanes;
    }

    public void setLeftLanes(ArrayList<Lane> leftLanes) {
        this.leftLanes = leftLanes;
    }

    public Road() {
    }
    public Road(ArrayList lLanes, ArrayList rLanes){
        leftLanes=lLanes;
        rightLanes=rLanes;
    }

    public Road(int id_){
        id=id_;
    }

    public void addLeft(Road.Lane x){
        leftLanes.add(x);
    }

    public void addRight(Road.Lane x){
        rightLanes.add(x);
    }

    public boolean update() throws Exception{
        for (Road.Lane x:leftLanes) {
            x.update();
        }
        for (Road.Lane x:rightLanes) {
            x.update();
        }

        return true;
    }



    public enum DIRECTION {
        LEFT,RIGHT
    }
    public ArrayList<Road.Lane> getLeftLanes() {
        return leftLanes;
    }

    public ArrayList<Road.Lane> getRightLanes() {
        return rightLanes;
    }
    public class Lane {

        Road.DIRECTION dir;
        int id;
        protected HashMap vehiclesOutOfLane = new HashMap ();
        protected int maxLength;
        private Vehicle positionOnRoad[];
        boolean canLeave;


        public int getId() {
            return id;
        }

        public Lane(int maxLength_, Road.DIRECTION x, boolean canLeave_, int id_){
            maxLength=maxLength_;
            id = id_;
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

        public boolean changeLane(int index){
            int nextCar=0;
            for (int i=index+1;i<maxLength;i++){
                if (positionOnRoad[i]!=null){
                    nextCar=i;
                    break;
                }
            }
            Vehicle currVehicle = positionOnRoad[index];

//            System.out.println("Do zmiany "+currVehicle.getVelocity() +" "+ Math.abs(index - nextCar));

            if (nextCar !=0 && currVehicle.getVelocity() >= Math.abs(index - nextCar) -1){
//                System.out.println(currVehicle.getVelocity() +" "+ Math.abs(index - nextCar));
                return true;
            }
            else return false;
        }

        private boolean changeLeft(int index) {

//            System.out.println(index + " " +positionOnRoad[index].getId());

            if (this.dir == DIRECTION.LEFT){
                if (id == 0) return false;

                Lane lane = Road.this.getLeftLanes().get(id-1); //get next left line
                for (int i=index; i> index - Collections.max(Vehicle.getVectorOfMaxes()) && i >= 0; i--){
                    if (lane.positionOnRoad[i] != null){
                        return false;
                    }
                }
                for (int j=index; j<index+getPositionOnRoad()[index].getVelocity()+1; j++){
                    if (lane.positionOnRoad[j] != null){
                        return false;
                    }
                }
            }
            else{
                if (id == 0) return false;

                Lane lane = Road.this.getRightLanes().get(id-1); //get next left line
                for (int i = index; i<index+Collections.max(Vehicle.getVectorOfMaxes()) && i<maxLength; i++){
                    if (lane.positionOnRoad[i] != null){
                        return false;
                    }
                }
                for (int j = index; j>index-getPositionOnRoad()[index].getVelocity()-1 && j>=0; j--){
                    if (lane.positionOnRoad[j] != null){
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean changeRight(int index) {
             // cannot go more right
//            System.out.println(index+ " " +positionOnRoad[index].getId());

            if (dir == DIRECTION.LEFT){
                if (id >= Road.this.getLeftLanes().size()-1) return false;
                Lane lane = Road.this.getLeftLanes().get(id+1); //get next left line
                for (int i=index; i> index - Collections.max(Vehicle.getVectorOfMaxes()) && i >= 0; i--){
                    if (lane.positionOnRoad[i] != null){
                        return false;
                    }
                }
                for (int j=index; j<index+getPositionOnRoad()[index].getVelocity()+1 && j<maxLength; j++){
                    if (lane.positionOnRoad[j] != null){
                        return false;
                    }
                }
            }
            else {
                if (id >= Road.this.getRightLanes().size()-1) return false;

                Lane lane = Road.this.getRightLanes().get(id+1); //get next left line
                for (int i = index; i<index+Collections.max(Vehicle.getVectorOfMaxes()) && i<maxLength; i++){
                    if (lane.positionOnRoad[i] != null){
                        return false;
                    }
                }
                for (int j = index; j>index-getPositionOnRoad()[index].getVelocity()-1 && j>=0; j--){
                    if (lane.positionOnRoad[j] != null) {
                        return false;
                    }
                }
            }
            return true;
        }
        public void update() throws Exception{
            vehiclesOutOfLane = new HashMap ();
            for (int i=positionOnRoad.length-1 ; i>=0 ; i--) {
                if (positionOnRoad[i] != null) {
                    boolean change = changeLane(i);
                    if(change){
//                        System.out.println("ZMIAANANANANANA "+ getPositionOnRoad()[i].getId()+" "+id);
                        boolean l = changeLeft(i);
                        boolean r = changeRight(i);

                        if (l){
                                switch (dir){
                                    case LEFT:{
                                        if(i+positionOnRoad[i].getVelocity()<maxLength){
                                            Road.this.leftLanes.get(id-1).getPositionOnRoad()[i+positionOnRoad[i].getVelocity()] = positionOnRoad[i];//Vehicle)positionOnRoad[i].clone();
                                            positionOnRoad[i]=null;
                                        }
                                        else {
                                            Road.this.leftLanes.get(id-1).vehiclesOutOfLane.putIfAbsent(positionOnRoad[i],positionOnRoad[i].getVelocity()+i-maxLength);
                                            Road.this.leftLanes.get(id-1).getPositionOnRoad()[i] = null;

                                        }
                                        break;
                                    }
                                    case RIGHT:{
                                        if(i+positionOnRoad[i].getVelocity()<maxLength) {
                                            Road.this.rightLanes.get(id-1).getPositionOnRoad()[i + positionOnRoad[i].getVelocity()] = positionOnRoad[i];//Vehicle)positionOnRoad[i].clone();
                                            positionOnRoad[i] = null;
                                        }
                                        else {
                                            Road.this.rightLanes.get(id-1).vehiclesOutOfLane.putIfAbsent(positionOnRoad[i],positionOnRoad[i].getVelocity()+i-maxLength);
                                            Road.this.rightLanes.get(id-1).getPositionOnRoad()[i] = null;

                                        }
                                        break;
                                    }
                                }
                                break;
                            }

                        else if (r){
                            switch (dir){
                                case LEFT:{
                                    if(i+positionOnRoad[i].getVelocity()<maxLength){
                                        Road.this.leftLanes.get(id+1).getPositionOnRoad()[i+positionOnRoad[i].getVelocity()] = positionOnRoad[i];//Vehicle)positionOnRoad[i].clone();
                                        positionOnRoad[i]=null;
                                    }
                                    else {
                                        Road.this.leftLanes.get(id+1).vehiclesOutOfLane.putIfAbsent(positionOnRoad[i],positionOnRoad[i].getVelocity()+i-maxLength);
                                        Road.this.leftLanes.get(id+1).getPositionOnRoad()[i] = null;

                                    }
                                    break;
                                }
                                case RIGHT:{
                                    if(i+positionOnRoad[i].getVelocity()<maxLength) {
                                        Road.this.rightLanes.get(id+1).getPositionOnRoad()[i + positionOnRoad[i].getVelocity()] = positionOnRoad[i];//Vehicle)positionOnRoad[i].clone();
                                        positionOnRoad[i] = null;
                                    }
                                    else {
                                        Road.this.rightLanes.get(id+1).vehiclesOutOfLane.putIfAbsent(positionOnRoad[i],positionOnRoad[i].getVelocity()+i-maxLength);
                                        Road.this.rightLanes.get(id+1).getPositionOnRoad()[i] = null;

                                    }
                                    break;
                                }
                            }
                            break;
                        }

                    }

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

        public Road.DIRECTION getDir() {
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


}