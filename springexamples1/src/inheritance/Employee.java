package inheritance;

public class Employee {
	String company;
	int empId;
	String name;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void showData()
	{
	System.out.println("Id:"+empId+" Name:"+name);
	System.out.println("Company:"+company);
	}

	
	
}
