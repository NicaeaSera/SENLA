package com.company;

public class Fibonacci {
    int N;
    public Fibonacci(int n)
    {
        this.N = n;
    }

    public int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void displayTheResult()
    {
        int temp = 0;
        for(int i =0; i <= N; i++)
        {
            temp = fibonacci(i);
            if(temp <= N)
                System.out.print(temp + " ");
            if(temp > N)
                break;
        }
    }
}
