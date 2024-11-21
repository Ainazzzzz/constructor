//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Cat", 34.5f, 67, 12);

        System.out.println(animal);
        System.out.println(new Animal("Dog", 33.5f, 55,22));
        System.out.println(new Animal());

        Course course = new Course();
        Student[] students = {new Student(), new Student(), new Student(), new Student()};
        course.students =students;
    }
}