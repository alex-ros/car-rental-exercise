package ro.jademy.carrental;

import ro.jademy.carrental.car.Car;
import ro.jademy.carrental.car.dacia.Duster;
import ro.jademy.carrental.car.dacia.Logan;
import ro.jademy.carrental.car.renault.Clio;
import ro.jademy.carrental.shop.Shop;
import ro.jademy.carrental.shop.User;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Logan(2010, "Diesel", 4, "black", "1.3", 2500),
                new Clio(2014, "Gas", "yellow", "automatic", "1.9", 10500),
                new Duster(2010, "Diesel", "blue", "automatic", "1.4",4000 )

        );





        List<User> users = Arrays.asList(
                new User("usr1", "123"),
                new User("usr2", "234"),
                new User("usr3", "345"));


        // Q: this is the main entry point of our program. What should we do here?
        Scanner keyboard = new Scanner(System.in);
        Shop s1 = new Shop(cars, users);
        boolean isLoggedIn = false;
        boolean running = true;

        while (running) {
            if (!isLoggedIn) {
                System.out.println("Enter username: \t");
                String username = keyboard.nextLine();
                System.out.println("Enter password: \t");
                String password = keyboard.nextLine();
                if (s1.login(username, password)) {
                    isLoggedIn = true;
                } else System.out.println("Try again!");

            } else {

                s1.showMenu();
                int k = keyboard.nextInt();
                keyboard.nextLine();

                if (k == 1) {
                    s1.listAllCars();
                } else if (k == 5) {
                    isLoggedIn = false;
                    System.out.println("Goodbye!");
                } else if (k == 6) {
                    running = false;
                }
            }


        }
    }


}

