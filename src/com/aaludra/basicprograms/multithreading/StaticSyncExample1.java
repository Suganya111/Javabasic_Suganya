package com.aaludra.basicprograms.multithreading;

public class StaticSyncExample1 {
	     
	 synchronized static void printTable(int n){    
	   for(int i=1;i<=10;i++){    
	     System.out.println(n*i);    
	     try{    
	       Thread.sleep(400);    
	     }catch(Exception e){}    
	   }    
	 }

    
	}    
	    
	     
   


