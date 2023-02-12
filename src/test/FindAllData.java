package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import userDao.UserDataAccessObject;

public class FindAllData {
	
	public void findalldata() {
		UserDataAccessObject userDao = new UserDataAccessObject();
		String strrs=userDao.findAllData().toString();
		strrs = strrs.replace("[", "").replace("]", "");//刪除sql查詢時產生的中括弧
		try {
			FileOutputStream fw = new FileOutputStream("C:\\Java\\workspace\\Project1\\Project1_all.csv");
	        OutputStreamWriter osw = new OutputStreamWriter(fw, "UTF-8");
	        osw.write(strrs);
	        System.out.println(strrs);
			
			osw.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
