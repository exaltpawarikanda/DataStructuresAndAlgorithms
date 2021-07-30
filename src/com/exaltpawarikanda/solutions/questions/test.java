package com.exaltpawarikanda.solutions.questions;

/**
 * Created by Exalt Pawarikanda on 7/28/21
 */
public class test {
        public static boolean isInteger(String s) {
            try {
                Integer.parseInt(s);
            } catch(NumberFormatException e) {
                return false;
            } catch(NullPointerException e) {
                return false;
            }
            // only got here if we didn't return false
            return true;
        }

        public static void main(String args[])  {
        String input = "he is a good programmer, he won 865 competitions, but sometimes he dont. What do you think? All test-cases should pass. Done-done?";
            input = input.replaceAll("[.,?!]"," ");
            char last = input.charAt(input.length()-1);
            if( last == '?' || last == '.') {
                input = input.substring(0, input.length()-1);
            }
            String arr[] = input.split(" ");
            int count = 0;
            for(int i = 0;i<arr.length;i++) {
                if(!isInteger(arr[i])) count++;
            }
            System.out.println(count);
        }

}
