package com.xworkz.interviewcodingquestions.code;

public class FrequencyOfGivenString {

	public static void main(String[] args) 
	{
      String str="Xworkz institute Banglore";
      int[] freq=new int[str.length()];
      int i;
      int j;
      char string[]=str.toCharArray();
      for(  i= 0; i < str.length(); i++) 
      {
		freq[i]=1;
		for ( j = i+1; j < str.length(); j++) 
		{
			if(string[i]==string[j])
			{
				freq[i]++;
				string[j]='0';
			}
			
		}
		
	}
      System.out.println("charcter and their corrsponding frequency");
      for(i=0;i<freq.length;i++) {
    	  
      
      if(string[i]!='n' && string[i]!='0')
      
    	  
      System.out.println(string[i]+"-"+freq[i]);

	}

}
}

