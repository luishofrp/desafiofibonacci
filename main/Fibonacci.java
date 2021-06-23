package main;

public class Fibonacci {

    static long regraF(int n) {
        int F = 0;     
        int na = 0;   

        for (int i = 1; i <= n; i++) {

            if (i == 1) {
                F = 1;
                na = 0;

            } else {
                F += na;
                na = F - na;
            }

        }

        return F;
    }

    public static void main(String[] args) {

	//  No exemplo, a contagem foi até fib(6) portanto i < 7
        System.out.println("=====================================");
        System.out.println("Os numeros até fib(6) do Desafio:");
    	for (int i = 0; i < 7; i++) {
            System.out.println("fib(" + i + "):" + Fibonacci.regraF(i) + "\t");
        }
        System.out.println("=====================================");
    }

}