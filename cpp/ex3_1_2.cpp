class Chooser {
public:
    template <typename T> T choose(T v1, T v2) { return true ? v1 : v2; }
};

int main() {
    Chooser *c = new Chooser();
    c->choose<int>(1, 2);
}
