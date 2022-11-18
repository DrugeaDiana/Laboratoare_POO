import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random(20);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNum = scanner.nextInt();

        switch(taskNum) {
            case 1:
                // TODO: uncomment for Task1
                Car mercedes = new Car(20000, Car.CarType.MERCEDES, 2019);
                Car fiat = new Car(7000, Car.CarType.FIAT, 2020);
                Car skoda = new Car(12000, Car.CarType.SKODA, 2022);
                Dealership dealership = new Dealership();
                break;
            case 2:
                // TODO: uncomment for Task2
                dealership = new Dealership();
                Car mercedes1 = new Car(20000, Car.CarType.MERCEDES, 2010);
                Car mercedes2 = new Car(35000, Car.CarType.MERCEDES, 2015);
                Car fiat1 = new Car(3500, Car.CarType.FIAT, 2008);
                Car fiat2 = new Car(7000, Car.CarType.FIAT, 2010);
                Car skoda1 = new Car(12000, Car.CarType.SKODA, 2015);
                Car skoda2 = new Car(25000, Car.CarType.SKODA, 2021);
                dealership.getFinalPrice(mercedes1);
                dealership.getFinalPrice(mercedes2);
                dealership.getFinalPrice(fiat1);
                dealership.getFinalPrice(fiat2);
                dealership.getFinalPrice(skoda1);
                dealership.getFinalPrice(skoda2);
                break;
            case 3:
                // TODO: uncomment for Task3
                dealership = new Dealership();
                // TODO: write solution for Task3 here
                Car mercedes3 = new Car(20000, Car.CarType.MERCEDES, 2019);
                dealership.negotiate(mercedes3, new Offer() {
                    @Override
                    public int getDiscount(Car car) {
                        return car.getPrice() * 5 / 100;
                    }
                });
                break;
            case 4:
                // TODO: write solution for Task4 here
                Car mercedes4 = new Car(30000, Car.CarType.MERCEDES, 2019);
                Car mercedes5 = new Car(50000, Car.CarType.MERCEDES, 2021);
                Car fiat3 = new Car(10000, Car.CarType.FIAT, 2018);
                Car skoda3 = new Car(20000, Car.CarType.SKODA, 2019);
                ArrayList<Car> cars= new ArrayList<>();
                cars.add(skoda3);
                cars.add(mercedes4);
                cars.add(mercedes5);
                cars.add(fiat3);
                cars.forEach((System.out::println));
                cars.removeIf(car -> car.getPrice() > 25000);
                cars.forEach(System.out::println);
                break;
        }
    }
}