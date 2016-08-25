package com.teamtreehouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter word/phrase to be reversed:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String newWord="";
        int i;
        for (i=word.length();i>0;i--){
            newWord+= word.charAt(i-1);
        }
        System.out.println(newWord);
    }
}
