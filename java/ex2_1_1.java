class Person { String email; }
class Student extends Person { int grade; }

class Example {
    static void sendEmail(Person person) {
        String email = person.email;
    }

    public static void main(String[] args) {
        Student st = new Student();
        sendEmail(st);
    }
}

