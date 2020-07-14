package com.practice;

import java.util.*;

public class StringCompress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String input = sc.nextLine();
        char[] stringArray = input.toCharArray();
        int count = 0;
        StringBuilder final_answer = new StringBuilder();
        int j = 0;
        for(int i = 0; i < stringArray.length; i++){
            while(stringArray[i] == stringArray[j]){
                j++;
                count++;
            }
            final_answer.append(stringArray[i] + count);
        }
    }
}
