package zadanie2;

import zadanie2.Cake;

import java.util.Scanner;

public class CakeTesr {
    public static void main(String[] args) {
        Cake[] cakes = new Cake[3];

        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < cakes.length; i++) {

            System.out.print("Podaj nazwę ciastka: ");
            String name = scanner.nextLine();
            System.out.print("Czy ma krem ?");
            boolean cream = scanner.nextBoolean();
            scanner.nextLine();
            System.out.print("Ile jest ciastek? ");
            int count = scanner.nextInt();
            scanner.nextLine();
            cakes[i] = new Cake(name, cream, count);
            for (int j = 0; j < i; j++) {
                if (cakes[i].equals(cakes[j])) {
                    System.out.println("Takie ciastko już istnieje, podaj inne:");
                    i = i - 1;
                }
            }
        }

        System.out.println(cakes[0].toString());
        System.out.println(cakes[1].toString());
        System.out.println(cakes[2].toString());

    }
}
