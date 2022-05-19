class Vector {
    int length() { return 0; }
}

class SparseVector extends Vector {
    int length() { return 1; }
}

class Example {
    public static void main(String[] args) {
        Vector v = new SparseVector();
        v.length();
    }
}
