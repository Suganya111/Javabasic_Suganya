package com.aaludra.basicprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class MapSample {
	

		public static void main(String []argh)
		{
			Scanner in = new Scanner(System.in);
			int n=in.nextInt();
			in.nextLine();

			Map<String, Integer> map = new HashMap<String, Integer>(n);
			for(int i=0;i<n;i++)
			{
				String name=in.nextLine();
				Integer phone=in.nextInt();
				in.nextLine();
				map.put(name, phone);
			}

			while(in.hasNext())
			{
				
				String s=in.nextLine();
				try {
					int phone = map.get(s);
					{
						System.out.println(s+"="+phone);
					}
				}
					catch(Exception e)
					{
						System.out.println("Not Found!");
					}

			}
		}
	}



