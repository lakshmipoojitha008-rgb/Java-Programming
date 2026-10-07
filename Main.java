class Student {
    String name = "Karthik";
    int age = 20;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main{
    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}