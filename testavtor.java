package lab2;

import java.lang.*;
public class testavtor {
    public static void main(String[] args){
        Avtor a1 = new Avtor("Vanya","vanya@mail.ru", '6');
        System.out.println("Author is " +a1.getName()
                + ", email:" +a1.getEmail()
                + ", gender:" +a1.getGender());
        Avtor a2 = new Avtor("Sasha", "sasha@mail.ru",'8');
        System.out.println("Author is " +a2.getName()
                + ", email:" +a2.getEmail()
                + ", gender:" +a2.getGender());
        Avtor a3 = new Avtor("Rita", "rit@mail.ru",'4');
        System.out.println("Author is " +a3.getName()
                + ", email:" +a3.getEmail()
                + ", gender:"+a3.getGender());
    }
}
