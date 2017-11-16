package lesson4homework.cycle;

import java.util.Scanner;

public class cycle3 {
    public static void main(String[] args) {
        System.out.println("enter number 1: ");
        Scanner input1 = new Scanner(System.in);
        int from = input1.nextInt();
        System.out.println("enter number 2: ");
        Scanner input2 = new Scanner(System.in);
        int to = input2.nextInt();
        for (from=from ; to>=from;from++ ) {
            System.out.println(from);
        }

        input1.close();
        input2.close();
    }
}
