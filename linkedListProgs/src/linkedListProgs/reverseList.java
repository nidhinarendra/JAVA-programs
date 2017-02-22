//Reverse a singly linked list

package linkedListProgs;

public class reverseList {

	public static myNode head;
	public static String toString(myNode head){
		String result = "";
		myNode current = head;
		while(current!=null){
			result += (current.data + " ");
			current = current.next;
		}
		return result;
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

	public myNode reverseIterative(myNode head){
		myNode current = head;
		myNode tempPrevious = null;
		myNode tempNext = null;
		if(head == null){
			System.out.println("No element to reverse");
			return head;
		}
		else{
			while(current!=null){
				tempNext = current.next;
				current.next = tempPrevious;
				tempPrevious = current;
				current = tempNext;
			}
			head = tempPrevious;
			return head;
		}
	}

	public static void main(String[] args) {
		reverseList list = new reverseList();
		list.addNewValue(3);
		list.addNewValue(6);
		list.addNewValue(9);
		list.addNewValue(3);
		list.addNewValue(6);
		list.addNewValue(9);
		System.out.println(toString(head));
		myNode result = list.reverseIterative(head);
		System.out.println(toString(result));

	}
}
