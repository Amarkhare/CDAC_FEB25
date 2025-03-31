package Browser;

import java.util.Scanner;

public class History {
	Node head;
	Node tail;
	Node curptr;
	static class Node{
		Node next;
		Node prev;
		String url;
		
		Node(String url){
			this.url = url;
			this.next = null;
			this.prev = null;
		}
	}
	
	//Adding new page to history
	void visitPage(String url){
		Node new_node = new Node(url);
		
		// if its an first element
		if(head == null) {
			head = tail = curptr = new_node;
			System.out.println("Visited : "+url);
			return;
		}
		//if new page visited after going back, remove forward history
		if(curptr.next != null) {
			curptr.next = null;
		}
		
		//updating current pointer and tail pointer
		curptr.next = new_node;
		new_node.prev = curptr;
		curptr = new_node;
		tail = new_node;
		
		System.out.println("Visited : "+url);
	}
	
	
	void moveForward() {
		
		if(curptr!=null && curptr.next != null) {
			curptr=curptr.next;
			System.out.println("-->"+curptr.url);
			return;
		}
		System.out.println("No next page");
	}
	
	void moveBackward() {
		if(curptr != null && curptr.prev != null) {
			curptr = curptr.prev;
			System.out.println(curptr.url+"<--");
			return;
		}
		System.out.println("No Previous page");
	}
	
	void clearHistory() {
		head = tail = curptr = null;
		System.out.println("History cleared");
	}
	
	void displayCurrentPage() {
		if(curptr != null) {
			System.out.println("CrPg-->"+curptr.url);
			return;
		}
		System.out.println("No page visited.");
	}
	
	public static void main(String[] args) {
		History brsr = new History();
		Scanner sc = new Scanner(System.in);
		
		int choice = -1;
		String url;
		do {
			System.out.println("\nBrowser History Menu:");
            System.out.println("1. Visit Page");
            System.out.println("2. Move Backward");
            System.out.println("3. Move Forward");
            System.out.println("4. Display Current Page");
            System.out.println("5. Clear History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 
            
            switch (choice) {
            case 1: 
            	System.out.println("Enter url:");
            	url = sc.nextLine();
            	brsr.visitPage(url);
            	break;
            case 2:
            	brsr.moveBackward();
            	break;
            case 3:
            	brsr.moveForward();
            	break;
            case 4:
            	brsr.displayCurrentPage();
            	break;
            case 5:
            	brsr.clearHistory();
            	break;
            case 6:
            	System.out.println("Exit");
            default:
            	System.out.println("Invalid choice");
            	
            }
			
		}while (choice != 6);
	}
	
}
