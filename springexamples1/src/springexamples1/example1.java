package springexamples1;

import java.util.Iterator;
import java.util.List;

public class example1 {

	String id;
	String name;
	List<String> answers;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void showAnswers()
	{
	System.out.println("Id: "+id+"Name :"+name);
	Iterator<String> itr=answers.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	}
	}
	
	

