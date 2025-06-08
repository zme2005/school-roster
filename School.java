import java.util.ArrayList;

public class School {
    private static final ArrayList<String> teachersList = new ArrayList<>();
    private static final ArrayList<String> studentsList = new ArrayList<>();
    private static final ArrayList<String> classesList = new ArrayList<>();

    public static void addTeacher(String teacher) {
        teachersList.add(teacher);
        System.out.println("teacher added : " + teacher);
    }

    public static void removeTeacher(String teacher) {
        teachersList.remove(teacher);
        System.out.println("teacher removed : " + teacher);
    }

    public static void addStudent(String student) {
        studentsList.add(student);
        System.out.println("student added : " + student);
    }

    public static void removeStudent(String student) {
        studentsList.remove(student);
        System.out.println("student removed : " + student);
    }

    public static void addClass(String Class) {
        classesList.add(Class);
        System.out.println("class added : " + Class);
    }

    public static void removeClass(String Class) {
        classesList.remove(Class);
        System.out.println("class removed : " + Class);
    }

    public void displayTeachers() {
        System.out.println("Teachers : ");
        for (String s : teachersList) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
    }

    public void displayStudents() {
        System.out.println("Students : ");
        for (String s : studentsList) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
    }

    public void displayClasses() {
        System.out.println("Classes : ");
        for (String s : classesList) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------------");
    }

    public static void displayWholeSchool(School s) {
        System.out.println("School information : ");
        s.displayTeachers();
        s.displayStudents();
        s.displayClasses();
    }

}
