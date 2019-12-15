package spring_mvc.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import spring_mvc.dao.EmployeeDao;
import spring_mvc.model.EmployeeModel;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public EmployeeModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployee(EmployeeModel employee) {
		// TODO Auto-generated method stub
		Session ss = sessionFactory.openSession();
		ss.beginTransaction();
		ss.saveOrUpdate(employee);
		ss.getTransaction().commit();
		ss.close();

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
