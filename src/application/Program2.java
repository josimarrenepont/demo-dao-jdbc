package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("===TEST 1: Department findById ===");

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n===TEST 2: Department findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department d : list) {
			System.out.println(d);
		}
		//System.out.println("\n===TEST 3: Department insert ===");
		//Department newDepartment = new Department(null, "DVD");
		//departmentDao.insert(newDepartment);
		//System.out.println("Inserted! New Id: " + newDepartment.getId());

		//System.out.println("\n===TEST 4: Department Update ===");
		//Department department2 = departmentDao.findById(1);
		//department2.setName("Food");
		//departmentDao.update(department2);
		System.out.println("Update Completed");

		System.out.println("\n===TEST 5: Department Delete ===");
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Id delete completed");

		sc.close();
	}

}
