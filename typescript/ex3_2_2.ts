class Chooser<T> {
    v1: T;
    v2: T;
      
    constructor(v1: T, v2: T) {
        this.v1 = v1;
        this.v2 = v2;
    }

    choose(): T { return true ? this.v1 : this.v2; }
}

let c: Chooser<number> = new Chooser<number>(1, 2);
let n: number = c.choose();
