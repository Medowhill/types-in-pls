using System.Collections.Generic;

abstract class Comparable<T> {
    public abstract bool gt(T that);
}

class Person : Comparable<Person> {
    int age;
    public override bool gt(Person that) { return this.age > that.age; }
}

class Example {
    static void sort<T>(List<T> lst) where T : Comparable<T> {
        if (lst[0].gt(lst[1])) {}
    }

    public static void Main() {
        List<Person> people = new List<Person>();
        sort<Person>(people);
    }
}
