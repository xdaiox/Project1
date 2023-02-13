package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import bean.User;
import connUtil.ConnectionFactory;
import userDao.UserDataAccessObject;

public class function {
	
	public void inputData() {
		try {
			URL url = new URL("https://data.kcg.gov.tw/dataset/d2e2a703-913b-4fc7-817f-6a7b985ab430/"
					+ "resource/46a07137-163f-4391-ad57-51668ba5ee75/download/.csv");
			InputStream openStream = url.openStream();
			InputStreamReader isr = new InputStreamReader(openStream);
			BufferedReader bufferedReader = new BufferedReader(isr);
			String str="";
			UserDataAccessObject userDao = new UserDataAccessObject();
			int linecount = 0;
				
			while((str=bufferedReader.readLine())!=null) {
				if(linecount++>0) {
					String[] split = str.split(",");
						User user = new User(split[0],split[1],split[2],split[3],split[4],split[5],
											split[6],split[7],split[8],split[9],split[10],split[11]);
						System.out.println(split[0]+" "+userDao.createData(user));
					}			
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
	
	
	public void findAllData() {
		UserDataAccessObject userDao = new UserDataAccessObject();
		String strrs=userDao.findAllData().toString();
		String strSchema=outputSchema().toString();
		strSchema = strSchema.replace("[", "").replace("]", "");//刪除sql查詢時產生的中括弧
		strrs = strrs.replace("[", "").replace("]", "");//刪除sql查詢時產生的中括弧
		try {
			FileOutputStream fo = new FileOutputStream("C:\\Java\\workspace\\Project1\\Project1_all.csv");
	        OutputStreamWriter osw = new OutputStreamWriter(fo, "UTF-8");
	        osw.write(strSchema);
	        osw.write(strrs);
	        System.out.print(strSchema);
	        System.out.println(strrs);
	        
			osw.close();
			fo.close();

			
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
	
	
	public boolean findDataByYear(int type) {
		UserDataAccessObject userDao = new UserDataAccessObject();
		String strrs = userDao.findDataByYear(type).toString();
		String strSchema=outputSchema().toString();
		strSchema = strSchema.replace("[", "").replace("]", "");//刪除sql查詢時產生的中括弧
		strrs = strrs.replace("[", "").replace("]", "");//刪除sql查詢時產生的中括弧
       
		try {
			FileOutputStream fo = new FileOutputStream("C:\\Java\\workspace\\Project1\\Project1_"+type+".csv");
	        OutputStreamWriter osw = new OutputStreamWriter(fo, "UTF-8");
	        osw.write(strSchema);
	        osw.write(strrs);
	        System.out.print(strSchema);
	        System.out.println(strrs);
	        
			osw.close();
			fo.close();

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
		return true;
	}
	
	public User outputSchema() {
		User user;
		String sql = "select * from [HotelGuest]";
		ConnectionFactory connFactory = new ConnectionFactory();
		try(Connection conn = connFactory.getConnection()) {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ResultSetMetaData metaData = rs.getMetaData();
			user = new User(metaData.getColumnLabel(2),metaData.getColumnLabel(3),
					metaData.getColumnLabel(4),metaData.getColumnLabel(5),
					metaData.getColumnLabel(6),metaData.getColumnLabel(7),
					metaData.getColumnLabel(8),metaData.getColumnLabel(9),
					metaData.getColumnLabel(10),metaData.getColumnLabel(11),
					metaData.getColumnLabel(12),metaData.getColumnLabel(13));
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
