package mot.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import mot.entities.Circle;
import mot.entities.Rectangle;
import mot.entities.Shape;
import mot.enums.Color;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shape: ");
		
		int n = sc.nextInt();
		
		
		for(int i = 1; i<=n;i++ ) {
			System.out.println("Shape #" + i + "data:");
			System.out.println("Rectangle or circle (r/c)?");
			
			char ch = sc.next().charAt(0);
			
			System.out.print("coloc black/red/blue");
			
			Color color = Color.valueOf(sc.next());
			
			if (ch == 'r') {
				System.out.println("Width");
				double width = sc.nextDouble();
				System.out.println("Height");
				double height = sc.nextDouble();
				
				
				list.add(new Rectangle(color, width, height));


			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));

			}
			
			for (Shape shape : list) {
				System.out.println(String.format("%.2f", shape.area()));
	
			}

		
			

			

		}
		
		
		sc.close();
	}
}
