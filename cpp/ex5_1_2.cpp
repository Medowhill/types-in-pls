#include <string>

using namespace std;

class Cell {
public:
    void write(string str) {}
    void write(int num) {}
};

int main() {
    Cell *c = new Cell();
    c->write("Hello");
    c->write(42);
}
