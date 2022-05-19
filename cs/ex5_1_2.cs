class Cell {
    public void write(string str) {}
    public void write(int num) {}
}

class Example {
    public static void Main() {
        Cell c = new Cell();
        c.write("Hello");
        c.write(42);
    }
}
