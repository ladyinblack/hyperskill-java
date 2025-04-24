import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cups = sc.nextInt();
        boolean isWeekend = sc.nextBoolean();

        boolean result = false;
        if (cups >= 10 && cups <= 20 && !isWeekend) {
            System.out.println("Is Not Weekend and between 10 and 20 peanut butter cups 😄");
            result = true;
        } else if (cups >= 15 && cups <= 25 && isWeekend) {
            System.out.println("Is Weekend and between 15 and 20 peanut butter cups 😋");
            result = true;
        } else {
            System.out.println("No peanut butter cups 😭");
            result = false;
        }

        System.out.println(result);

        sc.close();
    }
}
