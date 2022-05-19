template <typename T> T choose(T v1, T v2) { return true ? v1 : v2; }

int main() {
    int num = choose(1, 2);
}
