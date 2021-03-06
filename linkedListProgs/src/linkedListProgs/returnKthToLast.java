/*
 * Return Kth to Last: Implement an algorithm to find the 
 * kth to last element of a singly linked list.
 */
package linkedListProgs;



public class returnKthToLast {
	public static myNode head;

	public void addNewValue(Integer value){
		if(head == null){
			head = new myNode(value);
		}
		else{
			myNode temp = new myNode(value);
			myNode current = head;

			if(current!=null){
				while(current.next!= null){
					current = current.next;
				}
				current.next = temp;
			}
		}
	}
	
	class myNode{
		myNode next;
		Integer data;

		public myNode(Integer givenData){
			data = givenData;
			next = null;
		}

		public myNode(Integer givenData, myNode nextValue){
			data = givenData;
			next = nextValue;
		}
	}
	
	public static String toString(myNode head){
		String result = "";
		myNode current = head;
		while(current!=null){
			result += (current.data + " ");
			current = current.next;
		}
		return result;
	}
	
	public myNode returnKth(myNode head, int k){
	
		if(head == null){
			System.out.println("No elements");
			return head;
		}
		else{
			myNode point1 = head;
			myNode point2 = head;
			
			for(int i = 0; i < k ; i++){
				if(point1!=null){
					point1 = point1.next;
				}
				else{
					System.out.println("K value out of bound");
					return null;
				}
			}
			while(point1!=null){
				point1=point1.next;
				point2= point2.next;
			}
			return point2;
		}
		
	}
	
	public static void main(String[] args) {
		returnKthToLast list = new returnKthToLast();
		list.addNewValue(3);
		list.addNewValue(6);
		list.addNewValue(9);
		list.addNewValue(3);
		list.addNewValue(6);
		list.addNewValue(9);
		list.addNewValue(10);
		System.out.println(toString(head));
		myNode result = list.returnKth(head, 1);
		if(result!=null){
		System.out.println(result.data);
		}
		else{
			System.out.println("Could not complete the action");
		}
	}

}
