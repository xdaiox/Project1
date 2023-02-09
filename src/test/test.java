package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;

public class test {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.kcg.gov.tw/dataset/d2e2a703-913b-4fc7-817f-6a7b985ab430/resource/46a07137-163f-4391-ad57-51668ba5ee75/download/.csv");
			InputStream openStream = url.openStream();
			InputStreamReader isr = new InputStreamReader(openStream);
			BufferedReader bufferedReader = new BufferedReader(isr);
			String str="";
			
			while((str=bufferedReader.readLine())!=null) {
				String[] split = str.split(",");
				
				if(split[0].equals("2017")) {
					System.out.println("yes2017");
					for (int i = 0; i < split.length; i++) {
						
					}
				}else if(split[0].equals("2018")){
					
				}else if(split[0].equals("2019")){
					
				}else if(split[0].equals("2020")){
					
				}else if(split[0].equals("2021")){
					
				}
//				for (int i = 0; i < split.length; i++) {
//					String string = split[i];
//					System.out.println(string);
//				}
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
