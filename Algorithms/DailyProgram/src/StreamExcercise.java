import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExcercise {

	public static void main(String[] args) {

		List<EmployeeDetails> list = new ArrayList<EmployeeDetails>();

		list.add(new EmployeeDetails("Anu", "LA",2000,"IT"));
		list.add(new EmployeeDetails("Banu", "LA",3000,"ADMIN"));
		list.add(new EmployeeDetails("Zaheer", "LA",4000,"IT"));
		list.add(new EmployeeDetails("Yuavra", "LA",5000,"ADMIN"));

		list.add(new EmployeeDetails("Kumar", "SFA",6000,"Security"));
		list.add(new EmployeeDetails("Yello", "SFA",1000,"IT"));
		list.add(new EmployeeDetails("Uta", "SFA",2000,"IT"));
		list.add(new EmployeeDetails("Daddy", "SFA",3000,"Security")); 
		
		
		/**** 
		 * Distinct demo
		 */
		
	List<String> result=list.stream().map(e->e.getCity()).distinct().collect(Collectors.toList());
	System.out.println(result); 
	
	Comparator<EmployeeDetails> com=new Comparator<EmployeeDetails>() {

		@Override
		public int compare(EmployeeDetails o1, EmployeeDetails o2) {
			// TODO Auto-generated method stub
			return o2.getSalary()-o1.getSalary();
		} 
	    	
	};
	
	List<Integer> result2=list.stream().sorted(com).map(p->p.getSalary()).collect(Collectors.toList()); 
	  System.out.println(result2);
	  
	List<EmployeeDetails> result3=  list.stream().filter(p->p.getSalary()>3000).peek(System.out::println).collect(Collectors.toList());
	
	result3.stream().forEach(p->System.out.println(p.getName()));
	} 
	

}
