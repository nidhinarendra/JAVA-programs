//Complexity is O(N^2)
public class exampleBigO {
	
 static void printpair(int[] list){
	for(int i =0 ; i < list.length; i++){
		for(int j =i+1; j<list.length; j++){
			System.out.print(list[i] + "," + list[j]);
		}
	}
}
	public static void main(String[] args) {
		int[] list = {0,1,2,3,4,5,6,7};
		printpair(list);
	}

}
