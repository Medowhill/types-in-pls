class Person {}
class Student { grade: number = 0; }

class ReadOnlyList<T> {
    v: T;
    constructor(v: T) { this.v = v; }
    get: (idx: number) => T = (idx: number) => this.v;
}

class Map2<T, S> {
    v: S;
    constructor(v: S) { this.v = v; }
    get: (t: T) => S = (t: T) => this.v;
    add: (t: T, s: S) => void = (t: T, s: S) => {};
}

let l: ReadOnlyList<Person> = new ReadOnlyList<Student>(new Student());
let m: Map2<Student, number> = new Map2<Person, number>(0);
