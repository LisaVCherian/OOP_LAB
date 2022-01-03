/*Write a Java program for implementing a doubly linked list( elements of the list may be integers).
Make it a menu driven program with following options,
i) Insert (insertion may be at tail end)
ii) Delete (read the element to delete, search it and then delete, print error message if not found)
iii) Display list 
iv) Exit
*/

import java.util.*;
class doubly_linked_list{

	class Node{  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item){  
            this.item = item;  
        }  
    }  
    
    Node head, tail = null;  
    
    public void insert(int item){
    	Node newNode = new Node(item);
    	
    	if(head==null){
    		head = tail = newNode;
    		head.previous = null;
    		tail.next = null;
    	}
    	else{
    		tail.next = newNode;  
            newNode.previous = tail;    
            tail = newNode; 
            tail.next = null;  
    	}
    }
    
    public void display(){
    	Node current = head;
    	
    	if(current==null){
    		System.out.print("List is empty oops! :(");
    	}
    	System.out.println("The nodes in the list are: ");
    	while(current!=null){
    		System.out.print(" " + current.item + " ");
    		current = current.next;
    	}
    	System.out.println();
    }
    
    
    public void search(int val){
    	Node current = head;
    	if(current==null){
    		System.out.print("List is empty oops! :(");
    	}
    	
    	while(current!=null){
      
				if(current.item==val){
							
					if(head == current){
						head = current.next;
					}
		
					if (current.next != null) {
						current.next.previous = current.previous;
					}
			
					if (current.previous != null) {
					current.previous.next = current.next;
					}
    			}
    			current = current.next;
    	}
    }
   
}

class Main{

	public static void main(String args[]){
	
		doubly_linked_list list = new doubly_linked_list(); 
		
		Scanner sc = new Scanner(System.in);
		int flag = 1;
		
		while(flag==1)
		{	
			System.out.print("\n 1. Insert \n 2. Delete \n 3. Display \n 4. Exit \n Enter your choice: ");
			int i = sc.nextInt();
			System.out.println("*********************************************");
			
			switch(i)
			{
			case 1: System.out.print(" Enter the element to insert: ");
					int item = sc.nextInt();
					list.insert(item);
					break;
		
			case 2: System.out.print(" Enter the element to be deleted: ");
					int val = sc.nextInt();
					list.search(val);
					break;
		
			case 3: list.display();
					break;
		
			case 4: flag = 0;
					break;
			}
		}
	}
}
