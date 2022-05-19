class A {
    static <T> T choose(T v1, T v2) { return true ? v1 : v2; }
}


class Example {
    public static void main(String[] args) {
        String str = A.<String>choose("Korean", "Foreigner");
        int num = A.<Integer>choose(1, 2);
    }
}
