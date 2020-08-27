package com.amazon.v2.arrays;

import java.util.ArrayList;
import java.util.List;

public class AmexInterview { 
	
	  public String[] uncommonFromSentences(String sentence1, String sentence2) {

                String sen1[]=sentence1.split(" "); 
                String sen2[]=sentence2.split(" "); 
                String finalResult[]=new String[(sen1.length+sen2.length)];
                List<String> senten1=new ArrayList<String>(); 
                List<String> senten2=new ArrayList<String>(); 

                for(String s:sen1) { 
                	senten1.add(s);
                } 
                int i=0;
                for(String s1:sen2) { 
                	if(!senten1.contains(s1)) { 
                		finalResult[i++]=s1;
                	}
                }
                for(String s1:sen1) { 
                	if(!senten2.contains(s1)) { 
                		finalResult[i++]=s1;
                	}
                }
                return finalResult;
		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		AmexInterview a=new AmexInterview(); 
	System.out.println(	a.uncommonFromSentences("this apple is sweet", "this apple is sour"));

	}

}
