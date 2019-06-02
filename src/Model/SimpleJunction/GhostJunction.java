package Model.SimpleJunction;

public class GhostJunction extends Junction {
    public GhostJunction(JunctionStructure roads) {
        super(roads, 0);
    }
    public void update(int time){
        managerOf3Lanes.toNextRoad();
    }
}
