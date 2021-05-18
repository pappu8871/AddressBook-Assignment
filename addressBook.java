package addressBook;

import java.util.Scanner;

public class AddressBookUc1 {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String phonenumber;
    private String email;


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
	
	
	public  AddressBookUc1 (String firstName, String lastName, String address, String city, String state,
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
	
	
//public static void main(String[] args) {
//// TODO Auto-generated method stub
//Scanner scn = new Scanner(System.in);
//
//System.out.println("Enter First Name");
//String firstname = scn.next();
//
//System.out.println("Enter Last Name");
//String lastname = scn.next();
//
//System.out.println("Enter Address");
//String address = scn.next();
//
//System.out.println("Enter city");
//String city = scn.next();
//
//System.out.println("Enter State");
//String state = scn.next();
//
//System.out.println("Enter zipcode");
//String zipcode = scn.next();
//
//System.out.println("Enter phone Number");
//String phonenumber = scn.next();
//
//System.out.println("Enter Email Id");
//String emailid = scn.next();
//
//
//System.out.println("First Name"  +firstname);
//System.out.println("Last Name"  +lastname);
//System.out.println("Address"  +address);
//System.out.println("City Name"  +city);
//System.out.println("Statet Name"  +state);
//System.out.println("ZipCode"  +zipcode);
//System.out.println("Phone Number"  +phonenumber);
//System.out.println("email id" +emailid);
// 
//}

public static void main(String[] args) {

Scanner scn = new Scanner(System.in);	

String[] array = new String[8]; 
int i;
String firstName, lastName, address, city,  state,zipcode,  phonenumber,  email; 
AddressBookUc1 a = new AddressBookUc1 ("Pappu", "kumar", "Behat North", "Jhanjharpur", "Bihar", "847403", "8871312779","pappu@gmail.com");

firstName = a.getFirstName();
lastName = a.getLastName();
address = a.getAddress();
city = a.getCity();
state = a.getState();
zipcode = a.getZipcode();
phonenumber = a.getPhonenumber();
email = a.getEmail();
		
array [0] = firstName;
array [1] = lastName;
array [2] = address;
array [3] = city;
array [4] = state;
array [5] = zipcode;
array [6] = phonenumber;
array [7] = email;

System.out.println(" Person Detail in array:");
System.out.println("------------------------");

for ( i = 0; i < array.length; i++) 
{
	System.out.println(array[i]);
}

}
}
	

