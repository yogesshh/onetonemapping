package com.scp.onetoonemapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

  @Entity
  @Table(name="USER")
  public class UserDetails {
	public UserDetails() {
		super();
	}

	public UserDetails(int userId, String userName, Vehicle vehicle) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.vehicle = vehicle;
	}

	@Id
	@Column(name="USER_ID")
	int userId;
	@Column(name="USER_NAME")
	String userName;
	
	@OneToOne
	@JoinColumn(name="VEH_ID")
	private Vehicle vehicle;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userName=" + userName + ", vehicle=" + vehicle + "]";
	}
	
	

}
