import java.util.Scanner;
import java.util.TimeZone;
import java.util.Calendar;

public class CustomArrayList <T> {


    private  T[] array;
    int size;
    int current;

    public CustomArrayList(){    //constructor of the array
        size=10;
        current=0;
        this.array=(T[]) new Object[size];

    }

    public T[] getArray() {						//array getter
        return array;
    }

    public void setArray(T[] array) { 			//arary setter
        this.array = array;
    }
     
    
    
    public void add_element(T obj ){   //method to add an element to array
    	
        if(current==size-1){
        this.increaseSize();
        }
        this.array[current]=obj;
        current++;
        size=current;
    }

    
    
    	public void remove_index(int index){    //method to remove an element from array
    		for(int i=index;i<current;i++){
    			{
    				this.array[i]=this.array[i+1];
    			}
            			}
            System.out.println("successfully deleted");
    		current--;  									//decreasing size because an element is deleted
    		size--;
    		}
    
    	
    public void display_elements()      //method to display all the element of the array
    {
    	for(int i=0; i<current;i++)
    	{
    		System.out.println(array[i]);
    	}
    }


    
    private T[] increaseSize(){            				 //method to increase size of array
       T [] Array=(T[]) new Object[array.length+1];

       for(int i=0;i<this.size;i++){
    	   Array[i]=this.array[i];
       }
        this.size=20;
       this.array=Array;			
       return this.array;
    }
    
    
    
    public void view_record(int ID)
    {
    	for(int i=0; i<current;i++)
    	{
    		subscriber sub = (subscriber) array[i];
    		if(sub.getID()==ID)											//if statement to verify the ID
    		System.out.println(array[i]);
    	}
    }
    
    
    
	

    int binary_search_by_name()											// function to search by giving the name
    {
    	Scanner input= new Scanner (System.in);
    	String answe;
    	System.out.println("Enter the name to search");
    	answe=input.nextLine();
    	
    	
    	int l = 0, r = size - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            subscriber sub = (subscriber) array[m];
            int answer = answe.compareTo(sub.getFirstName());
 
            											// Check if m is present at mid
            if (answer == 0)
                return m;
 
            												// If m greater, ignore left half
            if (answer > 0)
                l = m + 1;
 
            												// If m is smaller, ignore right half
            else
                r = m - 1;
        }
 
        return -1;
    }
    
    
    
    void display_index_search(int index)								//method the display the elements at specific index
    {
    	subscriber sub = (subscriber) array[index];
    	System.out.println(array[index]);
    	
    }
    
    
    
     public void bubbleSort_by_name()						//method the sort on the base of name
     {
        int n = array.length;
        
        for (int i = 0; i < size-1; i++)
        
        {
        	for (int j = 0; j < size-i-1; j++)
              {         
        		subscriber sub = (subscriber) array[j];	
         		subscriber sub1 = (subscriber) array[j+1];


                  if (sub.getFirstName().compareTo(sub1.getFirstName())>0)
                  {
                	  T obj;
                      int temp = sub.getID();
                      sub.setID(sub1.getID()); 
                      sub1.setID(temp);
                      
                      obj=array[j];									//swapping
                      array[j]=array[j+1];					
                      array[j+1]=obj;                        
                  }
              }
        }
        
         
    }
     
     
     public void bubbleSort_by_ID()							//method to sort on the base of ID
     {
        int n = array.length;
        
        for (int i = 0; i < size-1; i++)
        
        {
        	for (int j = 0; j < size-i-1; j++)
              {         
        		subscriber sub = (subscriber) array[j];	
         		subscriber sub1 = (subscriber) array[j+1];


                  if (sub.getID()>sub1.getID())
                  {
                	  T obj;								//swapping
                	  obj=array[j];
                      array[j]=array[j+1];
                      array[j+1]=obj;                        
                  }
              }
        }
        
         
    }
     
     void update_record(int index)								//method to update record by taking the first name
     {
 		 Scanner input= new Scanner(System.in);
    	 subscriber sub = (subscriber) array[index];
    	 System.out.println("Enter the new first name");
    	 sub.setFirstName(input.nextLine());
    	 System.out.println("Enter the new Last name");
    	 sub.setLastName(input.nextLine());
    	 System.out.println(array[index]);						//print the new details of the user
     	
     }
    
   int binary_search_by_ID()												//method to search by ID
   {
	   	  Scanner input= new Scanner(System.in);
	   	  System.out.println("Enter the ID to search");
	   	  int ID=input.nextInt();
	   	  int first = 0;
	      int last = size - 1;
	      int middle = (first + last)/2;

	      while( first <= last )
	      {
	    	 subscriber sub = (subscriber) array[middle];
	         if ( sub.getID() < ID )
	           first = middle + 1;
	         else if (sub.getID() == ID )
	         {
	          return middle;
	         }
	         else
	         {
	             last = middle - 1;
	         }
	         middle = (first + last)/2;
	      }
	      return -1;
	   
   }
   
   void birthday_checking()												//method to print the recent birthday
   {

	   Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
       int currentMonth = localCalendar.get(Calendar.MONTH) + 1;
       
       for(int i=0;i<size;i++)
       {
    	   subscriber sub = (subscriber) array[i];
    	   if(currentMonth==sub.getDateofBirth())	 //will display details of all the users that have birthday in same month
    	   {
    		   System.out.println(array[i]);
    	   }
       }
	  
   }

}
