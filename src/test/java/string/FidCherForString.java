package string;

import cucumber.api.cli.Main;

public class FidCherForString {

	public static void main(String[] args) {

		String text="It is a sunny day today";
		int count =0;
		for (int i=0;i<text.length();i++) {
			if (text.charAt(i)=='a') {
				count++;	
				System.out.println("a="+count);
				System.out.println("index of this a is :"+i);
				
			}	
		}

	}





}
