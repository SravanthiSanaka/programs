package collection;
import java.util.Enumeration;
import java.util.Vector;
public class VectorExample {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement("India");
		v.addElement("China");
		v.addElement("Japan");
		v.insertElementAt("America",2);
		System.out.println(v);
		v.remove(1);
		System.out.println(v);
		v.removeElementAt(2);
		System.out.println(v);
	}

}
