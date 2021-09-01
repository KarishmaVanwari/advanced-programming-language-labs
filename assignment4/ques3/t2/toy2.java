package t2;

public class toy2 {
    private String name;
    private double cost;

    public void setName(String na) {
        this.name = na;
    }

    public void setCost(double co) {
        this.cost = co;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void display() {
        System.out.println("Name of the toy: " + name + "\nCost of the toy: Rs." + cost);
    }
}