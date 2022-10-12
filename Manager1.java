package com.word.demo;

import java.util.Scanner;

public class Manager1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		  Scanner sc=new Scanner(System.in); 
		  System.out.println("Enter String:"); 
		  String str=sc.nextLine(); 
		  String[] str1=str.split("\\s"); 
		  for(int i=0;i<str1.length;i++) 
		  { 
		  for(int j=i+1;j<str1.length;j++) 
		  { 
		  if(str1[i].length()>str1[j].length()) 
		  { 
		  String temp= str1[i]; 
		  str1[i]=str1[j]; 
		  str1[j]=temp; 
		  sc.close();
		  } 
		  } 
		   } 
		  for(int i=0;i<str1.length;i++) 
		  { 
		  System.out.print(str1[i]+" ");  
		  } 
		  } 
	}


