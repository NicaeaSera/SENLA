package com.company;

import java.util.ArrayList;

public class Del_all_numbers {
    String text;

    public Del_all_numbers(String str)
    {
        this.text = str;
    }

    public void returnResult()
    {
        char[] ch = text.toCharArray();
        String result = "";
        int l = ch.length;
        for(int i = 0; i < l; i++)
        {
            try{
                Integer.parseInt(ch[i]+"");
            }
            catch(Exception ex)
            {
                result = result + ch[i];
            }
        }
        System.out.println(result);
    }
}
