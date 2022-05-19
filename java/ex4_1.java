abstract class List<T> {
    abstract T get(int idx);
}

class ArrayList<T> extends List<T> {
    T get(int idx) { return null; }
}

class BitVector extends List<Boolean> {
    Boolean get(int idx) { return true; }
}

class Example {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        List<Boolean> l2 = new ArrayList<Boolean>();
        List<Boolean> l3 = new BitVector();
    }
}
