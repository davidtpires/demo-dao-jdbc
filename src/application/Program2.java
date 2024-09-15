package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Hello world!!");
		System.out.println("=== TEST 1: findById =====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: findAll =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("\n=== TEST 3: insert =====");
		
		System.out.println("\n=== TEST 4: update =====");
		
		System.out.println("\n=== TEST 5: delete =====");
		
	}

}
