package com.nt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {
 public static void main(String[] args) {
	String s="nenavath";
	ArrayList a=new ArrayList<>(Arrays.asList(s));
	 HashMap h=new HashMap<>();
	 for(int i=0;i<s.length();i++) {
          char c=s.charAt(i);
            if(h.containsKey(c)) {
        	  int count=(int) h.get(c);
        	  h.put(c, ++count);
        	  
                }else {
                 h.put(c,1);
                  }
	             }
                 System.out.println(h);
               }
              }
