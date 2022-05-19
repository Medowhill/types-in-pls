class Chooser {
    choose<T>(v1: T, v2: T): T { return true ? v1 : v2; }
}

let c: Chooser = new Chooser();
c.choose<number>(1, 2);
