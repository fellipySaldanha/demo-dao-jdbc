package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Seller implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String email;
	private Date birthDate;
	private Double daseSalary;	
	private Department department;
	
	public Seller() {		
	}

	public Seller(int id, String name, String email, Date birthDate, Double daseSalary, Department department) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.daseSalary = daseSalary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getDaseSalary() {
		return daseSalary;
	}

	public void setDaseSalary(Double daseSalary) {
		this.daseSalary = daseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seller other = (Seller) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Seller [id=" + id + ", name=" + name + ", email=" + email + ", birthDate=" + birthDate + ", daseSalary="
				+ daseSalary + ", department=" + department + "]";
	}
	
	
	
}