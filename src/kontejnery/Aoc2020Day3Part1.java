package kontejnery;

import java.util.ArrayList;
import java.util.Scanner;

public class Aoc2020Day3Part1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            lines.add(line);
        }

        int trees = 0;
        int x = 0;
        for (String line : lines) {
            if (line.charAt(x % line.length()) == '#') trees++;
            x += 3;
        }
        System.out.println(trees);
    }
}
