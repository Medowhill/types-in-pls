class Chooser {
    public T choose<T>(T v1, T v2) { return true ? v1 : v2; }
}

class Example {
    public static void Main() {
        Chooser c = new Chooser();
        c.choose<int>(1, 2);
    }
}
