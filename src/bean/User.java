package bean;

public class User {
	private String Year;
	private String Total;
	private String OverseaChinese;
	private String Asia;
	private String Taiwan;
	private String Japan;
	private String AsiaLand;
	private String AsiaOther;
	private String Europe;
	private String AustraliaNewZealand;
	private String NorthAmerica;
	private String Other;
	
	@Override
	public String toString() {
		return "\n"+Year+","+Total+","+OverseaChinese+","+Asia+","+Taiwan+","+Japan
				+","+AsiaLand+","+AsiaOther+","+Europe+","+AustraliaNewZealand+","
				+NorthAmerica+","+Other;
	}
	
	
	public User(String Year,String Total,String OverseaChinese,String Asia,
			String Taiwan,String Japan,String AsiaLand,String AsiaOther,String Europe,
			String AustraliaNewZealand,String NorthAmerica,String Other)
	{
		this.Year=Year;
		this.Total=Total;
		this.OverseaChinese=OverseaChinese;
		this.Asia=Asia;
		this.Taiwan=Taiwan;
		this.Japan=Japan;
		this.AsiaLand=AsiaLand;
		this.AsiaOther=AsiaOther;
		this.Europe=Europe;
		this.AustraliaNewZealand=AustraliaNewZealand;
		this.NorthAmerica=NorthAmerica;
		this.Other=Other;
		
	}
	
	public User() {
		
	}
	
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getTotal() {
		return Total;
	}
	public void setTotal(String total) {
		Total = total;
	}
	public String getOverseaChinese() {
		return OverseaChinese;
	}
	public void setOverseaChinese(String overseaChinese) {
		OverseaChinese = overseaChinese;
	}
	public String getAsia() {
		return Asia;
	}
	public void setAsia(String asia) {
		Asia = asia;
	}
	public String getTaiwan() {
		return Taiwan;
	}
	public void setTaiwan(String taiwan) {
		Taiwan = taiwan;
	}
	public String getJapan() {
		return Japan;
	}
	public void setJapan(String japan) {
		Japan = japan;
	}
	public String getAsiaLand() {
		return AsiaLand;
	}
	public void setAsiaLand(String asiaLand) {
		AsiaLand = asiaLand;
	}
	public String getAsiaOther() {
		return AsiaOther;
	}
	public void setAsiaOther(String asiaOther) {
		AsiaOther = asiaOther;
	}
	public String getEurope() {
		return Europe;
	}
	public void setEurope(String europe) {
		Europe = europe;
	}
	public String getAustraliaNewZealand() {
		return AustraliaNewZealand;
	}
	public void setAustraliaNewZealand(String australiaNewZealand) {
		AustraliaNewZealand = australiaNewZealand;
	}
	public String getNorthAmerica() {
		return NorthAmerica;
	}
	public void setNorthAmerica(String northAmerica) {
		NorthAmerica = northAmerica;
	}
	public String getOther() {
		return Other;
	}
	public void setOther(String other) {
		Other = other;
	}

//	@Override
//	public String toString() {
//		return "\n"+Year+"\t"+Total+"\t"+OverseaChinese+"\t\t"+Asia+"\t"+Taiwan+"\t"+Japan
//				+"\t"+AsiaLand+"\t\t"+AsiaOther+"\t\t"+Europe+"\t"+AustraliaNewZealand+"\t\t\t"
//				+NorthAmerica+"\t\t"+Other;
//	}
	
	
//	
//	public Integer getYear() {
//		return Year;
//	}
//	public void setYear(Integer year) {
//		Year = year;
//	}
//	public Integer getTotal() {
//		return Total;
//	}
//	public void setTotal(Integer total) {
//		Total = total;
//	}
//	public Integer getOverseaChinese() {
//		return OverseaChinese;
//	}
//	public void setOverseaChinese(Integer overseaChinese) {
//		OverseaChinese = overseaChinese;
//	}
//	public Integer getAsia() {
//		return Asia;
//	}
//	public void setAsia(Integer asia) {
//		Asia = asia;
//	}
//	public Integer getTaiwan() {
//		return Taiwan;
//	}
//	public void setTaiwan(Integer taiwan) {
//		Taiwan = taiwan;
//	}
//	public Integer getJapan() {
//		return Japan;
//	}
//	public void setJapan(Integer japan) {
//		Japan = japan;
//	}
//	public Integer getAsiaLand() {
//		return AsiaLand;
//	}
//	public void setAsiaLand(Integer asiaLand) {
//		AsiaLand = asiaLand;
//	}
//	public Integer getAsiaOther() {
//		return AsiaOther;
//	}
//	public void setAsiaOther(Integer asiaOther) {
//		AsiaOther = asiaOther;
//	}
//	public Integer getEurope() {
//		return Europe;
//	}
//	public void setEurope(Integer europe) {
//		Europe = europe;
//	}
//	public Integer getAustraliaNewZealand() {
//		return AustraliaNewZealand;
//	}
//	public void setAustraliaNewZealand(Integer australiaNewZealand) {
//		AustraliaNewZealand = australiaNewZealand;
//	}
//	public Integer getNorthAmerica() {
//		return NorthAmerica;
//	}
//	public void setNorthAmerica(Integer northAmerica) {
//		NorthAmerica = northAmerica;
//	}
//	public Integer getOther() {
//		return Other;
//	}
//	public void setOther(Integer other) {
//		Other = other;
//	}


	
//	@Override
//	public String toString() {
//		return "User [year=" + year + ", totalpop=" + totalpop + ", asiaguy=" + asiaguy + "]";
//	}

	
	
}