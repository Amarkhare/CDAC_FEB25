package Contact;

import java.util.Scanner;

public class ContactList {
	
	Node head;
	static class Node{
		Node next;
		String name;
		long phone;
		
		Node(String n, long p){
			name = n;
			phone = p;
			next = null;
		}
	}
	
	void addContactAtBeg(String n, long p) {
		Node new_node = new Node(n,p);
		new_node.next = head;
		head = new_node;
	}
	
	void addContactAtEnd(String n, long phone) {
		Node new_node = new Node(n,phone);
		Node ptr = head;
		if(head == null) {
			head = new_node;
			return;
		}
		
		while(ptr.next!=null) {
			ptr = ptr.next;
		}
		ptr.next = new_node;
	}
	
	
	void removeContact(String n, long phone) {
		Node ptr = head;
		Node prevPtr = null;
		
		//if 1st elemnt
		if(ptr != null && ptr.name == n ) {
			head = ptr.next ;
			return ;
		}
		
		//if inBetween
		while(ptr != null && ptr.name != n) {
			prevPtr = ptr;
			ptr = ptr.next;
		}
		
		//if not present
		if(ptr == null) {
			return;
		}
		
		//unlinking the node
		prevPtr.next = ptr.next;
	}
	
	void searchContact(String n, long phone) {
		Node ptr = head;
		while(ptr != null && ptr.name.equals(n)) {
			ptr = ptr.next;
		}
		
		//if not present
		if(ptr == null) {
			System.out.println("Contact Not present");
		}
		else {
			System.out.println(ptr.name +" "+ptr.phone);
		}
	}
	
	void displayContact() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node ptr = head;
		while(ptr!=null) {
			System.out.println(ptr.name+" : "+ ptr.phone+"->");
			ptr = ptr.next;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactList cl = new ContactList();
		long phone = 0;
		String name = "";
		
		
		int choice = -1;
		
		do {
			System.out.println("\nContact List Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
            case 1 : System.out.println("Enter name ");
            		name = sc.nextLine();
            		System.out.println("Enter Phone no ");
            		phone = sc.nextLong();
            		sc.nextLine();
            		cl.addContactAtEnd(name, phone);
            		break;
            case 2 : System.out.println("Enter name and no. resp");
		    		name = sc.nextLine();
		    		System.out.println("Enter Phone no ");
		    		phone = sc.nextLong();
		    		sc.nextLine();
		    		cl.removeContact(name, phone);
		    		break;
            case 3 : System.out.println("Enter name and no. resp");
		    		name = sc.nextLine();
		    		System.out.println("Enter Phone no ");
		    		phone = sc.nextLong();
		    		sc.nextLine();
		    		cl.searchContact(name, phone);
		    		break;
            case 4 : cl.displayContact();
            		break;
            case 5 : System.out.print("Exit...");
            		break;
            }
            
            
		}while(choice != 5);
		
		
	}
	
}
