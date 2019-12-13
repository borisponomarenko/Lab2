package lab2;

import java.lang.*;
public class Avtor {
    private String name;
    private String email;
    private char gender;

    public Avtor() {
        name = "liza";
        email = "liza@mail.ru";
        gender = 's';
    }
    public Avtor(String n) {
        name = n;
        email = "liza@mail.ru";
        gender = 'a';
    }
    public Avtor(String n, String e){
        name = n;
        email = e;
        gender = 'u';
    }
    public Avtor(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public String getEmail(){
        return email;

    }
    public char getGender(){
        return gender;
    }

    @Override
    public String toString() {
        return "Avtor @ ("+this.name+", "+this.email+").";
    }
}
