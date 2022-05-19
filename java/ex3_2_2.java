class Chooser<T> {
    T v1;
    T v2;
    T choose() { return true ? this.v1 : this.v2; }
}

class Example {
    public static void main(String[] args) {
        Chooser<Integer> c = new Chooser<Integer>();
        int n = c.choose();
    }
}
