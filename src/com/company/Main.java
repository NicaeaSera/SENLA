package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input task number"+'\n');
        int task_number = sc.nextInt();
        if(task_number == 1)
        {
            System.out.print("Enter N to display all prime numbers from 1 to N" + '\n');
            int N = sc.nextInt();
            Prime_numbers pm = new Prime_numbers(N);
            pm.displayTheResult();
        }

        if(task_number == 2)
        {
            System.out.print("Enter N to display all Fibonacci numbers from 0 to N" + '\n');
            int N = sc.nextInt();
            Fibonacci fb = new Fibonacci(N);
            fb.displayTheResult();
        }

        if(task_number == 3)
        {
            System.out.print("Enter Ax1 Ay1 Ax2 Ay2 Bx1 By1 Bx2 By2 to find if segments intersect" + '\n');
            Integer[] arr = new Integer[8];
            for(int i = 0; i < 8; i++)
                arr[i] = sc.nextInt();
            Intersection_of_segments segm = new Intersection_of_segments(arr);
            segm.solve();
        }

        if(task_number == 4)
        {
            System.out.print("Enter A and B to display GCD and ICM" + '\n');
            int A = sc.nextInt();
            int B = sc.nextInt();
            GCD_ICM t = new GCD_ICM(A, B);
            System.out.println("НОД: "+t.GCD()+ " НОК: "+ t.ICM());
        }

        if(task_number == 5)
        {
            System.out.println("Enter word to check for palindrome" + '\n');
            String str = sc.next();
            Palindrome pl = new Palindrome(str);
            pl.check();

        }

        if(task_number == 6)
        {
            System.out.println("Enter text to get result without numbers" + '\n');
            sc.nextLine();
            String str = sc.nextLine();
            Del_all_numbers dan = new Del_all_numbers(str);
            dan.returnResult();
        }

    }
}
