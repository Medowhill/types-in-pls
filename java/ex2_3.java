import java.util.function.Function;

class Person {}
class Student extends Person {}

class A {
    static Student selectStudentMentor(Student st) { return new Student(); }
}

class B {
    static boolean isHacked(Person pr) { return true; }
}

class Example {
    static void startMentoring(Function<Student, Person> select) {
        Student st = new Student();
        Person mentor = select.apply(st);
    }

    static void sendEmails(Function<Student, Boolean> needEmail) {
        Student st = new Student();
        if (needEmail.apply(st)) {}
    }

    public static void main(String[] args) {
        startMentoring(A::selectStudentMentor);
        sendEmails(B::isHacked);
    }
}
