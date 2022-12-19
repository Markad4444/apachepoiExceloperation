package baseclass11;

public class Homepage1 {

	public static void main(String[] args) {

		Userdata1 k= new Userdata1();
		k.setUserName("vitthal");
		k.setphoneNumber("8788992331");
		k.setemailId("vimarkad.369@gmail.com");
		k.setaddress("subBeed");
		k.setcity("Beed");
		Userdata1 k1= new Userdata1();
		k1.setUserName("mayur");
		k1.setphoneNumber("9049221706");
		k1.setemailId("mayur@123");
		k1.setaddress("subjalgoan");
		k1.setcity("jalgoan");
				
		System.out.println(k.getusername()+"  "+ k.getphoneNumber()+"  "+k.getemailId()+"  "+ k.getaddress()+"  "+ k.getcity());

			System.out.println(k1.getusername()+"  "+k1.getphoneNumber()+"  "+k1.getemailId()+"  "+k1.getaddress()+"  "+ k1.getcity());
			}	
	}



