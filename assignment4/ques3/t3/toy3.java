package t3;

public class toy3 {
    private String toytype;

    public void setToytype(String tt) {
        this.toytype = tt;
    }

    public String getToytype() {
        return toytype;
    }

    public void dis() {
        System.out.println("Type of toy is: " + toytype);
    }
}
