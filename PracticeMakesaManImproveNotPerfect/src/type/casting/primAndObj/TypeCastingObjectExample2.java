package type.casting.primAndObj;

public class TypeCastingObjectExample2 {
// theree fudanmental rules for type casting
	// rule 1:conversion is valid or not
	// (Cat)animal this "(cat)" and "animal" should have some relationship(paren to
	// child )or (chuld to parent)

	// rule2: assignment is valid or not
	// Cat cat =(Cat) ->"Cat)" the assigning var and obj"Cat cat" must be same or
	// parent of it

   //	rule 3:the nderlying object "animal4" mjust be either same /relation of a cat

	public static void main(String[] args) {
		Animal animal = new Animal();
		Animal animal2 = new Cat();
		Animal animal3 = new Dog();

		Animal animal4 = new Dog();
//		Cat cat = (Cat) animal4;// this is failing in rule three do is not achild of cat so
		
		Cat cat2 = (Cat) animal;// rule 3 fail

		Animal animal5 = new Cat();
		Cat cat3 = (Cat) animal5;//
		System.out.println(animal5);
	}

}

class Animal {

}

class Dog extends Animal {

}

class Cat extends Animal {

}