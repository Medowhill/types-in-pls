template <typename T> class Chooser {
public:
    T v1;
    T v2;
    T choose() { return true ? v1 : v2; }
};

int main() {
    Chooser<int> *c = new Chooser<int>();
    int n = c->choose();
}
