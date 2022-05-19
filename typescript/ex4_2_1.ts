class Person { age: number = 0; }
class Student extends Person { grade: number = 0; }

function elder<T extends Person>(p: T, q: T): T {
    return (p.age >= q.age) ? p : q;
}
let p: Person = elder<Person>(new Person(), new Person());
let s: Student = elder<Student>(new Student(), new Student());

class Group<T extends Person> {
    p: T;

    constructor(p: T) { this.p = p; }

    sortByAge(): void {
        let age: number = this.p.age;
    }
}

function elder2<T extends { age: number; }>(p: T, q: T): T {
    return (p.age >= q.age) ? p : q;
}
