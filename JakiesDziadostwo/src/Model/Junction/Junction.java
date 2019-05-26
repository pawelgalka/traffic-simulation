package src.Model.Junction;

public class Junction {
    private TurnOnJunction4Roads turnOnJunction4Roads;
    private JunctionStructure roads;
    final int maxLightsTime;
    private boolean greenLights = false;

    //TODO <- stala liczba dróg!
    public Junction(JunctionStructure roads, int maxLightsTime) {
        this.roads = roads;
        this.maxLightsTime = maxLightsTime;
        turnOnJunction4Roads = new TurnOnJunction4Roads(roads);

    }

    public void update(int time){
        roads.update(time,10);
    }


}
