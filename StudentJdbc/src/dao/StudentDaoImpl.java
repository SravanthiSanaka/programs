package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import data.Student;

public class StudentDaoImpl implements IStudentDAO {
	JdbcTemplate jdbcTemplate;


	@Override
	public void create(Student student)
	{
		// TODO Auto-generated method stub
		String query="insert into student values('"+student.getId()+"','"+student.getName()+"','"+student.getAge()+"')";
		int result=jdbcTemplate.update(query);
		System.out.println(result+ "Record Inserted....");
	}
	@Override
	public Student getStudent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub

	}

}
