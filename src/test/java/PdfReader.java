import java.io.IOException;

import com.testautomationguru.utility.PDFUtil;

public class PdfReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String file="C:\\Users\\Va185060\\Desktop\\sag\\dsw.pdf";
		PDFUtil util= new PDFUtil();
		//String content=util.getText(file); for entire file
		String content=util.getText(file,1,1);
		System.out.println(content);
		int count=util.getPageCount(file);
		System.out.println(count);
		

	}

}
