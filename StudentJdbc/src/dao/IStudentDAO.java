package dao;

import java.util.List;

import data.Student;

public interface IStudentDAO
{
	
	public void create(Student student );
	
	public Student getStudent(Integer id);
	
	public List<Student> getStudents();
	
	public void delete(Integer id);
	
	public void update(Student student);

}
