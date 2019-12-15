package spring_mvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "employee_details")
public class EmployeeModel {

	@Id
	@GeneratedValue
	private int emp_id;

	@Column(name = "first_name")
	private String f_name;
	@Column(name = "last_name")
	private String l_name;
	@Column(name = "emp_salary")
	private int salary;

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	@Override
	public String toString() {
		return "EmployeeModel [emp_id=" + emp_id + ", f_name=" + f_name + ", l_name=" + l_name + ", salary=" + salary
				+ ", ssn=" + ssn + "]";
	}

	public String getL_name() {
		return l_name;
	}

	
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@NotEmpty
	@Column(name = "SSN_number", unique = true, nullable = false)
	private String ssn;

}
