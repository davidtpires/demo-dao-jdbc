package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("Hello world!!");
		System.out.println("=== TEST 1: findById =====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
//		Seller seller = sellerDao.findById(3);		
//		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: findAll =====");
		
		System.out.println("\n=== TEST 3: insert =====");
		
		System.out.println("\n=== TEST 4: update =====");
		
		System.out.println("\n=== TEST 5: delete =====");
		
	}

}
