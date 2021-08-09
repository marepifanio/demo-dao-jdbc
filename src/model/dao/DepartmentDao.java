package model.dao;

import java.util.List;

import model.etities.Department;

public interface DepartmentDao {
	void insert(Department obj);

	void update(Department obj);

	void deletById(Integer id);

	Department finById(Integer id);

	List<Department> findAll();
}
