class Vector {
    public virtual Vector add(SparseVector v) { return new Vector(); }
}

class SparseVector : Vector {
    public override Vector add(SparseVector v) { return new SparseVector(); }
}

class Example {
    public static void Main() {}
}
