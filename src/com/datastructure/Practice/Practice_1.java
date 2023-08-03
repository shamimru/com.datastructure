package com.datastructure.Practice;

import java.util.Scanner;

public class Practice_1 {
	static class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	Node head=null;
	
	public void Creation() {
		int data,n;
		do {
			System.out.println("Enter a data at start");
			Scanner sc=new Scanner(System.in);
			data=sc.nextInt();
			Node new_node=new Node(data);
			if(head==null) {
				head=new_node;
			}else {
				new_node.next=head;
				head=new_node;
			}
			System.out.println("Do more, press 1");
			n=sc.nextInt();
		}while(n==1);
		
	}
	
	public void Triversal() {
		Node temp=head;
		if(temp==null) {
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
		
		Practice_1 p=new Practice_1();
		p.Creation();
		p.Triversal();

	}

}
