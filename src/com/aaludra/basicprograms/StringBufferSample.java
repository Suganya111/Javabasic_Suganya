package com.aaludra.basicprograms;

public class StringBufferSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
			StringBuffer sb=new StringBuffer();  
			System.out.println(sb.capacity());//default 16  
			sb.append("Suganya");
			System.out.println(sb.capacity());//now 16  
			sb.append("java is my favourite language");  
			System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  

	}

}
