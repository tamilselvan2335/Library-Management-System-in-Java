import java.util.Scanner;

public class Add_book {
        
	String [][]add_book=new String[10000][9];
    Scanner sc = new Scanner(System.in);

	

	public void add(int row) {		
					
			System.out.println("Total add book count ["+row+"]");			
		
			System.out.println("Enter book name:");
			add_book[row-1][0]=sc.nextLine();		
		
			System.out.println("Enter book ID:");
			add_book[row-1][1]=sc.nextLine();		
		
			System.out.println("Enter book Author name:");
			add_book[row-1][2]=sc.nextLine();		
		
			System.out.println("Enter book Category:");
			add_book[row-1][3]=sc.nextLine();		
		
			System.out.println("Enter book count:");
			add_book[row-1][4]=sc.nextLine();			
			
			System.out.println("Enter keyword: ");
			for(int j=5;j<=(add_book[row-1].length-1);j++) {
             	add_book[row-1][j]=sc.nextLine();}							
						
	}
	 public void search_book(String search) {
		    boolean count=true;
		    boolean not_available=true;
		    int available_Count=0;
	    	for(int i=0;i<add_book.length;i++){
	    		
	    		for(int j=0;count&&j<(add_book[i].length);j++) {
	    		if(search.equals(add_book[i][j])){
	    			available_Count=available_Count+1;
		        System.out.println("<------BOOK  AVAILABLE-["+available_Count+"]------>");
	    		    	
				System.out.println("book name:");
				System.out.println(add_book[i][0]);
				System.out.println();			
			
				System.out.println("book ID:");
				System.out.println(add_book[i][1]);
				System.out.println();			
			
				System.out.println("Author name:");
				System.out.println(add_book[i][2]);
				System.out.println();			
			
				System.out.println("book Category:");
				System.out.println(add_book[i][3]);
				System.out.println();			
			
				System.out.println("book count:");				
				System.out.println(add_book[i][4]);
				System.out.println();
			
			     not_available=false;
			     count=false;
	    		}//if    	
	    	}//for j
	    		 count=true;
	    		}//for i
	    	    if( not_available){
	    		System.out.println("<------BOOK NOT AVAILABLE------>");
                }
	 }
	 
	 public void lend_book(String book_name,String book_id) {
	    	    for(int i=0;i<add_book.length;i++){	    		
	    		 
	    		if(book_name.equals(add_book[i][0])||book_id.equals(add_book[i][1])){
		            		    	
				System.out.println("book name:");
				System.out.println(add_book[i][0]);
				System.out.println();			
			
				System.out.println("book ID:");
				System.out.println(add_book[i][1]);
				System.out.println();			
			
				System.out.println("Author name:");
				System.out.println(add_book[i][2]);
				System.out.println();			
			
				System.out.println("book Category:");
				System.out.println(add_book[i][3]);
				System.out.println();			
			
				System.out.println("book count:");				
				System.out.println(add_book[i][4]);
				System.out.println();			
			
				System.out.println("Enter--[yes]-or-[no]--for lend book:");				
                String lend=sc.nextLine();
			if(lend.equals("yes")) {
				int convert_int=Integer.parseInt(add_book[i][4]);  
				convert_int=convert_int-1;
          		String convert_String=String.valueOf(convert_int); 
          		add_book[i][4]=convert_String;
				System.out.println("Thanks for borrow book in our library");												
			    }	
	    	}	    	   		
	    	}
	    }    
}
