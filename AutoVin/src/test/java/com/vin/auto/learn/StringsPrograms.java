package com.vin.auto.learn;

import java.util.HashMap;
import java.util.Set;

public class StringsPrograms {
	public static void noOfWordsRepeatations(String s) {
		
		String[] words = s.split(" ");
		
		HashMap<String, Integer> wordmap= new HashMap<String, Integer>();
		for(String str:words) {
			if ( wordmap.get(str)!=null) {
				wordmap.put(str,wordmap.get(str)+1);			
			}
			else {
				wordmap.put(str,1);
			}
					}
		Set<String> keys = wordmap.keySet();
		
		for(String str:keys) {
			System.out.println(str+"---->"+wordmap.get(str));
		}
	}

	public static void main(String[] args) {
		noOfWordsRepeatations("hello hi I am vinay hello how can i help hi ");
	}

}
