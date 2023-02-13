package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		boolean x = true;
		
		function function = new function();
		function.inputData();//把網頁資料抓進資料庫
		
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("\n高雄市觀光旅館住客人次2017~2021，請輸入要查找的年份(若要查找全部請寫all) : ");
			String type = sc.next();
			int year =0;
			
			try {
				Integer.parseInt(type);
				year = Integer.parseInt(type);
				function.findDataByYear(year);//抓特定年份的資料並匯出成CSV檔
				x=false;
				
		    } catch (NumberFormatException e) {
		    	if(type.equals("all")||type.equals("ALL")) {
		    		function.findAllData();//抓資料庫所有的檔案並匯出成CSV檔
		    		x=false;
		    	}else {
		    		System.out.println("輸入錯誤，請重新輸入");
		    	}
		    }catch (NullPointerException n) {}
		}while(x);
		
		sc.close();
	}
	
}
