package test.muhammed.com.recyclerviewexample.models;

/**
 * Created by muhammed on 6/8/2017.
 */

public class UserModel {
    private String name;
    private String number;

    public UserModel(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public UserModel() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
