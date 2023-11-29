public class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("This Dog eats food.");
    }

    void bark() {
        System.out.println("Hong Hong!!");
    }

}

class testAnimal {
    public static void main(String[] args) {
        Animal an = new Animal();
        an.eat();
        
        Animal dg2 = new Dog();
        dg2.eat();
        
        Dog dg = new Dog();
        dg.eat();
        dg.bark();
    }
}

