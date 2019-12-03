package app.pages;


//import javax.persistence;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Hierarchy {
	@Id
	 private String userId ;
	@JsonProperty("name")
	 private String userName ;
	 private String password ;
	
	public Hierarchy () {
	}

	public Hierarchy (String password , String userName ) {
//		this.userId = id;
		this.userName = userName;
		this.password = password;
	}
	public Hierarchy (String id,String password,String userName ) {
		this.userId = id;
		this.userName = userName;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
