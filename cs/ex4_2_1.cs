class Person { public int age; }
class Student : Person {}

class Example {
    static T elder<T>(T p, T q) where T : Person {
        return (p.age >= q.age) ? p : q;
    }

    public static void Main() {
        Person p = elder<Person>(new Person(), new Person());
        Student s = elder<Student>(new Student(), new Student());
    }
}

class Group<T> where T : Person {
    T p;
    void sortByAge() {
        int age = this.p.age;
    }
}
