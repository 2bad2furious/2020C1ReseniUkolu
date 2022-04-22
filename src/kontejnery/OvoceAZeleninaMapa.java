package kontejnery;

import java.util.HashMap;
import java.util.Scanner;

public class OvoceAZeleninaMapa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String /* název */, String /* typ */> ovoceAZelenina = new HashMap<>();

        /*
        {
            jablko: ovoce
        }
         */

        while (true) {
            String input = sc.next();
            if (input.equals("end")) break;

            // TODO check duplicity and warn
            ovoceAZelenina.put(input, "ovoce");
        }

        while (true) {
            String input = sc.next();
            if (input.equals("end")) break;

            if (ovoceAZelenina.containsKey(input)) {
                // TODO check whether it's a fruit or a vegetable
                System.out.println("Už je uloženo");
            } else {
                ovoceAZelenina.put(input, "zelenina");
            }
        }

        while (true) {
            String input = sc.next();
            if (input.equals("end")) break;

            System.out.println(ovoceAZelenina.getOrDefault(input, "Neobsahuje"));
        }

    }
}
