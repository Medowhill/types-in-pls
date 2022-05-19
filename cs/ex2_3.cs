using System;

class Person {}
class Student : Person {}

class Example {
    static void startMentoring(Func<Student, Person> select) {
        Student st = new Student();
        Person mentor = select(st);
    }

    static Student selectStudentMentor(Student st) { return new Student(); }
    
    static void sendEmails(Func<Student, bool> needEmail) {
        Student st = new Student();
        if (needEmail(st)) {}
    }

    static bool isHacked(Person pr) { return true; }

    public static void Main() {
        startMentoring(selectStudentMentor);
        sendEmails(isHacked);
    }
}
