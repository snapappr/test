package org.jboss.tools.example.springmvc.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
//@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class UserStock implements Serializable
{
   /** Default value included to remove warning. Remove or modify at will. **/
   private static final long serialVersionUID = 1L;

   /*   @NotNull
   @Size(min = 10, max = 12)
   @Digits(fraction = 0, integer = 12)
   @Column(name = "phone_number")
   @Email
  
   @NotNull
   @Size(min = 1, max = 25)
   @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
*/
   
   @Id
   @GeneratedValue
   private Long id;   


   @Column(name = "device_id")
   private String deviceId;


   @Column(name = "account_name")
   private String accountName;
   
   
   @NotNull
   @Column(name = "us_id")
   private int usId;

   @NotNull
   @Column(name = "stock_name")
   private String stockName;

   @Column(name = "stock_long_name")
   private String stockLongName;
   
   @NotNull
   @Column(name = "s_type")
   private String sType;
   
   @Column(name = "current_value")
   private Double currentValue;
   
   @Column(name = "up_down")
   private String upDown;
   
   @Column(name = "change_price")
   private Double change;
   
   @Column(name = "change_percent")
   private Double changePercent;
   
   @Column(name = "last_check_value")
   private String lastCheckValue;
   
   @Column(name = "price_high")
   private Double priceHigh;
   
   @Column(name = "price_low")
   private Double priceLow;
//   private Double price52High;
//   private Double price52Low;
   @Column(name = "notify_condition")
   private String notifyCondition;
   @Column(name = "notify_gt_value")
   private Double notifyGtValue;
   @Column(name = "notify_lt_value")
   private Double notifyLtValue;
   @Column(name = "notify_gt_alert")
   private String notifyGtAlert;
   @Column(name = "notify_lt_alert")
   private String notifyLtAlert;
   @Column(name = "interval_value")
   private int intervalValue;
   @Column(name = "current_status_news")
   private String currentStatusNews;
   
   @Column(name = "current_status")
   private String currentStatus;
   @Column(name = "last_message_datetime")
   private Double lastMessageDateTime;
   @Column(name = "last_job_datetime")
   private Double lastJobDateTime;   
   @Column(name = "create_datetime")
   private Date createDateTime;
   
   @Column(name = "update_datetime", columnDefinition="DATETIME")
   @Temporal(TemporalType.TIMESTAMP)
   private Date updateDateTime;
   

   public Long getId() {
		return id;
	}
   
	public void setId(Long id) {
		this.id = id;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public int getUsId() {
		return usId;
	}
	public void setUsId(int usId) {
		this.usId = usId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockLongName() {
		return stockLongName;
	}
	public void setStockLongName(String stockLongName) {
		this.stockLongName = stockLongName;
	}
	public String getsType() {
		return sType;
	}
	public void setsType(String sType) {
		this.sType = sType;
	}
	public Double getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(Double currentValue) {
		this.currentValue = currentValue;
	}
	public String getUpDown() {
		return upDown;
	}
	public void setUpDown(String upDown) {
		this.upDown = upDown;
	}
	public Double getChange() {
		return change;
	}
	public void setChange(Double change) {
		this.change = change;
	}
	public Double getChangePercent() {
		return changePercent;
	}
	public void setChangePercent(Double changePercent) {
		this.changePercent = changePercent;
	}
	public String getLastCheckValue() {
		return lastCheckValue;
	}
	public void setLastCheckValue(String lastCheckValue) {
		this.lastCheckValue = lastCheckValue;
	}
	public Double getPriceHigh() {
		return priceHigh;
	}
	public void setPriceHigh(Double priceHigh) {
		this.priceHigh = priceHigh;
	}
	public Double getPriceLow() {
		return priceLow;
	}
	public void setPriceLow(Double priceLow) {
		this.priceLow = priceLow;
	}
	public String getNotifyCondition() {
		return notifyCondition;
	}
	public void setNotifyCondition(String notifyCondition) {
		this.notifyCondition = notifyCondition;
	}
	public Double getNotifyGtValue() {
		return notifyGtValue;
	}
	public void setNotifyGtValue(Double notifyGtValue) {
		this.notifyGtValue = notifyGtValue;
	}
	public Double getNotifyLtValue() {
		return notifyLtValue;
	}
	public void setNotifyLtValue(Double notifyLtValue) {
		this.notifyLtValue = notifyLtValue;
	}
	public String getNotifyGtAlert() {
		return notifyGtAlert;
	}
	public void setNotifyGtAlert(String notifyGtAlert) {
		this.notifyGtAlert = notifyGtAlert;
	}
	public String getNotifyLtAlert() {
		return notifyLtAlert;
	}
	public void setNotifyLtAlert(String notifyLtAlert) {
		this.notifyLtAlert = notifyLtAlert;
	}
	public int getIntervalValue() {
		return intervalValue;
	}
	public void setIntervalValue(int intervalValue) {
		this.intervalValue = intervalValue;
	}
	public String getCurrentStatusNews() {
		return currentStatusNews;
	}
	public void setCurrentStatusNews(String currentStatusNews) {
		this.currentStatusNews = currentStatusNews;
	}
	public String getCurrentStatus() {
		return currentStatus;
	}
	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}
	public Double getLastMessageDateTime() {
		return lastMessageDateTime;
	}
	public void setLastMessageDateTime(Double lastMessageDateTime) {
		this.lastMessageDateTime = lastMessageDateTime;
	}
	public Double getLastJobDateTime() {
		return lastJobDateTime;
	}
	public void setLastJobDateTime(Double lastJobDateTime) {
		this.lastJobDateTime = lastJobDateTime;
	}
	public Date getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Date createDateTime) {
		this.createDateTime = createDateTime;
	}
	public Date getUpdateDateTime() {
		return updateDateTime;
	}
	public void setUpdateDateTime(Date updateDateTime) {
		this.updateDateTime = updateDateTime;
	}
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
}