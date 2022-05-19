class Person {}
class Student : Person {}

interface ReadOnlyList<out T> {
    T get(int idx);
}

interface Map<in T, S> {
    S get(T t);
    void add(T t, S s);
}

class Example {
    static ReadOnlyList<Person> foo(ReadOnlyList<Student> l) { return l; }
    static Map<Student, int> bar(Map<Person, int> m) { return m; }

    public static void Main() {}
}
