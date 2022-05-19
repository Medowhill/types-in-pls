abstract class List<T> {
    public abstract T get(int idx);
}

class ArrayList<T> : List<T> {
    T t;
    public override T get(int idx) { return this.t; }
}

class BitVector : List<bool> {
    public override bool get(int idx) { return true; }
}

class Example {
    public static void Main() {
        List<string> l1 = new ArrayList<string>();
        List<bool> l2 = new ArrayList<bool>();
        List<bool> l3 = new BitVector();
    }
}
