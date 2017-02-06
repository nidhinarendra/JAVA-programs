package linkedListProgs;
//Remove Dups: Write code to remove duplicates from an unsorted linked list.

import java.util.HashSet;
import java.util.LinkedList;


public class deleteDup {

	public static LinkedList<Integer> deleteDupl(LinkedList<Integer> list) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.addAll(list);
		list.clear();
		list.addAll(hashSet);
		return list;
	}

	public static void main(String[] args) {
		LinkedList<Integer> linkList = new LinkedList<Integer>();
		LinkedList<Integer> newLinkedlist;
		linkList.add(33);
		linkList.addLast(34);
		linkList.addLast(34);
		linkList.addLast(38);
		linkList.addLast(40);
		linkList.addLast(40);
		linkList.addLast(20);
		
		newLinkedlist = deleteDupl(linkList);
		System.out.println(newLinkedlist);

	}

}
