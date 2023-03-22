package singleton.main;

import singleton.Administrator;
import singleton.Soare;

public class Main {
    public static void main(String[] args) {
        Administrator administrator1 =  Administrator.getInstance();
        Administrator administrator2 =  Administrator.getInstance();


        System.out.println(administrator1);
        System.out.println(administrator2);

        Soare soare1 = Soare.getInstance("galben", 1000);
        Soare soare2 = Soare.getInstance("galben", 5000);
        System.out.println(soare1.toString());
        System.out.println(soare2.toString());

    }
}