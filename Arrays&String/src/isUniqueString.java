//Check if the given string is unique.
public class isUniqueString {
public static boolean checkIfUnique(String givenStr){
	//Assuming ascii string(128). consider 256 if using an extended ascii
	if(givenStr.length() > 128){ 
		return false;
	}
	else{
		boolean[] newArray = new boolean[128];
		for(int i=0; i< givenStr.length(); i++){
			int val = givenStr.charAt(i);
			if(newArray[val]){
				return false;
			}
			else{
				newArray[val] = true;
			}
		}
		return true;
	}
}
	public static void main(String[] args) {
		String givenStr = "abcjhyutrdfgv";
		boolean result = checkIfUnique(givenStr);
		System.out.println(result);
		

	}

}
