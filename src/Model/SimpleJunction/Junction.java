package Model.SimpleJunction;

public class Junction {
    protected ManagerOf3Lanes managerOf3Lanes;
    protected JunctionStructure junctionStructure;
    final int maxLightsTime;
    private boolean greenLights = false;

    public Junction(JunctionStructure roads,int maxLightsTime) {
        this.junctionStructure=roads;
        this.maxLightsTime = maxLightsTime;
        managerOf3Lanes = new ManagerOf3Lanes(junctionStructure);
    }

    public void update(int time){

        junctionStructure.update(time,maxLightsTime);
        managerOf3Lanes.toNextRoad();


    }
}
