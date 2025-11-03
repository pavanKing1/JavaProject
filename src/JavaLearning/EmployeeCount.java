package JavaLearning;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;
import java.util.stream.*;

public class EmployeeCount {

	public static void main(String[] args) {

		List<Employee>employee=Arrays.asList(
				new Employee(1, "Pavan", 21, "male", 40000),
				new Employee(2, "vasrsha", 20, "female", 20000),
				new Employee(3,"fbrc",32,"male",33223),
				new Employee(4,"fbcwcrc",42,"male",34223),
				new Employee(5,"fbbbnrc",39,"female",3328923)
				
				
				);
		 Map<String, Long> genderCount = employee.stream()
		            .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		 
		 Map<String, Double> averageSalary = employee.stream()

		            .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));


		        System.out.println("Gender Count: " + genderCount);

		        System.out.println("Average Salary: " + averageSalary);
	}

}
