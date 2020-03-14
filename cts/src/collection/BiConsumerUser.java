package collection;
import java.util.ArrayList;
import java.util.function.BiConsumer;

class TempEmp
{
	String name;
	double salary;
	public TempEmp(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "TempEmp [name=" + name + ", salary=" + salary + "]";
	}
	
}

public class BiConsumerUser {

	public static void main(String[] args) {
	ArrayList<TempEmp> l=new ArrayList();
	l.add(new TempEmp("Durga",1000));
	l.add(new TempEmp("Dinesh",2000));
	l.add(new TempEmp("Darling",3000));
	l.add(new TempEmp("Dithi",4000));
	BiConsumer<TempEmp,Double> c=(e,d)->e.salary=e.salary+d;
	for(TempEmp e:l) {
		c.accept(e, 500.0);
	}
	for(TempEmp e:l) {
		System.out.println("employee name:"+e.name);
		System.out.println("employee salary:"+e.salary);
		System.out.println();
	}
	
	

	}

}
