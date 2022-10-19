package TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] ligths = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        List<Traffic> result = new ArrayList<>();

        for (int i = 0; i < ligths.length; i++) {
            result.add(new Traffic(Lights.valueOf(ligths[i])));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < result.size(); j++) {
                result.get(j).changeColor(result.get(j).getColor());
            }
            System.out.println(result.stream().map(Traffic::getColor).map(Enum::name).collect(Collectors.joining(" ")));
        }
    }
}
