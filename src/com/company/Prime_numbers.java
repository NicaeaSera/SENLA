package com.company;

public class Prime_numbers {
    int N;

    public Prime_numbers(int n)
    {
        this.N = n;
    }

    public void displayTheResult()
    {
        boolean b;
        for(int i = 2; i <= N; i++)
        {
            b = true;
            for(int j = 2; j < i; j++)
            {
                if(i % j == 0)
                    b = false;
            }
            if(b)
                System.out.print(i + " ");
        }
    }
}
