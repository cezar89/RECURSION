package telephoneWords;

import java.util.Scanner;

public class TelNoWords {

	public static void main(String[] args) {
		//TEST A GIVEN NUMBER AS A STRING, GET ALL COMBINATIONS OF NAMES 
		//FROM THE KEYBOARD OF A PHONE
		// 1	ABC		DEF
		//GHI	JKL		MNO
		//PRS	TUV		WXY
		//		 0
		
		//THE RECURSIVE VERSION
		getNameFromNumber("213" ,"");
		
	}
	

	public static void getNameFromNumber(String str, String name){


		//HERE IS THE BASE CASE, WHEN THE PASSED STRING IS 1 IN LENGTH
		if (str.length()==1){
			char chr;
			//FIRST 2 IF STATEMENTS CHECK FOR 0 AND 1 AND JUST ATTACH
			if(str.charAt(0) == '0') System.out.println(name + '0');
			else if (str.charAt(0) == '1') System.out.println(name + '1');
			
			//NOW HERE JUST GO THROUGH THE 3 LOCATIONS FROM A SPECIFIC KEY
			//EXAMPLE: 3 CAN BE D, E OR F.
			else {
				for(int k = 0 ; k < 3; k++){
					chr = getCharKey((int)str.charAt(0)-48 , k);
					System.out.println(name + chr);
				}
			}
		}
		//HERE IS THE NORMAL CASE WHERE THE NUMBER IS NOT OF LENGTH 1 YET.
		else{
			if(str.charAt(0) == '0') getNameFromNumber(str.substring(1) ,name + '0');
			else if (str.charAt(0) == '1') getNameFromNumber(str.substring(1) ,name + '1');
			else {
				for(int k = 0 ; k < 3; k++){
					char chr = getCharKey((int)str.charAt(0)-48 , k);
					getNameFromNumber(str.substring(1) ,name + chr);
				}
			}
		}
	}
	//THIS METHOD IS TO GET THE THE CHARACTER FROM A SPECIFIC NUMBER AND LOCATION
	//I JUST CREATED AN ARRAY OF ALL LETTERS FROM THE ALPHABET 
	public static char getCharKey(int no , int loc){
		char[][] array = {{'0','0','0'},{'1','1','1'},{'A','B','C'},{'D','E','F'},{'G','H','I'},{'J','K','L'},
							{'M','N','O'},{'P','R','S'},{'T','U','V'},{'W','X','Y'}};

		return array[no][loc];
	}

}
