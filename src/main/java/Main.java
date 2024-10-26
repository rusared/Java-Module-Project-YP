package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 1; i <= 3; i = i + 1) {
            System.out.println(String.format("Введите название машины №%d:", i));
            String name = scanner.next();
            System.out.println(String.format("Введите скорость машины №%d:", i));
            while (true) {
                int speed = scanner.nextInt();
                Car car = new Car(name, speed);
                if (speed >= 0 && speed <= 250) {
                    race.raceLeader(car);
                    break;
                }
                System.out.println("Некорректная скорость!\nДопустимая скорость для автомобилей от 0 до 250 км/ч.\nПожалуйста, повторите ввод.");
            }

        }

        System.out.println(String.format("Самая быстрая машина: %s", race.getLeader()));
    }
}
