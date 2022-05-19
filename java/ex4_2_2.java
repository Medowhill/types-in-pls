import java.util.List;

abstract class Comparable<T> {
    abstract boolean gt(T that);
}

class A {
    static <T extends Comparable<T>> void sort(List<T> lst) {
        if (lst.get(0).gt(lst.get(1))) {}
    }
}

class Person extends Comparable<Person> {
    int age;
    boolean gt(Person that) { return this.age > that.age; }
}

class Example {
    public static void main(String[] args) {
        List<Person> people = List.of();
        A.<Person>sort(people);
    }
}
