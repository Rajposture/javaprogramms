// Single Inheritance Example
class Animal {
    void eat() {
        System.out.println("Animals can eat.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog can bark.");
    }
}

// Multilevel Inheritance Example
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy can weep.");
    }
}

// Hierarchical Inheritance Example
class Cat extends Animal {
    void meow() {
        System.out.println("Cat can meow.");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();

        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}

