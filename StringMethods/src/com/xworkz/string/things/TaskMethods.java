package com.xworkz.string.things;

import java.util.ArrayList;
import java.util.Arrays;

public class TaskMethods {

	public static void main(String[] args) {
		
		String description="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
		System.out.println(description.toUpperCase());
		System.out.println(description.toLowerCase());
		
		System.out.println("******************************************************************************");
		
		
		 String movie="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
	      char[] chars=movie.toCharArray();
	      for(int i=0; i<chars.length; i++) {
	    	  System.out.println(chars[i]);
	      }
	      
	      System.out.println("******************************************************************************");
		
	      
	      String space="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
	      String[] splits=space.split("");
	      String[] trimAndSplit=space.trim().split("");
	      System.out.println("splited words:["+ space+ "]");
	      
	      
	      System.out.println("*************************************************************************");
			
	      String space1="Triple Riding is a Kannada movie released on 25 Nov, 2022. The movie is directed by Mahesh Gowda and featured Aditi Prabhudeva, Rachana Inder, Sadhu Kokila and Rangayana Raghu as lead characters";
	      String[] splits1=space.split(",");
	      for(int i=0; i<splits1.length; i++) {
	    	  System.out.println("splited by,"+splits1[i]);
	      }
	      
	      

	      

	      
	}
	         }
	      


