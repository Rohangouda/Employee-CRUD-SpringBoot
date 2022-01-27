package rohan.employee.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_employee")
public class Employee {

    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String EmployeeName;
    String email;
    String address;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}



}
