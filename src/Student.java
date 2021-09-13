import java.util.Comparator;

public class Student{
	private String name;
	
	public Student(String name) {
		
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

class StudentCom implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
		
	}
	
	
	
}