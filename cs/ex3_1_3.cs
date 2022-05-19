class Example {
    static T choose<T>(T v1, T v2) { return true ? v1 : v2; }

    public static void Main() {
        int num = choose(1, 2);
    }
}
