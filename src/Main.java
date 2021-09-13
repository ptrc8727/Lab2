import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		List<Student> arr = new ArrayList<Student>();
		for(int i=0;i<10;i++) {
			
			
			String name = s.nextLine();
			Student a1 = new Student(name);
			a1.setName(name);
			arr.add(a1);
			
		}
		
		Collections.sort(arr, new StudentCom());
		
		for(int i = 0;i<arr.size();i++) {
			
			System.out.print(arr.get(i).toString());
			
		}
		
	}

}
