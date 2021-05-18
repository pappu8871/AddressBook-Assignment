package addressBook;

import java.util.Scanner;

public class AddressBookUC3 {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String phonenumber;
	private String email;
	

//	public AddressBookUC3 (String firstName, String lastName, String address, String city, String state,
//			String zipcode, String phonenumber, String email) {
//		// TODO Auto-generated constructor stub
//	
//	this.firstName = "";
//	this.lastName = "";
//	this.address = "" ;
//	this.city = "";
//	this.state = "";
//	this.zipcode = "";
//	this.phonenumber = "";
//	this.email = "";
//}


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
	
	
	public AddressBookUC3 (String firstName, String lastName, String address, String city, String state,
			String zipcode, String phonenumber, String email) {
		// TODO Auto-generated constructor stub
	setFirstName(firstName);
	setLastName(lastName);
	setAddress(address);
	setCity(city);
	setState(state);
	setZipcode(zipcode);
	setPhonenumber(phonenumber);
	setEmail(email);

	
	
}
	
		
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);	
			
			
			String[] AddressBookUC3 = new String[8]; 
			int i;
			String firstName, lastName, address, city,  state,
			 zipcode,  phonenumber,  email; 
			AddressBookUC3 a = new AddressBookUC3 ("pappu", "kumar", "Behat", "Jhanjharpur", "Bihar", "847403", "8871312779","pappu@gmail.com");
			
			firstName=a.getFirstName();
			lastName=a.getLastName();
			address=a.getAddress();
			city=a.getCity();
			state=a.getState();
			zipcode=a.getZipcode();
			phonenumber=a.getPhonenumber();
			email=a.getEmail();
					
			AddressBookUC3[0] = firstName;
			AddressBookUC3[1] = lastName;
			AddressBookUC3[2] = address;
			AddressBookUC3[3] = city;
			AddressBookUC3[4] = state;
			AddressBookUC3[5] = zipcode;
			AddressBookUC3[6] = phonenumber;
			AddressBookUC3[7] = email;

			System.out.println("Person data in array:");
			
			for ( i = 0; i < AddressBookUC3.length; i++) 
			{
				System.out.println(AddressBookUC3[i]);
			}
			
			System.out.println("Enter location you need to update:");
			int loc = scn.nextInt();
			System.out.println("Select Delete Details:");
			String isEdit = scn.next();
			System.out.println("Enter your name for verification:");
			String name = scn.next();
			
			for( i = 0; i< AddressBookUC3.length; i++ )
			{
				if ( name.equals(firstName)  && loc == i )
				{
					AddressBookUC3[i]=isEdit;
				}
			}
			
			System.out.println("Array after modification:");
			for( i = 0; i <AddressBookUC3.length; i++ )
			{
				System.out.println(AddressBookUC3[i]);
			
       }
	}
		
}

