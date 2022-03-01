package by.kustarev.hw;

/*
    Написать программу для проверки на валидность введенного ip адреса.
    Пусть ip адрес задается с консоли.
    Программа должна проверять валидность введенного ip адреса с
    помощью регулярного выражения и выводить результат проверки на экран.
* */

import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Введите IP-адрес!\nШаблон адреса 255.255.255.255");
        String input = scanner.nextLine();
        System.out.println(input.matches(
        "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"));
        scanner.close();


        // начало строки ^
        // (условие|условие|условие) - или
        //
        // ([01]?\d\d?|2[0-4]\d|25[0-5])

    }

}
