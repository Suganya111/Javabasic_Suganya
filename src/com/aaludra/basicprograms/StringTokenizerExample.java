package com.aaludra.basicprograms;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	//String name="Java. is a programming Language.";
	
	
	public static void main(String[] args) {
		
		//StringTokenizerExample example=new StringTokenizerExample();
		StringTokenizer st=new StringTokenizer("Java is a programming Language");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextToken());
		}
	

		//System.out.println(st.st1.nextToken("."));
	}

}
