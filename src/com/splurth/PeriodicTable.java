package com.splurth;

import java.util.Locale;

public class PeriodicTable {

	
	public boolean isValidSymbol(String elementName, String symbol){
		
		
		
	
		return false;
	}
	
	/* Rule 1: All chemical symbols must be exactly two letters, 
	 * so B is not a valid symbol for Boron.
	 */
	public boolean checkRule1(String elementName, String symbol){
		if(symbol.length()==2){
			return true;
		}
		return false;
	}
	/* Rule 2: Both letters in the symbol must appear in the element name, 
	 * but the first letter of the element name does not necessarily need to appear in the symbol. 
	 * So Hg is not valid for Mercury, but Cy is.
	 */
	
	public boolean checkRule2(String elementName, String symbol){
		String s=symbol.toLowerCase(Locale.US);
		for(int i=0; i < s.length(); i++){
			
			if(elementName.indexOf(i)>=0){
				return true;
			}
		}
			return false;
		}
	
	/*
	 * Rule 3: The two letters must appear in order in the element name.
	 * So Vr is valid for Silver, but Rv is not. 
	 * To be clear, both Ma and Am are valid for Magnesium, 
	 * because there is both an a that appears after an m, and an m that appears after an a
	 */
	
	public boolean checkRule3(String elementName, String symbol){
		
		if(elementName.indexOf(symbol.charAt(0))>elementName.indexOf(symbol.charAt(1))){
			return true;
		}
		
		return false;
	}
	/* Rule 4: If the two letters in the symbol are the same, 
	 * it must appear twice in the element name. So Nn is valid for Xenon, but Xx and Oo are not.
	 */
	
	public boolean checkRule4(String elementName, String symbol){
		
		if(symbol.charAt(0)==symbol.charAt(1)){
			
			if(elementName.length() - elementName.replace(Character.toString(symbol.charAt(0)), "").length()==2){
				
				return true;
			}
			
		}
		
		return false;
	}



}
