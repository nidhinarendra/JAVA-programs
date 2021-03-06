/*
 * Write code to remove duplicates from an unsorted linked list.
 * How would you solve this problem if a temporary buffer is not allowed?
 */

package linkedListProgs;

import java.util.HashSet;

public class deleteDuplicates {
	private static myNode head;

	private void addNewValue(Integer value){
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
	public void deleteDupWithBuffer(){
		HashSet<Integer> myHashSet = new HashSet<>();
		myNode current = head;
		myNode previous = null;
		if(head==null){
			System.out.println("No data in the linked list");
			return;
		}
		else{
			while(current!=null){
				if(myHashSet.contains(current.data)){
					previous.next = current.next;
					current = current.next;
				}
				else{
					myHashSet.add(current.data);
					previous = current;
					current = current.next;
				}
			}
		}
	}

	public void deleteDupWithOutBuffer(){
		myNode current = head;
		if(head==null){
			System.out.println("No element in the linked list");
			return;
		}
		else{
			while(current!=null){
				myNode temp = current;
				while(temp.next!=null){
					if(temp.next.data == current.data){
						temp.next = temp.next.next;
					}
					else{
						temp = temp.next;
					}
				}
				current = current.next;
			}
		}

	}

	public static void main(String[] args) {
		deleteDuplicates list = new deleteDuplicates();
		list.addNewValue(3);
		list.addNewValue(6);
		list.addNewValue(9);
		list.addNewValue(3);
		list.addNewValue(6);
		list.addNewValue(9);
		System.out.println(toString(head));
		list.deleteDupWithBuffer();
		System.out.println(toString(head));
		list.deleteDupWithOutBuffer();
		System.out.println(toString(head));
		

	}
}
