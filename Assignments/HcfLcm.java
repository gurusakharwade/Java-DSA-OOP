package com.guru;

import java.util.Scanner;

public class HcfLcm {
    public static void main(String[] args) {
        int a, b, num1, num2, temp, hcf, lcm;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        num2 = in.nextInt();

        a = num1;
        b = num2;

        while (b != 0){
            temp = b;
            b = a%b;
            a = temp;
        }
        hcf = a;
        lcm = (num1*num2)/hcf;

        System.out.println("HCF of input numbers: " +hcf);
        System.out.println("LCM of input numbers: " +lcm);
    }
}
