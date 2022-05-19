class Chooser<T> {
    T v1;
    T v2;
    public T choose() { return true ? this.v1 : this.v2; }
}

class Example {
    public static void Main() {
        Chooser<int> c = new Chooser<int>();
        int n = c.choose();
    }
}
