package vaccination;

import java.io.IOException;

public abstract class Citizen {
    public String name, phoneNo, aadharNo;
    public int age;

    public Citizen(String name, String phoneNo, int age, String aadharNo) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.age = age;
        this.aadharNo = aadharNo;
    }

    public abstract void verifyAge() throws Exception;
}
