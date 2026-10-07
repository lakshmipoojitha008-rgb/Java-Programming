class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is darking");
    }
}
class puppy extends Dog{
    void play(){
        System.out.println("puppy is playing");
    }
}
public class multilevel{
    public static void main(String args[]){
        puppy p=new puppy();
        Dog d=new Dog();
        d.bark();
        p.play();

    }
}