package com.iries.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author hirday
 *
 */
@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="iduser")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idUser;
	
	private String name;
	
	private String password;
	
	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString(){
		return "id="+idUser+", name="+name+", password="+password;
	}
}
