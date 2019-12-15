package spring_mvc.service;

import java.util.List;

import spring_mvc.model.EmployeeModel;

public interface EmployeeService {
	EmployeeModel findById(int id);

	void saveEmployee(EmployeeModel employee);

	void deleteEmployeeBySsn(String ssn);

	List<EmployeeModel> findAllEmployees();

	EmployeeModel findEmployeeBySsn(String ssn);

}
