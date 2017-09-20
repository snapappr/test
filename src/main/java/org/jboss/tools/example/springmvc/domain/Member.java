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
////@Table(uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Member implements Serializable
{  
   /** Default value included to remove warning. Remove or modify at will. **/
   private static final long serialVersionUID = 1L;

   @Id
   @GeneratedValue
   private Long id;   

//   @NotNull
//   @Size(min = 1, max = 25)
//   @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
   @Column(name = "account_name")
   private String accountName;

//   @NotNull
//   @NotEmpty
   @Email
   private String email;

//   @NotNull
//   @Size(min = 10, max = 12)
//   @Digits(fraction = 0, integer = 12)
   @Column(name = "device_id")
   private String deviceId;

   @Column(name = "check_interval")
   private int checkInterval;
   
   @Column(name = "notify_alert")
   private boolean notifyAlert;
   

   @Column(name = "pref_lang")
   private String prefLang;
   
   
   @Column(name = "hk_open")
   private String hkOpen;
   

   @Column(name = "hk_close")
   private String hkClose;
   

   @Column(name = "us_open")
   private String usOpen;
   

   @Column(name = "us_close")
   private String usClose;
   
   
   @Column(name = "create_datetime", columnDefinition="DATETIME")
   private Date createDateTime;
   
   @Column(name = "update_datetime", columnDefinition="DATETIME")
   private Date updateDateTime;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getAccountName() {
		return accountName;
	}
	
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDeviceId() {
		return deviceId;
	}
	
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	
	public int getCheckInterval() {
		return checkInterval;
	}
	
	public void setCheckInterval(int checkInterval) {
		this.checkInterval = checkInterval;
	}
	
	public boolean isNotifyAlert() {
		return notifyAlert;
	}
	
	public void setNotifyAlert(boolean notifyAlert) {
		this.notifyAlert = notifyAlert;
	}
	
	public String getPrefLang() {
		return prefLang;
	}
	
	public void setPrefLang(String prefLang) {
		this.prefLang = prefLang;
	}
	
	public String getHkOpen() {
		return hkOpen;
	}
	
	public void setHkOpen(String hkOpen) {
		this.hkOpen = hkOpen;
	}
	
	public String getHkClose() {
		return hkClose;
	}
	
	public void setHkClose(String hkClose) {
		this.hkClose = hkClose;
	}
	
	public String getUsOpen() {
		return usOpen;
	}
	
	public void setUsOpen(String usOpen) {
		this.usOpen = usOpen;
	}
	
	public String getUsClose() {
		return usClose;
	}
	
	public void setUsClose(String usClose) {
		this.usClose = usClose;
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
   
}