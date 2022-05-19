class Vector {
    public virtual int length() { return 0; }
}

class SparseVector : Vector {
    public override int length() { return 1; }
}

class Example {
    public static void Main() {
        Vector v = new SparseVector();
        v.length();
    }
}
