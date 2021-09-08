package vaccination;

public class Vaccine extends Citizen {
    public Vaccine(String name, String aadharNo, String phoneNo, int age) {
        super(name, phoneNo, age, aadharNo);
    }
    public void verifyAge() throws Exception {
        if(age<18) throw new Exception(name + ", aged " + age + ", is too young for vaccination");
        System.out.println(name + ", aged " + age + ", can be vaccinated");
    }
}
