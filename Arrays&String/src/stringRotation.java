/*
 * StringRotation:Assume you have a method isSub5tring which checks if one word is 
 * a substring of another. Given two strings, s1 and s2, write code to check
 *  if s2 is a rotation of s1 using only one call to isSub5tring 
 *  (e.g., "waterbottle" is a rotation of" erbottlewat").
 */
public class stringRotation {

	public static boolean isSubString(String str1, String str2){
		if(str1.contains(str2)){
			return true;
		}
		else{
		return false;
		}
	}
	public static boolean isRotate(String str1, String str2){
		boolean result;
		if(str1.length()!=str2.length()){
			return false;
		}
		else{
			String newstr = str1 + str1;
			result = isSubString(newstr, str2);
			if (result == true){
				return true;
			}
			else{
				return false;
			}
		}
	}
	
	public static void main(String[] args) {
		boolean result;
		String str1 = "waterbottle";
		String str2 = "bottlweater";
		result = isRotate(str1, str2);
		System.out.println(result);
	}

}
