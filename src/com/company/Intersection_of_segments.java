package com.company;

public class Intersection_of_segments {

    Integer[] arr;
    int Ax1;
    int Ay1;
    int Bx1;
    int By1;
    int Ax2;
    int Ay2;
    int Bx2;
    int By2;

    public Intersection_of_segments(int Ax1, int Ay1, int Ax2, int Ay2, int Bx1, int By1, int Bx2, int By2) {
        this.Ax1 = Ax1;
        this.Ay1 = Ay1;
        this.Bx1 = Bx1;
        this.By1 = By1;
        this.Ax2 = Ax2;
        this.Ay2 = Ay2;
        this.Bx2 = Bx2;
        this.By2 = By2;

    }

    public Intersection_of_segments(Integer[] arr)
    {
        this.Ax1 = arr[0];
        this.Ay1 = arr[1];
        this.Ax2 = arr[2];
        this.Ay2 = arr[3];
        this.Bx1 = arr[4];
        this.By1 = arr[5];
        this.Bx2 = arr[6];
        this.By2 = arr[7];
    }

    public void solve() {
        /*
        int A1 = Ay1 - Ay2;
        int B1 = Ax1 - Ax2;
        int C1 = Ax1*Ay2 + Ax2*Ay1;
        int A2 = By1 - By2;
        int B2 = Bx1 - Bx2;
        int C2 = Bx1*By2 + Bx2*By1;
*/
  /*      if(Ax1 > Ax2) {
            int temp = Ax1;
            Ax1 = Ax2;
            Ax2 = temp;
            temp = Ay1;
            Ay1 = Ay2;
            Ay2 = temp;
        }
        if(Bx1 > Bx2)
        {
            int temp = Bx1;
            Bx1 = Bx2;
            Bx2 = temp;
            temp = By1;
            By1 = By2;
            By2 = temp;
        }
        if((Ax1 > Bx1) && (Ax1 < Bx2))
    */
        double den = (By2 - By1) * (Ax1 - Ax2) - (Bx2 - Bx2) * (Ay1 - Ay2);
        if (den == 0) {
            if ((Ax1 * Ay2 - Ax2 * Ay1) * (Bx2 - Bx1) - (Bx1 * By2 - Bx2 * By1) * (Ax2 - Ax1) == 0 && (Ax1 * Ay2 - Ax2 * Ay1) * (By2 - By1) - (Bx1 * By2 - Bx2 * By1) * (Ay2 - Ay1) == 0)
                System.out.print("Segments intersect");
            else
                System.out.print("Segments do not intersect");
        } else {
            double num_a = (Bx2 - Ax2) * (By2 - By1) - (Bx2 - Bx1) * (By2 - By2);
            double num_b = (Ax1 - Ax2) * (By2 - Ay2) - (Bx2 - Ax2) * (Ay1 - Ay2);
            double Ua = num_a / den;
            double Ub = num_b / den;
            if (Ua >= 0 && Ua <= 1 && Ub >= 0 && Ub <= 1)
                System.out.print("Segments intersect");
            else
                System.out.print("Segments do not intersect");
        }
    }
}
