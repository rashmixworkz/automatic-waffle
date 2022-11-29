package com.xworkz.interviewcodingquestions.code;

public class MatrixMultiplication {

	public static void main(String[] args) {
	   
		int a[][]={{1,1,1},{2,8,9},{3,6,9,}};    
		int b[][]={{2,4,9},{2,4,2},{2,7,1}};    
		        
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		    
		    
		for(int i=0;i<3;i++){    
		for(int j=0;j<3;j++){    
		c[i][j]=0;      
		for(int k=0;k<3;k++)      
		{      
		c[i][j]+=a[i][k]*b[k][j];      
		} 
		System.out.print(c[i][j]+" ");    
		}
		System.out.println();   
		}    
		}

	}


