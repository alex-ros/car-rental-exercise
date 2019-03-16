package ro.jademy.carrental.shop;

import ro.jademy.carrental.car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Shop {
    // Q: what fields and methods should this class contain?
    Scanner keyboard = new Scanner(System.in);

    List<Car> cars = new ArrayList<>();
    List<User> users = new ArrayList<>();

    public Shop(List<Car> cars, List<User> users) {
        this.cars.addAll(cars);
        this.users.addAll(users);
    }

    public boolean login(String username, String password) {
        return users.contains(new User(username, password));
    }

    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all cars");
        System.out.println("2. List available cars");
        System.out.println("3. List rented cars");
        System.out.println("4. Check income");
        System.out.println("5. Logout");
        System.out.println("6. Exit");
    }

    public void showListMenuOptions() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Rent a car");
        System.out.println("5. Back to previous menu");

    }

    public void calculatePrice(int numberOfDays) {
        // TODO: apply a discount to the base price of a car based on the number of rental days
        // TODO: document the implemented discount algorithm

        // TODO: for a more difficult algorithm, change this method to include date intervals and take into account
        //       weekdays and national holidays in which the discount should be smaller

        // Q: what should be the return type of this method?
    }


    public void listAllCars() {

        for (Car car : cars) {
            System.out.println(car);
        }
        filterCars();
    }

    public void filterCars() {

        showListMenuOptions();
        System.out.println("Select option: ");
        int c = keyboard.nextInt();
        keyboard.nextLine();
        boolean found = false;
        if (c == 1) {
            System.out.println("Enter desired car make: ");
            String mk = keyboard.nextLine();

            for (Car car : cars) {
                if (mk.equals(car.getMake())) {
                    System.out.println(car);
                    found = true;
                }
            }

        } else if (c == 2) {
            System.out.println("Enter desired car model: ");
            String mo = keyboard.nextLine();

            for (Car car : cars) {
                if (mo.equals(car.getModel())) {
                    System.out.println(car);
                    found = true;
                }
            }
        } else if (c == 5) {
            showListMenuOptions();
        }
        if (!found) {
            System.out.println("No such car!");
        }

    }

}

