/*
 * String Compression: Implement a method to perform basic string compression using 
 * the counts of repeated characters. For example, 
 * the string aabcccccaaa would become a2blc5a3. 
 * If the "compressed" string would not become smaller than the original string, 
 * your method should return the original string. You can assume the string has only 
 * uppercase and lowercase letters (a - z).
 */
public class stringCompress {

	public static String compress(String str){
		StringBuilder strBuild = new StringBuilder();
		int count = 0;
		for(int i=0; i<str.length(); i++){
			count++;
		
			if(i+1 >= str.length() || str.charAt(i)!=str.charAt(i+1)){
				strBuild.append(str.charAt(i));
				strBuild.append(count);
				count = 0;
			}
		}
		return strBuild.length() < str.length()? strBuild.toString() : str;
	}
	
	public static void main(String[] args) {
		String str = "aaaabbbbnnnnnnnHHHHI";
		String finalStr = compress(str);
		System.out.println(finalStr);
	}

}
