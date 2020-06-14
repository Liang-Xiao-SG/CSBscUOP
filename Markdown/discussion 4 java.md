# Discussion on

**Give an example of a class and an example of an object. Describe what a class is, what an object is, and how they are related. Use your examples to illustrate the descriptions.
Your Discussion should be at least 250 words in length, but not more than 750 words. Once you’ve completed your initial post, be sure to respond to the posts of at least 3 of your classmates.
**

# Class Example

```java
public class Person {
	int age;
	String name;
	String gender;
    static int personCreated;
	public Person(int age, String name, String gender) {
		this.age = age;
		this.name = name;
		this.gender = gender;
        personCreated++;
	}	
	public void eat(String food) {
		System.out.println("Start to eat");
	}
	public void sleep(int hours) {
		System.out.println("Start to sleep");
	}
}
```

A class usually is a template or blue print for object. its the factory for multiple objects. any object created using this class is said to be the instance of this class.

and the class itself can have a static variable ``` personCreated``` which belong to the class instead of object type.



# Object Example

Its very convenient to create object using Class.

an object in software design perspective has two essential feathers. one is state another is behaviors.

in below code example.

the object is created with state of different age ,name and gender using the class template.

the class has defines the behaviors like eat and sleep.

and different object can have its own state but share the same behaviors as they are all created base on the same class.

```java
Person person1=new Person(20,"Jack","male");
Person person2=new Person(30,"Tom","male");
Person person2=new Person(40,"Hellen","female");
person2.eat("chicken");
person3.sleep(7);
```

the reference of object like person1 is not holding the actual object but points to the heap address which actually having the object.(Eck.D.J., 2019)

there are not only the member variable of object but also can have a class variable if declared as static member of that class.





Reference 

Eck.D.J. (2019). *Javanotes 8.1, Section 4.3 -- Parameters*. http://math.hws.edu/javanotes/c5/s3.html

