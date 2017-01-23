package binaryTree;

import java.io.*;
import java.net.*;
import java.util.*;


class treeNode{
	public treeNode leftchild;
	public treeNode rightchild;
	public int data;

	public treeNode(int x){
		this.data = x;
		this.leftchild = null;
		this.rightchild = null;
	}

	public static void searchTree(treeNode root, int x){

		if (root == null){
			return;
		}

		else{
			if(root.data == x){
				System.out.println("Element found");
				return;
			}
			else if(x > root.data){
				searchTree(root.rightchild, x);
			}
			else{
				searchTree(root.leftchild, x);
			}
		}
	}


	public static treeNode insert(int x, treeNode head){

		treeNode newNode = new treeNode(x);

		if (head==null){
			head = newNode;
			return head;
		}
		else if(x < head.data){
			head.leftchild = insert(x, head.leftchild);

		}
		else{
			head.rightchild = insert(x, head.rightchild);
		}

		return head;
	}


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			treeNode head = null;
			head = insert(10, head);
			head = insert(20, head);
			head = insert(8, head);
			head = insert(6, head);
			head = insert(7, head);
			//System.out.println("The tree has values" + first.data + " and "+ second.data + " and " + third.data + " and " + forth.data + " and " + fifth.data);
			searchTree(head, 6);
		}
	}



