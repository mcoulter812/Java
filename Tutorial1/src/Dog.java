
public class Dog {
	String name;
	String colour;
	String ownerName;
	String breed;
	int age;
	int spots;
	boolean isMale;

	void bark(){
		System.out.println("Woof");
	}

	void goForAWalk(int distance){
		System.out.println("We went for a walk for "+distance+" miles");
	}

	void howOld(){
		int age = this.age;
		if(age==1){
			System.out.println("I am " + age + " year old");	
		}
		else {
			System.out.println("I am " + age + " years old");
		}
	}

	public Dog (String name,
			String colour,
			String ownerName,
			String breed,
			int age,
			int spots,
			boolean isMale) {
		this.name=name;
		this.colour=colour;
		this.ownerName=ownerName;
		this.breed=breed;
		this.age=age;
		this.spots=spots;
		this.isMale=isMale;
	}

	public static void main(String args[]){
		Dog sooty = new Dog("Sooty","Black","Matt","Wouser",1,2,true);
		sooty.bark();
		sooty.goForAWalk(5);
		sooty.howOld();
	}
}
