package com.wsh.bean;

public class Resgion {
	private String province;
	private String city;
	private String county;
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	@Override
	public String toString() {
		return "Resgion [province=" + province + ", city=" + city + ", county=" + county + "]";
	}
	
	
}
