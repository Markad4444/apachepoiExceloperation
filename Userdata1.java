package baseclass11;

public class Userdata1 {
	private String userName;
	private String phoneNumber;
	private String emailId;
	private String address;
	private String city;
	public void setUserName(String userName)
	{
		userName="Mr."+userName;
		this.userName=userName;
	}
	public String getusername()
	{
		return userName;
	}

	public void setphoneNumber(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
		
	}
	public String getphoneNumber()
	{
		return phoneNumber;
	}
	public void setemailId(String emailId)
	{
		this.emailId=emailId;
	}
	public String getemailId()
	{
		return emailId;
	}
	public void setaddress(String address)
	{
		this.address=address;
	}
	public String getaddress()
	{
		return address;
	}
	public void setcity(String city)
	{
		this.city=city;
	}
	public String getcity()
	{
		return city;
	}

}
