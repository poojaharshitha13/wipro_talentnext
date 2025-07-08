package oops;
import java.util.Optional;
public class Nullpointer {
	
	    public static void main(String[] args) {
	        String[] names = new String[5];

	        Optional<String> nameOpt = Optional.ofNullable(names[0]);

	        if (nameOpt.isPresent()) {
	            System.out.println("Length: " + nameOpt.get().length());
	        } else {
	            System.out.println("Value is null, so length not available.");
	        }
	    }
	}


