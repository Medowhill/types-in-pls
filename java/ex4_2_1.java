class Person { int age; }
class Student extends Person {}

class A {
    static <T extends Person> T elder(T p, T q) {
        return (p.age >= q.age) ? p : q;
    }
}

class Example {
    public static void main(String[] args) {
        Person p = A.<Person>elder(new Person(), new Person());
        Student s = A.<Student>elder(new Student(), new Student());
    }
}

class Group<T extends Person> {
    T p;
    void sortByAge() {
        int age = this.p.age;
    }
}
