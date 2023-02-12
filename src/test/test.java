package test;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		boolean x = true;
		
		InputData inputData = new InputData();
		inputData.inputdata();//把網頁資料抓進資料庫
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("\n高雄市觀光旅館住客人次2017~2021，請輸入要查找的年份(若要查找全部請寫all) : ");
			String type = sc.next();
			
			if(type.equals("all")||type.equals("ALL")) {
				FindAllData findAllData = new FindAllData();
				findAllData.findalldata();//抓資料庫所有的檔案並匯出成CSV檔
				x=false;
				
			}else if(type.equals("2017")||type.equals("2018")||type.equals("2019")||type.equals("2020")||type.equals("2021")){
				FindDataByYear findDataByYear = new FindDataByYear();
				findDataByYear.findDataByYear(type);//抓特定年份的資料並匯出成CSV檔
				x=false;
				
			}else {
				System.out.println("輸入錯誤，請重新輸入");
			}
		}while(x);
		
		sc.close();
	}

}
