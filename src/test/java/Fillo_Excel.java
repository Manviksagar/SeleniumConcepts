import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Fillo_Excel {

	public static void main(String[] args) throws FilloException {
		// TODO Auto-generated method stub
		
		Fillo fillo=new Fillo();
		Connection connection=fillo.getConnection("C:\\Users\\Va185060\\Desktop\\sag\\User.xlsx");
		String strQuery="Select * from Sheet1 ";
		Recordset recordset=connection.executeQuery(strQuery);
		 
		while(recordset.next()){
		System.out.println(recordset.getField("name"));
		}
		 
		recordset.close();
		connection.close();

	}

}
