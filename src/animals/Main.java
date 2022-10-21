package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("Beast!")) {
            String[] command = input.split("\\s+");

            try {
                switch (command[0]) {
                    case "Cat":
                        command = scanner.nextLine().split("\\s+");
                        Cat cat = new Cat(command[0], Integer.parseInt(command[1]), command[2]);
                        System.out.println(cat.toString());
                        System.out.println(cat.produceSound());
                        break;
                    case "Dog":
                        command = scanner.nextLine().split("\\s+");
                        Dog dog = new Dog(command[0], Integer.parseInt(command[1]), command[2]);
                        System.out.println(dog.toString());
                        System.out.println(dog.produceSound());
                        break;
                    case "Kittens":
                        command = scanner.nextLine().split("\\s+");
                        Kitten kitten = new Kitten(command[0], Integer.parseInt(command[1]));
                        System.out.println(kitten.toString());
                        System.out.println(kitten.produceSound());
                        break;
                    case "Frog":
                        command = scanner.nextLine().split("\\s+");
                        Frog frog = new Frog(command[0], Integer.parseInt(command[1]), command[2]);
                        System.out.println(frog.toString());
                        System.out.println(frog.produceSound());
                        break;
                    case "Tomcat":
                        command = scanner.nextLine().split("\\s+");
                        Tomcat tomcat = new Tomcat(command[0], Integer.parseInt(command[1]));
                        System.out.println(tomcat.toString());
                        System.out.println(tomcat.produceSound());
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }

            input = scanner.nextLine();
        }

    }
}

