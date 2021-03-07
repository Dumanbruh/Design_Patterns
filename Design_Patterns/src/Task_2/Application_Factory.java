package Task_2;

import java.util.Scanner;

public class Application_Factory {
    static Scanner sc = new Scanner(System.in);
    static Factory factory;

    public static void main(String[] args) {
        System.out.println("What kind of animal do you need ?");
        System.out.println("1: Cat");
        System.out.println("2: Dog");
        int num = sc.nextInt();

        if (num == 1) { factory = new CatFactory(); }
        else if (num == 2) { factory = new DogFactory(); }
        else {
            System.out.println("Error");
        }

        factory.playSound();
    }
}
