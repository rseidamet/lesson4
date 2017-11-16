package lesson4homework.counditions;

import java.util.Scanner;

public class condition3 {
    public static void main(String[] args) {
        System.out.print("enter the number 1: ");
        Scanner input1 = new Scanner(System.in);
        int a = input1.nextInt();
        System.out.print("enter the number 2: ");
        Scanner input2 = new Scanner(System.in);
        int b =input2.nextInt();

        if ( a <  b){
            System.out.println("-1");
        }else if (b < a){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
        input1.close();
        input2.close();
    }
}
