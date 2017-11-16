package lesson4homework.counditions;

import java.util.Scanner;

public class condition4 {
    public static void main(String[] args) {
        System.out.println("enter the number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n >= 100 && n <= 200 ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        input.close();
    }
}
