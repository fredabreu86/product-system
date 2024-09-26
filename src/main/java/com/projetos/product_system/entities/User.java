package com.projetos.product_system.entities;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.Objects;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
=======

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name="tb_user")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> 01287a7 (Banco de dados H2, TEST profile e JPA)
	private Long id;
	private String name;
	private String email;
	private String phone;
<<<<<<< HEAD
	private String passord;
	
	public User() {
		
	}
	public User(Long id, String name, String email, String phone, String passord) {
		
=======
	private String password;

	public User() {
	}

	public User(Long id, String name, String email, String phone, String password) {

>>>>>>> 01287a7 (Banco de dados H2, TEST profile e JPA)
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
<<<<<<< HEAD
		this.passord = passord;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassord() {
		return passord;
	}
	public void setPassord(String passord) {
		this.passord = passord;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
=======
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

>>>>>>> 01287a7 (Banco de dados H2, TEST profile e JPA)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
<<<<<<< HEAD
		return Objects.equals(id, other.id);
	}
	
	
=======
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
>>>>>>> 01287a7 (Banco de dados H2, TEST profile e JPA)
}
