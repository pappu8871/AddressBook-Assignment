package addressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookUC4 {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String phonenumber;
	private String email;
	

	public AddressBookUC4 (String fn, String ln, String ad, String ct, String st, String zp, String ph, String em) {
		// TODO Auto-generated constructor stub
	
	firstName = fn;
	lastName= ln;
	address = ad;
	city = ct;
	state = st;
	zipcode = zp;
	phonenumber = ph;
	email = em;
}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


@SuppressWarnings("unchecked")
public static void main(String[] args) {
	
	ArrayList<AddressBookUC4> addressBook = new ArrayList<AddressBookUC4>();
	
	Scanner console = new Scanner(System.in);
	
	
	while(true)
	{

		System.out.println("1)Add a new contact");
		//System.out.println("2)Display all contacts");
		System.out.println("3)Delete a contact");
		System.out.println("-1) Quit");
		System.out.print("Enter Your choice: ");
		
		Scanner scn = new Scanner(System.in);
		
		int choice = scn.nextInt();
		scn.nextLine();
		switch(choice)
		
		{
		case 1:
		
			
			System.out.println("Enter First Name");
			String firstname = scn.next();
			
			System.out.println("Enter Last Name");
			String lastname = scn.next();
			
			System.out.println("Enter Address");
			String address = scn.next();
			
			System.out.println("Enter city");
			String city = scn.next();
			
			System.out.println("Enter State");
			String state = scn.next();
			
			System.out.println("Enter zipcode");
			String zipcode = scn.next();
			
			System.out.println("Enter phone Number");
		    String phonenumber = scn.next();
			
			System.out.println("Enter Email Id");
			String email = scn.next();
			
			
			System.out.println("First Name"  +firstname);
			System.out.println("Last Name"  +lastname);
			System.out.println("Address"  +address);
			
			System.out.println("City Name"  +city);
			System.out.println("Statet Name"  +state);
			System.out.println("ZipCode"  +zipcode);
			System.out.println("Phone Number"  +phonenumber);
			System.out.println("email id" +email);
			
//			addressBook.add(new AddressBookUC4(firstname, lastname, address, city,
//					state, zipcode, phonenumber, email));
		
			//contacts.add(new Contact(fn, ln, pn

		

			break;
		

//	case 2:
//		for(int i = 0; i < AddressBookUC4.size(); i++)
//		{
//			AddressBookUC4 a = AddressBookUC4.get(i);
//			
//	System.out.print(a.getFirstName() + "  " + a.getLastName() + "; ");
//	System.out.print("Address: " + a.getAddress());
//	System.out.print("city: " + a.getCity());
//	System.out.print("State: " + a.getState());
//	System.  out.print("zipcode: " + a.getZipcode());
//	System.out.print("Phone number: " + a.getPhonenumber());
//	System.out.print("; Email: " + 	a.getEmail());
//			System.out.println();
//		}
//		
//		break;
//		
		
	case 3:
		System.out.println("Enter an information piece about person:");
					String someInfo = scn.nextLine();
					AddressBookUC4 AddressBookUC4 = findPerson(addressBook, someInfo);
		if(addressBook != null)
		{
			System.out.print(AddressBookUC4.getFirstName() + "  " + AddressBookUC4.getLastName() + "; ");
			System.out.print("Address: " + AddressBookUC4.getAddress());
			System.out.print("city: " + AddressBookUC4.getCity());
			System.out.print("State: " + AddressBookUC4.getState());
			System.out.print("zipcode: " + AddressBookUC4.getZipcode());
			System.out.print("Phone number: " + AddressBookUC4.getPhonenumber());
			System.out.print("; Email: " + 	AddressBookUC4.getEmail());
					System.out.println();
				
		System.out.println("Are you sure to delete detail ? (Y/N)");
		String delete = scn.nextLine();
		if(delete.equalsIgnoreCase("y"))
		{
			((List<addressBook.AddressBookUC4>) AddressBookUC4).remove(AddressBookUC4);
       System.out.println("detail deleted successfully.");
		}
		}

     else
   System.out.println("Detail not found.");
        break;
			}
	
	if(choice == -1)
		break;

	System.out.println("___________________________________________");
}	
}



private static AddressBookUC4 get(int i) {
	// TODO Auto-generated method stub
	return null;
}


private static int size() {
	// TODO Auto-generated method stub
	return 0;
}




private static AddressBookUC4 findPerson(ArrayList<AddressBookUC4> AddressBookUC4, String info)
{
	AddressBookUC4 a = null;
	for(int i = 0; i < AddressBookUC4.size(); i++)
	{
		
		if(AddressBookUC4.get(i).getFirstName().
				indexOf(info) != -1)
			a = AddressBookUC4.get(i);

		if(AddressBookUC4.get(i).getLastName().
				indexOf(info) != -1)
			a = AddressBookUC4.get(i);
		
		if(AddressBookUC4.get(i).getAddress().
				indexOf(info) != -1)
			a = AddressBookUC4.get(i);
		
		if(AddressBookUC4.get(i).getCity().
				indexOf(info) != -1)
			a = AddressBookUC4.get(i);
		
		if(AddressBookUC4.get(i).getState().
				indexOf(info) != -1)
			a = AddressBookUC4.get(i);
		if(AddressBookUC4.get(i).getZipcode().
				indexOf(info) != -1)
			a = AddressBookUC4.get(i);
		
		 if(AddressBookUC4.get(i).getPhonenumber().
				indexOf(info) != -1)
			a = AddressBookUC4.get(i);

		if(AddressBookUC4.get(i).getEmail().
				indexOf(info) != -1)
			a = AddressBookUC4.get(i);
	}
	return a;
	
	
		}

	}


