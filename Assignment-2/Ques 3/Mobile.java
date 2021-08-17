public class Mobile {
    public String username;
    private double cost;
    private String camera;


    Mobile(String username, double cost, String camera){
        this.username = username;
        this.cost = cost;
        this.camera = camera;
    }

    void display(){
        System.out.println("Username: " + username);
        System.out.println("Cost: " + cost);
        System.out.println("Camera: " + camera);
    }
    
}


