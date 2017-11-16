package lesson4homework.cycle;

import java.util.Scanner;

public class cycle7 {
    public static void main(String[] args) {
        System.out.println("enter number 1 : ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("enter number 2 : ");
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();
        int c = a % 10;
        if (c == 1 || c == 3 || c == 5 || c == 7 || c == 9) {
            a = a + 1;
            for (a = a; b >= a; a=a+2) {
                System.out.println(a);
            }
        } else {
            for (a = a; b >= a; a=a+2) {
                System.out.println(a);
            }
        }
    }
}
