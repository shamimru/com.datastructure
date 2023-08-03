package com.datastructure.Practice;

import java.util.Scanner;

public class End_insertion {
	static class Node{
		int data;
		Node next=null;
		Node (int d){
			this.data=d;
			this.next=null;
		}
	}
	Node head=null;
	
	public void Creation() {
		int data,n;
		do {
			System.out.println("Enter a data for end");
			Scanner sc=new Scanner(System.in);
			data=sc.nextInt();
			Node new_node=new Node(data);
			
			if(head==null) {
				head=new_node;
			}else {
				Node temp=head;
				
				while(temp.next != null) {
					temp=temp.next;	
				}
				
				temp.next=new_node;
			}
			
			
			System.out.println("Want more, press 1");
			n=sc.nextInt();
		}while(n==1);
	}
	public void Triversal (){
		Node temp=head;
		if(head==null) {
			System.out.println("No data");
		}else {
			while(temp != null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		End_insertion end=new End_insertion();
		end.Creation();
		end.Triversal();

	}

}
