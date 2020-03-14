package examples;
import java.util.ArrayList;
import java.util.function.Predicate;
class Emp{
	String name;
	String desg;
	float salary;
	String city;
	public Emp(String name, String desg, float salary,String city) {
		super();
		this.name = name;
		this.desg = desg;
		this.salary = salary;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Emp [name=" + name + ", desg=" + desg + ", salary=" + salary + ", city=" + city + "]";
	}

	public boolean equals(Object obj)
	{
		Emp e=(Emp)obj;
		if(desg.equals(e.desg) && name.equals(e.name)&& salary.equals(e.salary) &&city.equals(e.city))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

public class PredicateEmpTest {

	public static void main(String[] args) {
		Emp e1=new Emp("Bannu","CEO",30000,"hyd");
		Emp e2=new Emp("chinni","manager",35000,"Chennai");
		Emp e3=new Emp("soppu","manager",50000,"banglore");
		Emp e4=new Emp("ram","lead",40000,"chennai");
		Emp e5=new Emp("venu","lead",70000,"banglore");
		Emp e6=new Emp("sarala","developer",60000,"hyd");
		Predicate<Emp> p1=emp->emp.desg.equals("manager");
		Predicate<Emp> p2=emp->emp.city.equals("banglore");
		Predicate<Emp> p3=emp->emp.salary<70000;
		ArrayList<Emp> list=new ArrayList<Emp>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		display(p1,list);
	}
	public static void display(Predicate<Emp> p,ArrayList<Emp>List) {
		for(Emp e:List)
		{
			if(p.test(e))
			{
				System.out.println(e);
			}
		}
	}
	
	}

}
