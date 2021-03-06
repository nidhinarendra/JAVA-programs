//Merge Sort

public class mergeSortExample {

	public int tempArray[];
	public int array[];
	public int lengthOfArray;

	public void sort(int[] givenArray){
		this.array = givenArray;
		lengthOfArray = givenArray.length;
		this.tempArray = new int[lengthOfArray]; 
		mergeSort(0, lengthOfArray-1);
	}

	public void mergeSort(int lower, int higher){
		if(lower<higher){
			int middle = lower+(higher-lower)/2;
			mergeSort(lower, middle);
			mergeSort(middle+1,  higher);
			mergeParts(lower, middle, higher);
		}
	}
	
	public void mergeParts(int lower, int middle, int higher){
		for(int i = 0; i < lengthOfArray; i++){
			tempArray[i] = array[i];
		}
		int i = lower;
		int j = middle+1;
		int k= lower;
		while(i<=middle && j<=higher){
			if(tempArray[i] <=tempArray[j]){
				array[k] = tempArray[i];
				i++;
			}
			else{
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		while(i<=middle){
			array[k]= tempArray[i];
			i++;
			k++;
		}
	}
	public static void main(String[] args) {
		mergeSortExample example = new mergeSortExample();
		int[] givenArray = {22,42,12,1,-5,75,47,33,15,-88,44,2,53};
		example.sort(givenArray);
		for(int i:givenArray){
			System.out.print(i + " ");
		}
	}

}
