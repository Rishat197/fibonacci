package ru.aminov.fibonacci;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean choice = true;
        while (choice) {
            System.out.println("Введите номер числа Фибоначчи, который хотите узнать:");
            int number = input.nextInt();
            System.out.println(number + "-е число Фибоначчи равно: " + fib(number));
            System.out.println("Нажмите клавишу \"y\", если хотите выйти из программы");
            String character = input.next();
            if (character.equals("y")) {
                break;
            }
        }
    }

    static int fib(int num) {
        if (num <= 1) {
            return num;
        } else {
            return fib(num - 1) + fib(num - 2);
        }
    }

}
