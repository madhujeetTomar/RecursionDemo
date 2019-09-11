package com.recursiondemo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            int f = 1;
            for (int i = 0; i < n; i++) {
                if (k == a[i]) {
                    System.out.println(i);
                    f = 0;
                    break;
                }
            }
            if (f == 1)
                System.out.println("-1");
        }

  /*  System.out.println("factorial of 6 is: "+fact(6));
 square(12);*/
}

    /**
     * Below function is used to find factorial of n using recursion
     * @param n is the number to find factorial
     * @return factorial of n
     */
    private static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    /**
     *
     * @param n
     * @return square in descending order
     */
        private static int square(int n) {
           if(n==0)
           {
               return 0;
           }
           else {
               System.out.println("Square of " + n + " is: " + n * n);
               return square(n - 1);
           }
        }
/*

        private static int findNumUsingBinarySearch(int[] n, int k)
        {
            for (int i = 0; i <n.length ; i++) {

                if

            }
            return 0;
        }
*/


    }
