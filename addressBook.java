package addressBook;

import java.util.List;
import java.util.Scanner;

public class AddressBookTest4 {

	
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
	
	
	public  AddressBookTest4 (String firstName, String lastName, String address, String city, String state,
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

public static void main(String args[]) 
{
	
	Scanner scan = new Scanner(System.in);
	String[] array = new String[8]; 
	String[] arr2 = new String[6];
	int i,size=8;

	String firstName, lastName, address, city,  state,zipcode,  phonenumber,  email; 
	AddressBookTest4 a = new AddressBookTest4 ("Pappu", "kumar", "Behat North", "Jhanjharpur", "Bihar", "847403", "8871312779","pappu@gmail.com");
	
	
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
	
	System.out.println("Person data in array:");
	
	for ( i = 0; i < size; i++) 
	{
		System.out.println(array[i]);
	}
	
	System.out.println("Enter which location you want to be delete:");
	int delet = scan.nextInt();
	System.out.println("Are you sure to delete detailn:");
	String name = scan.next();

	for (int j = delet ; j < size-1; j++) 
	{
		array[j]=array[j+1];
	}
	size -= 1;
	
	System.out.println("Array after deletion:");
	for( i = 0; i < size ; i++ )
	{
		System.out.println(array[i]);
	}
}
}
