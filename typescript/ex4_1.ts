abstract class List<T> {
    abstract get(idx: number): T;
}
class ArrayList<T> {
    v: T;
    constructor(v: T) { this.v = v; }
    get(idx: number): T { return this.v; }
}
class BitVector {
    get(idx: number): boolean { return true; }
}

let l1: List<string> = new ArrayList<string>("");
let l2: List<boolean> = new ArrayList<boolean>(true);
let l3: List<boolean> = new BitVector();
