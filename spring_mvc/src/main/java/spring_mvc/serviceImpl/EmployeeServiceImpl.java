package spring_mvc.serviceImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring_mvc.dao.EmployeeDao;
import spring_mvc.model.EmployeeModel;
import spring_mvc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao empDao;

	@Override
	public EmployeeModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployee(EmployeeModel employee) {
		// TODO Auto-generated method stub
		empDao.saveEmployee(employee);

	}

	@Override
	public void deleteEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<EmployeeModel> findAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EmployeeModel findEmployeeBySsn(String ssn) {
		// TODO Auto-generated method stub
		return null;
	}

}
