package com.company;

public class Palindrome {

    String word;
    public Palindrome(String str)
    {
        this.word = str;
    }

    public void check()
    {
        String str =  this.word;
        char[] ch = str.toCharArray();
        boolean b = true;
        int l = ch.length - 1;
        for(int i = 0; i <= l; i++)
        if(ch[i] != ch[l-i])
        {
            b = false;
            break;
        }
        if(b)
            System.out.println("This is a palindrome");
        else
            System.out.println("This is not a palindrome");

    }
}
