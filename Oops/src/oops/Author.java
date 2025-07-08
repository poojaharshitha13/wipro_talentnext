package oops;
import java.util.*;
class Author {
	    private String name;
	    private String email;
	    private char gender;

	    // Parameterized Constructor
	    public Author(String name, String email, char gender) {
	        this.name = name;
	        this.email = email;
	        this.gender = gender;
	    }

	    // Getters
	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public char getGender() {
	        return gender;
	    }

	    // toString method
	    public String toString() {
	        return "Author Name: " + name + ", Email: " + email + ", Gender: " + gender;
	    }
	}
	