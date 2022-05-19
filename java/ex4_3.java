class Person { int age; }
class Student extends Person {}

class List<T> {
    int length() { return 0; }
    T get(int idx) { return null; }
    void add(T t) {}
}

class Example {
    static int averageAge(List<? extends Person> people) {
        int len = people.length();
        int age = people.get(0).age;
        return 0;
    }

    static void addStudent(List<? super Student> students) {
        if (students.length() < 0) {
            students.add(new Student());
        }
    }

    public static void main(String[] args) {
        averageAge(new List<Student>());
        addStudent(new List<Person>());
    }
}
