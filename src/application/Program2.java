package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.etities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		
		System.out.println("===TESTE 1: findById===");
		Department dep = depDao.finById(1);
		System.out.println(dep);
		
		System.out.println("===TESTE 2: findAll===");
		List<Department> list = depDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		/*System.out.println("===TESTE 3: Insert===");
		Department newDep = new Department(null, "Music");
		depDao.insert(newDep);
		System.out.println("Inserted! New id: " + newDep.getId());*/
		
		System.out.println("===TESTE 4: Update===");
		dep = depDao.finById(6);
		dep.setName("Kitchen");
		System.out.println(dep);
		depDao.update(dep);
		System.out.println("Update complete!");
		
		System.out.println("===TESTE 5: Delete===");
		System.out.print("Enter id for delete: ");
		int id = sc.nextInt();
		depDao.deletById(id);
		System.out.println("Delete completed!");
	}
}
