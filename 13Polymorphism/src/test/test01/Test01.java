package test.test01;

public class Test01 {
	
	
	public static void cryAnimal(Animal animal) {
		animal.cry();
	}

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[2];
		animals[0] = new Cat();
	    animals[1] = new Dog();
	    
	    for(int i = 0; i < animals.length; i++) {
	    	
	    	for(int j = 0; j < 3; j ++) {
	    	animals[i].cry();
	    	}
	    	
	    }	
	    
	    for(int i = 0; i < animals.length; i++) {
	    		
	    		if(animals[i] instanceof Cat) {
	    			Cat cat = (Cat)animals[i];
	    			cat.grooming();
	    		}
	    		
	    		if(animals[i] instanceof Dog) {
	    			Dog dog = (Dog)animals[i];
	    			dog.lash();
	    		}
	    }
	    
	    
	    }
	    	}
	     
	    
	


