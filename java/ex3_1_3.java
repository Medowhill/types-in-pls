class Example {
    static <T> T choose(T v1, T v2) { return true ? v1 : v2; }

    public static void main(String[] args) {
        int num = choose(1, 2);
    }
}
