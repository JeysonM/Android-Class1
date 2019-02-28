package ucb.bo.edu.firstproject;

import java.util.Date;

public class Student {

    private String name;
    private long number_account;
    private Date birthdate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumber_account() {
        return number_account;
    }

    public void setNumber_account(long number_account) {
        this.number_account = number_account;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
