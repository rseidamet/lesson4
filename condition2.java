package lesson4homework.counditions;

import java.util.Scanner;

public class condition2 {
    public static void main(String[] args) {
        System.out.print("enter the number 1: ");
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();
        System.out.print("enter the number 2: ");
        Scanner input2 = new Scanner(System.in);
        int b = input2.nextInt();
        System.out.print("enter the number 3: ");
        Scanner input3 = new Scanner(System.in);
        int c = input3.nextInt();
        if ( a < b && a < c){
            System.out.println(a);
        }else if (b < a && b < c){
            System.out.println(b);
        }else if (c < a && c < b){
            System.out.println(c);
        }else {
            System.out.println(a + "=" +b + "=" + c );
        }
        input1.close();
        input2.close();
        input3.close();
    }

}
