package app.pages;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Hierarchy {
	@Id
	 private String user_id ;
	 private String user_name ;
	 private String password ;
	
	public Hierarchy () {
	}

	public Hierarchy (String id, String user_name , String password) {
		this.user_id = id;
		this.user_name = user_name;
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return user_id;
	}

	public void setId(String id) {
		this.user_id = id;
	}

	public String getName() {
		return user_name;
	}

	public void setName(String name) {
		this.user_name = name;
	}
	
	
}
