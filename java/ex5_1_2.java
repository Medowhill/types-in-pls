class Cell {
    void write(String str) {}
    void write(int num) {}
}

class Example {
    public static void main(String[] args) {
        Cell c = new Cell();
        c.write("Hello");
        c.write(42);
    }
}
