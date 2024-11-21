public class Course {
    String name;
    Student[] students;

    public Course(String name, Student[] students) {
        if (name.length() <= 2) {
            System.out.println(" 2 mkfrntvlntgbn");
        }else {
            this.name = name;
        }
        setStudents(students);
    }

    public void setStudents(Student[] students) {

    }
}
