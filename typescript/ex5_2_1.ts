class Vector {
    length(): number { return 0; }
}

class SparseVector extends Vector {
    nonzeros: Array<number> = [];
    length(): number { return 1; }
}

let v: Vector = new SparseVector();
v.length();
