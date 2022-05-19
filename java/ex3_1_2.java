class Chooser {
    <T> T choose(T v1, T v2) { return true ? v1 : v2; }
}

class Example {
    public static void main(String[] args) {
        Chooser c = new Chooser();
        c.<Integer>choose(1, 2);
    }
}
