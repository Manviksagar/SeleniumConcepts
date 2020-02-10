import org.apache.commons.codec.binary.Base64;

public class Password_Encode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String passWord="Sagar@12345";
		
	byte[] encodePass=Base64.encodeBase64(passWord.getBytes());
	
	System.out.println("The encoded Password " + new String(encodePass));
	
	byte[] decodepass=Base64.decodeBase64(encodePass);
	System.out.println("The encoded Password " + new String(decodepass));
	

	}

}
 