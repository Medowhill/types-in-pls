#include <string>

using namespace std;

template <typename T> T choose(T v1, T v2) { return true ? v1 : v2; }

template <typename T> T mult(T v1, T v2, T v3) { return v1 * v2 * v3; }

int main() {
    string str = choose<string>("Korean", "Foreigner");
    int num = choose<int>(1, 2);
    mult<int>(1, 2, 3);
}
