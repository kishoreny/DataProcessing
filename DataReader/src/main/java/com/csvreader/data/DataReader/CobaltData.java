package com.csvreader.data.DataReader;

public class CobaltData {
	private String date;
	private String cash_buyer;
	private String cash_seller;
	private String three_month_buyer;
	private String three_month_seller;
	private String yearly_buyer;
	private String yearly_seller;
	public String getDate() {
		
		return date;
	}
	public void setDate(String csv_rows) {
		this.date = csv_rows;
	}
	public String getCash_buyer() {
		return cash_buyer;
	}
	public void setCash_buyer(String csv_rows) {
		this.cash_buyer = csv_rows;
	}
	public String getCash_seller() {
		return cash_seller;
	}
	public void setCash_seller(String cash_seller) {
		this.cash_seller = cash_seller;
	}
	public String getThree_month_buyer() {
		return three_month_buyer;
	}
	public void setThree_month_buyer(String three_month_buyer) {
		this.three_month_buyer = three_month_buyer;
	}
	public String getThree_month_seller() {
		return three_month_seller;
	}
	public void setThree_month_seller(String three_month_seller) {
		this.three_month_seller = three_month_seller;
	}
	public String getYearly_buyer() {
		return yearly_buyer;
	}
	public void setYearly_buyer(String yearly_buyer) {
		this.yearly_buyer = yearly_buyer;
	}
	public String getYearly_seller() {
		return yearly_seller;
	}
	public void setYearly_seller(String yearly_seller) {
		this.yearly_seller = yearly_seller;
	}
	
	

}
