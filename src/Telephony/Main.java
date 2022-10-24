package Telephony;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> num = new LinkedList<>();
        List<String> ur = new LinkedList<>();
        Smartphone smartphone = new Smartphone(num,ur);
        String[] numbers = scanner.nextLine().split("\\s+");
        String[] urls = scanner.nextLine().split("\\s+");


        for (String number : numbers) {
            try {
                smartphone.setNumbers(number);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        }
        for (String url : urls) {
            try {
                smartphone.setUrls(url);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }
        }

        for (String number : smartphone.getNumbers()) {
            System.out.println("Calling... " + number);
        }

        for (String url : smartphone.getUrls()) {
            System.out.println("Browsing: " + url);
        }

    }
}
