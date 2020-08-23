import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ClientDetails {

	public Map<String, Integer> employeeCount(List<EmployeeDetails> list) {

		Map<String, Integer> result = new HashMap<String, Integer>();

		// list.stream().collect(Collectors.groupingBy(())

		//
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<EmployeeDetails> list = new ArrayList<EmployeeDetails>();

		list.add(new EmployeeDetails("Anu", "LA",2000,"IT"));
		list.add(new EmployeeDetails("Banu", "LA",3000,"ADMIN"));
		list.add(new EmployeeDetails("Zaheer", "LA",4000,"IT"));
		list.add(new EmployeeDetails("Yuavra", "LA",5000,"ADMIN"));

		list.add(new EmployeeDetails("Kumar", "SFA",6000,"Security"));
		list.add(new EmployeeDetails("Yello", "SFA",1000,"IT"));
		list.add(new EmployeeDetails("Uta", "SFA",2000,"IT"));
		list.add(new EmployeeDetails("Daddy", "SFA",3000,"Security"));

		Map<String, Long> result = list.stream()
				.collect(Collectors.groupingBy(EmployeeDetails::getCity, Collectors.counting()));
       // list.stream().filter( (s)-> s.getCity().startsWith("L")).map();
		System.out.println(result.keySet());
		System.out.println(result.values()); 
		
		Map<String, Integer> result1 = list.stream().collect(
				Collectors.groupingBy(EmployeeDetails::getDept, Collectors.summingInt(EmployeeDetails::getSalary)));
		System.out.println(result1.keySet());
		System.out.println(result1.values());  
		
		Map<String, Map<String, List<EmployeeDetails>>> result2 = list.stream().collect(
				Collectors.groupingBy(EmployeeDetails::getName, Collectors.groupingBy(EmployeeDetails::getDept)));
		System.out.println(result2.keySet());
		System.out.println(result2.values());  
			
		
		List<Integer> filter= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> result3=filter.stream().filter(n-> n%2==0).collect(Collectors.toList());
		
		System.out.println(result3);
		
		
		Predicate<Integer> predicate=new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				
				if(t%2==0) {
					return true;
				}
				
				return false;
			} 
			
		};
		List<Integer> result4=filter.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(result4); 
		
		Predicate<EmployeeDetails> predicate1=new Predicate<EmployeeDetails>() { 
			public boolean test(EmployeeDetails emp) { 
				if(emp.getDept().startsWith("I")) { 
					return true;
				}
				return false;
			}
		};
		
	    Function<EmployeeDetails,String> function=new Function<EmployeeDetails,String>() {

			@Override
			public String apply(EmployeeDetails t) {
				return t.getDept();
			}
	    	
	    };
		
		List<String> result5=list.stream().filter(predicate1).map(function).collect(Collectors.toList());
		
		
		
		System.out.println(result5);
		
		
		
		
	}
}
