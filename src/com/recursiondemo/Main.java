package com.recursiondemo;

public class Main {


    public static void main(String[] args) {
        // write your code here
    System.out.println("factorial of 6 is: "+fact(6));

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
return n*fact(n-1);
        }


    }
}