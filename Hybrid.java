
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {

    public void play() {
        System.out.println("Dog is playing");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal implements Pet {

    public void play() {
        System.out.println("Cat is playing");
    }

    void meow() {
        System.out.println("Cat is meowing");
    }
}

class Hybrid {
    public static void main(String args[]) {

        Dog d = new Dog();

        d.eat();
        d.bark();
        d.play();

        Cat c = new Cat();

        c.eat();
        c.play();
        c.meow();
    }
}

