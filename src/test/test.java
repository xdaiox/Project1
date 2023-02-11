package test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

import userDao.UserDataAccessObject;
import bean.User;


public class test {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.kcg.gov.tw/dataset/d2e2a703-913b-4fc7-817f-6a7b985ab430/resource/46a07137-163f-4391-ad57-51668ba5ee75/download/.csv");
			InputStream openStream = url.openStream();
			InputStreamReader isr = new InputStreamReader(openStream);
			BufferedReader bufferedReader = new BufferedReader(isr);
			String str="";
			UserDataAccessObject userDao = new UserDataAccessObject();
			
			while((str=bufferedReader.readLine())!=null) {
				String[] split = str.split(",");
				
				if(split[0].equals("2017")) {
					User user = new User(split[0],split[1],split[2],split[3],split[4],split[5],
										 split[6],split[7],split[8],split[9],split[10],split[11]);
					System.out.println("2017"+userDao.createData(user));
				
				}else if(split[0].equals("2018")){
					User user = new User(split[0],split[1],split[2],split[3],split[4],split[5],
										 split[6],split[7],split[8],split[9],split[10],split[11]);
					System.out.println("2018"+userDao.createData(user));
				
				}else if(split[0].equals("2019")){
					User user = new User(split[0],split[1],split[2],split[3],split[4],split[5],
										 split[6],split[7],split[8],split[9],split[10],split[11]);
					System.out.println("2019"+userDao.createData(user));
				
				}else if(split[0].equals("2020")){
					User user = new User(split[0],split[1],split[2],split[3],split[4],split[5],
										 split[6],split[7],split[8],split[9],split[10],split[11]);
					System.out.println("2020"+userDao.createData(user));
				
				}else if(split[0].equals("2021")){
					User user = new User(split[0],split[1],split[2],split[3],split[4],split[5],
										 split[6],split[7],split[8],split[9],split[10],split[11]);
					System.out.println("2021"+userDao.createData(user));
				}
			}//(str=bufferedReader.readLine())!=null

			String strrs=userDao.findAllUser().toString();
			strrs = strrs.replace("[", "").replace("]", "");//刪除sql查詢時產生的中括弧
	        FileOutputStream fw = new FileOutputStream("C:\\Java\\workspace\\Project1\\Project1.csv");
	        OutputStreamWriter osw = new OutputStreamWriter(fw, "UTF-8");
	        osw.write(strrs);
	        System.out.println(strrs);
			
			osw.close();
			bufferedReader.close();
			isr.close();
			openStream.close();
		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println();
		
	}

}
