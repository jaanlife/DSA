package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Fibonacci {
    public static long[] fibonacciCash;
    public static long fibonacci(int n){
        if(n <= 1){
            return n;
        }
        if (n == 0) {
            return n;
        }

        return (fibonacci (n-1) + fibonacci(n-2));
    }
    public static void main(String[] args) {
        int n = 7;

        fibonacci(n);

        System.out.println(fibonacci(n)+"");

    }

}
