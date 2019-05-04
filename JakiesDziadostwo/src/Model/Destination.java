package src.Model;

public class Destination {
    private int numberOfJunction;
    private int exit;

    public Destination(int numberOfJunction, int exit) {
        this.numberOfJunction = numberOfJunction;
        this.exit = exit;
    }

    public int getNumberOfJunction() {
        return numberOfJunction;
    }

    public int getExit() {
        return exit;
    }
}
