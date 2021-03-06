

public class quickSortExample {
	private int[] array;
	private int lengthOfArray;

	public void sort(int[] givenArray){
		this.array = givenArray;
		lengthOfArray = givenArray.length;
		qSort(0,lengthOfArray-1);
	}
	
	public void exchangeNumbers(int i, int j){
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public void qSort(int lower, int higher){
		int i= lower;
		int j = higher;
		int pivot = array[lower+(higher-lower)/2];
		
		while(i<=j){
			while(array[i]<pivot){
				i++;
			}
			while(array[j]>pivot){
				j--;
			}
			if(i<=j){
				exchangeNumbers(i,j);
				i++;
				j--;
			}
		}
		if(j>lower){
			qSort(lower, j);
		}
		if(i<higher){
			qSort(i, higher);
		}
	}

	public static void main(String[] args) {
		quickSortExample example = new quickSortExample();
		int[] givenArray = {22,42,12,1,-5,75,47,33,15,-88,44,2,53};
		example.sort(givenArray);
		for(int i:givenArray){
			System.out.print(i);
			System.out.print(" ");
		}
	}

}
