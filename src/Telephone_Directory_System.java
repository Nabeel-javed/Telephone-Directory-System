import java.sql.Date;
import java.util.Scanner;
public class Telephone_Directory_System {

	public static void main(String[] args) {
		CustomArrayList<subscriber> phonebook= new CustomArrayList<subscriber>();		//custom arrayList

		Scanner input= new Scanner(System.in);
		boolean choice = true;
        while (choice =true){
    		System.out.println("<----------Please select any option---------->");
    		System.out.println("1) Contact module:");
    		System.out.println("2) Delete record:");
    		System.out.println("3) View records:");
    		System.out.println("4) Update record:");
    		System.out.println("5) Sort record:");
    		System.out.println("6) Search record");
    		System.out.println("7) Recent Birthdays");
    		System.out.println("8) Exit the program");
    		System.out.println("------------------------------");
    		int select=input.nextInt();
    		switch(select)												           //switch statement for cases
    		{
    			case 1:
    			{
    				 subscriber contact = new subscriber();
                     input.nextLine();
                     
                     System.out.println("Enter First Name : ");
                     String First_Name = input.nextLine();							//taking first name from user
                     contact.setFirstName(First_Name);
                    
                 	
                     System.out.println("Enter Last Name: ");						//taking last name from user
                     String Last_Name = input.nextLine();
                     contact.setLastName(Last_Name);
                     
                     System.out.println("Enter Phone No : ");
                     String phonenumber = input.nextLine();							//taking phone number from user
                     contact.setPhonenumber(phonenumber);
                     
                     System.out.println("Enter your City : ");
                     String city = input.nextLine();
                     contact.setCity(city);											//taking city from user
                     
                     System.out.println("Enter your country");
                     String country=input.nextLine();
                     contact.setCountry(country);
                     
                     System.out.println("Enter your residential address");			//taking address from user
                     String Address=input.nextLine();
                     contact.setResidential_address(Address);
                     
                     
                     System.out.println("Enter your website");						//taking website from user
                     String website=input.nextLine();
                     contact.setWebsite(website);
                     
                     
                     Scanner in = new Scanner(System.in);				//taking date of birth from user
                     int date_of_birth = 0;
                     while(date_of_birth<1 || date_of_birth>12)
                     {
                    	 System.out.println("Enter your month of Birth(in integer from 1-12)");		
                    	 date_of_birth=in.nextInt();
                         contact.setDateofBirth(date_of_birth); 
                     }
                     
                     
                     System.out.println("Enter you mobile model");					//taking phone number from user
                     String mobile=input.nextLine();
                     contact.setMobile(mobile);
                    
                     System.out.println("Enter your company name");					//Taking company name from user
                     String company=input.nextLine();
                     contact.setCompany(company);
                     
                     int ID = (int)((Math.random() * 456000)+34567);				//generating auto ID
                     contact.setID(ID);
                     phonebook.add_element(contact);
                     
                     System.out.println("Your information is saved successfully:");
                     System.out.println();
                     break;
    			}
    			
    			
    			
    			case 2:  //will delete specific user by providing the ID
    			{
    				System.out.println("Press 1: for deletion using name");
    				System.out.println("Press 2: for deletion using ID");
    				int answer=input.nextInt();
    				if(answer==1)
    				{
    					phonebook.bubbleSort_by_name();
    					int index=phonebook.binary_search_by_name();
    					phonebook.remove_index(index);
    					break;
    				}
    				if(answer==2)
    				{
    					phonebook.bubbleSort_by_ID();
    					int index=phonebook.binary_search_by_ID();
    					phonebook.remove_index(index);
        				break;
    				}
    				
					
    			}
    			
    			
    			
    		
    			case 3:   //display record of  user
    			{
    				System.out.println("Press 1: For viewing all records");
    				System.out.println("Press 2: For viewing specific records");
    				int answer=input.nextInt();
    				if(answer==1)						//option 1:for viewing all record
    				{	phonebook.bubbleSort_by_ID();
        				phonebook.display_elements();
        				break;
    				}
    				if(answer==2)						//option 2: for viewing specific record by providing the ID
    				{
    					System.out.println("Enter the ID of the user");
    					int ID=input.nextInt();
    					phonebook.view_record(ID);
    					break;
        			}
    			}
    			
    			
    			
    			case 4:											//for updating the record by providing the name
    			{
    				phonebook.bubbleSort_by_name();				//first we sort the users
    				int place=phonebook.binary_search_by_name();
    				phonebook.bubbleSort_by_name();				//after searching we again sort the names
    				phonebook.update_record(place);
    				break;
    			}
    			
    			
    			
    			case 5:														//for sorting the users
    			{
    				System.out.println("Press 1: For sort by name");
    				System.out.println("Press 2: For sort of ID");
    				int answer=input.nextInt();
    				if(answer==1)											//1: for sorting on the basis of name
    				{
        				phonebook.bubbleSort_by_name();
        				phonebook.display_elements();
        				break;
    				}
    				if(answer==2)											//2: for sorting on the basis of ID
    				{
    					phonebook.bubbleSort_by_ID();
        				phonebook.display_elements();
        				break;
    				}
    			}
    			
    			
    			
    			case 6:														//for searching the specific user
    			{
    				System.out.println("Press 1: For search by name");
    				System.out.println("Press 2: For search by ID");
    				int answer=input.nextInt();
    				if(answer==1)											//search on the basis of name
    				{
        				phonebook.bubbleSort_by_name();
        				int place=phonebook.binary_search_by_name();
        				phonebook.display_index_search(place);
        				break;
        			}
    				if(answer==2)											//search on the basis of ID
    				{
    					phonebook.bubbleSort_by_ID();
    					int place=phonebook.binary_search_by_ID();
        				phonebook.display_index_search(place);
        				break;
        			}
    			}
    			
    			
    			case 7:												//for birthday of same month
    			{
    				phonebook.birthday_checking();
    			}
    			
    			
    			case 8:
    			{
    				System.exit(0);
    			}
    		}
    	}
	}
}










