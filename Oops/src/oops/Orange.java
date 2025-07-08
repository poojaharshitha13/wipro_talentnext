package oops;
	class Orange extends Fruit {
	    public Orange(int size) {
	    super("Orange","Bitter",size);
	    }
	    @Override
	    void eat() {
	    	System.out.print(name +" tastes " + taste +".");
	    }
	}

