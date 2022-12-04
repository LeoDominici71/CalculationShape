package cap14.polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import cap14.desafio.entities.Employee;
import cap14.desafio.entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Numero de trabalhadores");
		
		int n = sc.nextInt();
		
		for(int i = 1; i<=n;i++) {
			System.out.println("Employee #" + i + "data:");
			System.out.println("Outsourced (y/n)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double valuePerhour = sc.nextDouble();
			if (ch == 'y'){
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name,hours,valuePerhour,additionalCharge);

				list.add(emp);
			}
			
			else {
				Employee emp = new Employee(name,hours,valuePerhour);
				list.add(emp);
				
			}
			
			for (Employee emp : list) {
				System.out.println(emp.getName() + " - $ " + String.format("%.2f",emp.Payment()));
				
			}
			
		}
		
		
		
		
		
		sc.close();

	}

}
