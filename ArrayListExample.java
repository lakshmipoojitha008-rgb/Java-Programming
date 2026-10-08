import java.util.ArrayList;
class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();
        students.add("pujitha");
        students.add("soumya");
        students.add("gnanitha");
        students.add("e:suma");
        System.out.println("Students: " + students);
        System.out.println("First element: " + students.get(0));
        students.set(1, "sowmya");
        System.out.println("After update: " + students);
        students.remove("gnanitha");
        System.out.println("After remove: " + students);
    }
}