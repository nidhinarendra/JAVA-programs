//Rotate array at pivot and search an element in o(logn)

public class RotateArrayAtPivot {

	static void rotateAtIndex(int[] givenArray, int rotateAtIndex){
		reverseArray(givenArray, 0, rotateAtIndex);
		reverseArray(givenArray, rotateAtIndex,givenArray.length);
		reverseArray(givenArray, 0, givenArray.length);
	}
	
	static void reverseArray(int[] arrayToReverse, int starting, int ending){
		while(starting<ending){
			int temp = arrayToReverse[starting];
			arrayToReverse[starting] = arrayToReverse[ending-1];
			arrayToReverse[ending-1] = temp;
			starting++;
			ending--;
		}
	}
	
	static void findTheElementInRotated(int[] givenArray, int elementToFind){
		
	}
	
	public static void main(String[] args) {
		int[] givenArray = {1,2,3,4,5,6,7,8,9};
		int rotateAtIndex = 4;
		for(int i= 0; i<givenArray.length; i++){
			System.out.print(givenArray[i]+" ");
		}
		System.out.println("");
		
		rotateAtIndex(givenArray,rotateAtIndex);
		for(int i= 0; i<givenArray.length; i++){
			System.out.print(givenArray[i]+" ");
		}
		System.out.println("");
		int elemetToFind = 3;
		findTheElementInRotated(givenArray, elemetToFind);
	}

}
