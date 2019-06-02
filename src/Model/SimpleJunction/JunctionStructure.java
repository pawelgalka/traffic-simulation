package Model.SimpleJunction;

import Model.Road.Road;

public class JunctionStructure {
    private Road previous;
    private Road next;
    boolean changeLights = true;

    public JunctionStructure(Road previous, Road next){
        this.previous=previous;
        this.next=next;

        previous.greenLight();
        next.greenLight();
    }

    public JunctionStructure(Road previous, Road next, boolean changeLights){
        this.previous=previous;
        this.next=next;
        this.changeLights=changeLights;

        previous.greenLight();
        next.greenLight();
    }

    public void update(int timer, int maxLightTime){
        try {
            if(timer%maxLightTime==0 && changeLights){
                changeLights();
            }
            previous.greenLight(); // stale zielone
            next.greenLight();  // stale zielone

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void changeLights(){
        if(previous.isRedLight()){
            previous.greenLight();
            next.greenLight();
        }
        else {
            previous.redLight();
            next.redLight();
        }
    }

    public Road getPrevious() {
        return previous;
    }

    public Road getNext() {
        return next;
    }
}
