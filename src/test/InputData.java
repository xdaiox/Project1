package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import bean.User;
import userDao.UserDataAccessObject;

public class InputData {
	
	public void inputdata() {
		try {
			URL url = new URL("https://data.kcg.gov.tw/dataset/d2e2a703-913b-4fc7-817f-6a7b985ab430/"
					+ "resource/46a07137-163f-4391-ad57-51668ba5ee75/download/.csv");
			InputStream openStream = url.openStream();
			InputStreamReader isr = new InputStreamReader(openStream);
			BufferedReader bufferedReader = new BufferedReader(isr);
			String str="";
			UserDataAccessObject userDao = new UserDataAccessObject();
			
			while((str=bufferedReader.readLine())!=null) {
				String[] split = str.split(",");
				if(split[0]!=null) {
					User user = new User(split[0],split[1],split[2],split[3],split[4],split[5],
										split[6],split[7],split[8],split[9],split[10],split[11]);
					System.out.println(split[0]+" "+userDao.createData(user));
				}//split[0]!=null
			}//(str=bufferedReader.readLine())!=null
	
			bufferedReader.close();
			isr.close();
			openStream.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
