package com.exaltpawarikanda.solutions.datastructures.array;

public class StringReverse {

    public static void main(String[] args){
        reverse("How are you");
    }


    public static void reverse(String str){

        if(str.length() < 2){
            System.out.println("Please provide a string with length greater than 2 !!!");
        }else{
            char[] strCharacters = new char[str.length()];

            for(int i = 0; i < str.length(); i++){
                strCharacters[i] = str.charAt((str.length()-1) - i);
            }

            System.out.println(String.valueOf(strCharacters));
        }

        //another implementation using StringBuffer:
        StringBuffer sbf = new StringBuffer(str);
        sbf.reverse();
        System.out.println(sbf);

    }
}
