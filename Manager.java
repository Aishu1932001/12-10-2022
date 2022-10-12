package com.word.demo;

import java.util.Scanner;

public class Manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter a sentence: ");
   String sentence= sc.nextLine();
   Scanner words =new Scanner(sentence);
   while(words.hasNext())
   {
	   System.out.println(words.next());
   }
	}

}
