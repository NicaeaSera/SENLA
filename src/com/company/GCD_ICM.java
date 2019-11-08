package com.company;

public class GCD_ICM {

    int A;
    int B;
    int tempA;
    int tempB;
    int modulo;
    boolean t = true;
    public GCD_ICM(int a, int b)
    {
        this.A = a;
        this.B = b;
        this.tempA = a;
        this.tempB = b;
    }

    public int GCD()
    {
        int a = tempA;
        int b = tempB;
        if(a == 0 && b == 0)
        {
            System.out.println("Nice try");
            t = false;
            return 0;
        }
        if(a == 0 || b == 0)
        {
            if(Math.abs(a) == 0)
                return Math.abs(b);
            else
                return Math.abs(a);
        }

        if(a == b)
            return Math.abs(a);

        while(a != 0 && b != 0)
        {
            if(a < b)
            {
                a = tempB;
                b = tempA;
            }
            tempB = a % b;
            tempA = b;
            if(tempB == 0) {
                int result = tempA;
                tempA = A;
                tempB = B;
                return result;
            }
            else
                return GCD();

        }
        return 1;
    }

    public int ICM()
    {
        if(t)
            return A*B/GCD();
        return 1;
    }
}
