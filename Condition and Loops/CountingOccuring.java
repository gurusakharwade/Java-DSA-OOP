package com.guru;

public class CountingOccuring {
    public static void main(String[] args) {
        int n = 45536;  // repeated number will be counted in output

        int count = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem == 5) {
                count++;
            }
            n = n / 10; // n /= 10
        }
        System.out.println(count);
    }
}
