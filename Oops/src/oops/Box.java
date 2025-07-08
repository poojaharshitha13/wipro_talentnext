package oops;
import java.util.*;
public class Box {
		    double width, height, depth;
		    Box(double width, double height, double depth) {
		        this.width = width;
		        this.height = height;
		        this.depth = depth;
		    }
		    double getVolume() {
		        return width * height * depth;
		    }
		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter width of the box: ");
		        double width = scanner.nextDouble();

		        System.out.print("Enter height of the box: ");
		        double height = scanner.nextDouble();

		        System.out.print("Enter depth of the box: ");
		        double depth = scanner.nextDouble();
		        Box myBox = new Box(width, height, depth);
		        double volume = myBox.getVolume();

		        System.out.println("The volume of the box is: " + volume);
		        
		        scanner.close();

	}

}
