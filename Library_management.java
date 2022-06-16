import java.util.Scanner;

public class Library_management extends Add_book {

static int row=0;	

	public static void main(String[] args) {
		
	    Scanner input = new Scanner(System.in);
    	System.out.println("LIBRARY MANAGEMENT SYSTEM");
    	
    	Library_management ch=new Library_management();
		
	     while(true) {	 		

	    	System.out.println("<----------------------------->");
	 	    System.out.println("Enter--[add]----->book adding");
	 	    System.out.println("Enter--[search]-->book search");
	 	    System.out.println("Enter--[lend]---->lend book");
	    	System.out.println("<----------------------------->");

	 	   String enter=input.nextLine(); 	   
	 	  // boolean y=enter.equals("add");
	        
	        if(enter.equals("add")) 
	        {
               row=row+1;	 	    
               ch.add(row);             
            }
	   
	        if(enter.equals("search"))
	        {
		 	   System.out.println("Enter-->[bookname]or[bookID]or[author name]or[keyword]or[Category]");

		 	   String search=input.nextLine();
	           ch.search_book(search);
	        }
	        
	        if(enter.equals("lend"))
	        {
		 	   System.out.println("Lend a book Enter-->[Book name] and [book ID] ");
		 	   System.out.println();
		 	   System.out.println("Book name:");
			   String book_name=input.nextLine();
		 	   System.out.println("book ID:");	   
			   String book_id=input.nextLine();
	           ch.lend_book(book_name,book_id);
	        }    	
	       	     	     
	      }    
	   }

}
