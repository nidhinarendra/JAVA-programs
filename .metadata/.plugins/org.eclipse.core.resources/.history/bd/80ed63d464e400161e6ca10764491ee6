/*
 * URLi : Write a method to replace all spaces in a string with '%20  
 * You may assume that the string has sufficient space at the end to hold the additional characters, 
 * and that you are given the "true" length of the string. 
 * (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)
 */
/*
 * Assumption : There are no blank spaces at the starting of the input string
 */
public class URLify {

	public static char[] removeSpaces(char[] str, int trueLength){
		int countSpace = 0;
		for(int i= 0; i< trueLength; i++){
			if(str[i] == ' '){
				countSpace++; //Calculating the number of spaces in the string which needs to be replaced
			}
		}
		System.out.println("The space count in the string given is: " + countSpace);
		int replaceIndex = trueLength + (countSpace * 2);
		System.out.println("The additional space required is: " + (countSpace*2) +
				" The total space required is: " + replaceIndex);
		
		if(trueLength < replaceIndex){
			/*
			 * cannot use null as it is not a character. 
			 * so we should use \0 to mark the end of the actual string
			 * So that the blank spaces after the string is not replaced.
			 */
			str[trueLength] = '\0'; 
		}
		
		for(int i = trueLength-1; i>=0; i--){
			if(str[i] == ' '){
				str[replaceIndex -1] = '0';
				str[replaceIndex -2] = '2';
				str[replaceIndex -3] = '%';
				replaceIndex = replaceIndex-3;
			}
			else{
				str[replaceIndex-1] = str[i];
				replaceIndex--;
			}
		}
		
		return str;
	}

	public static void main(String[] args) {
		String str = "   A B C           "; //example input. 
		//Extra space is given at the end of the input as it is mentioned in the problem as an assumption
		char[] givenStr = str.toCharArray();  
		System.out.println(givenStr);
		char[] newStr = removeSpaces(givenStr, 5);
		System.out.println(newStr);
	}

}
