package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id); // CONSULTAR NO BANCO SE ID EXISTI, SE NÃO EXISTIR RETORNA NULL
	List<Department> findAll(); // RETORNAR TODOS OS DEPARTAMENTOS
		
}	

