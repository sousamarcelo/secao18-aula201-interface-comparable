package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Program {
	
	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		String strPath = "C:\\temp\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(strPath))){
			String employeeCsv = br.readLine();
			while(employeeCsv != null) {
			String[] vect = employeeCsv.split(",");
			list.add(new Employee(vect[0], Double.parseDouble(vect[1])));
			employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			
			for (Employee emp : list) {
				System.out.println(emp.getName() +","+ emp.getSalary());
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		
	}

}
