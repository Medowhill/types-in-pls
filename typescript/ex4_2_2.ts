abstract class Comparable<T> {
    abstract gt(that: T): boolean;
}

function sort<T extends Comparable<T>>(lst: Array<T>): void {
    if (lst[0].gt(lst[1])) {}
}

class Person extends Comparable<Person> {
    age: number = 0;
    gt(that: Person): boolean { return this.age > that.age; }
}

let people: Array<Person> = [];
sort<Person>(people);
