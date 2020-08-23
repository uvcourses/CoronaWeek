
public class EmployeeDetails {
  private String name;
  private String city; 
  private int salary;
  private String dept;
  
  EmployeeDetails(String empName,String empCity,int sal,String dept) { 
	  this.name=empName;
	  this.city=empCity;
	  this.salary=sal;
	  this.dept=dept;
  }
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
}
