class Vector {
    add(v: SparseVector): Vector { return new Vector(); }
}

class SparseVector extends Vector {
    add(v: SparseVector): SparseVector { return new SparseVector(); }
}
