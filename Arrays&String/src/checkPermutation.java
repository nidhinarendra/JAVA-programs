/*
 * Check Permutation: Given two strings, write a method to decide 
 * if one is a permutation of the other.
 * Assuming that the algorithm is asked for case sensitive strings ( A != a)
 */
public class checkPermutation {

	public static boolean isSimilar(String a, String b){
		if(a.length() != b.length()){
			return false;
		}
		else{
			int[] intArray = new int[128]; //assuming that the string contains only ascii characters
			/*
			 * 128 can be considered only when the strings are case sensitive 
			 * as 'A' and 'a' have different ascii codes
			 */
			char[] aChar = a.toCharArray(); //create a character array 
			for(char c: aChar){
				intArray[c]++; //count the number of times each character appears
			}
			
			for(int i=0; i<b.length(); i++){
				int c = (int) b.charAt(i);
				intArray[c]--; //Subtract the number of times character appears
				if(intArray[c] < 0){ 
					/*
					 * if the strings were the same then all the characters
					 * should be subtracted and made zero.
					 */
					
					return false;
				}
			}
			return true;
		}
	
	}

	public static void main(String[] args) {
		String a = "ABCD";
		String b = "DBaC";

		boolean result = isSimilar(a, b);
		System.out.println(result);

	}

}
