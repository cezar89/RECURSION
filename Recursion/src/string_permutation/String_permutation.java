package string_permutation;

public class String_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";

		permutate(str,"");
	}
	
	public static void permutate(String str,String finalStr){
		//base case print if last element
		if (str.length() == 1){
			finalStr = finalStr + str.charAt(0);
			System.out.print("!!"+finalStr+"!!" + "\n");
		}
		//general case for loop to print the front of the string
		else{
			for(int i=0 ; i<str.length(); i++){
				
				String newStr = str.replaceAll(str.charAt(i)+"","");
				String passedString = finalStr + str.charAt(i);
				
				permutate(newStr,passedString);
			}
		}

	}
}
