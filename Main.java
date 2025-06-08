public class Main {
    public static void main(String[] args) {
        School s = new School();
        School.addTeacher("Teacher1");
        School.addTeacher("Teacher2");
        School.addTeacher("Teacher3");
        School.addTeacher("Teacher4");
        School.removeTeacher("Teacher4");
        School.addStudent("Student1");
        School.addStudent("Student2");
        School.addStudent("Student3");
        School.addStudent("Student4");
        School.removeStudent("Student4");
        School.addClass("Class1");
        School.addClass("Class2");
        School.addClass("Class3");
        School.addClass("Class4");
        School.removeClass("Class4");
        School.displayWholeSchool(s);
    }
}