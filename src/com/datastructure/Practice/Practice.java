package com.datastructure.Practice;

import java.util.Scanner;

public class Practice {

	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	
	
	public void Creation() {
		int data,n;
		Scanner sc=new Scanner(System.in);
		do {
			
		System.out.println("Enter data at start");
		data=sc.nextInt();
		Node new_node=new Node(data);
		if(head==null) {
			head=new_node;
		}else {
			new_node.next=head;
			head=new_node;
			
		}
		System.out.println("Do you want more! press 1");
		n=sc.nextInt();
	}while(n==1);	
	}
	
	public void travarser() {
		Node temp=head;
		if(head==null) {
			System.out.println("No data here");
			
		}else {
			while(temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice ll=new Practice();
		ll.Creation();
		ll.travarser();

	}

}
