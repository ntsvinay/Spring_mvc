package spring_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import spring_mvc.model.EmployeeModel;
import spring_mvc.service.EmployeeService;

@Controller
@ResponseBody
public class EmployeeC {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/new_emp")
	public String save_new_emp() {
		EmployeeModel em = new EmployeeModel();
		em.setF_name("vinay");
		em.setL_name("baghel");
		// em.setEmp_id(0);
		em.setSalary(1000);
		em.setSsn("1002");
		employeeService.saveEmployee(em);
		return "vinay";
	}

}
