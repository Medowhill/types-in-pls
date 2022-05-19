class Person { public string email; }
class Student : Person { public int grade; }

class Example {
    static void sendEmail(Person person) {
        string email = person.email;
    }
    
    public static void Main() {
        Student st = new Student();
        sendEmail(st);
    }
}
