#include <string>

using namespace std;

template <typename T> class List {
    virtual T get(int idx)=0;
};

template <typename T> class ArrayList : public List<T> {
    T t;
    virtual T get(int idx) { return t; }
};

class BitVector : public List<bool> {
    virtual bool get(int idx) { return true; }
};

int main() {
    List<string> *l1 = new ArrayList<string>();
    List<bool> *l2 = new ArrayList<bool>();
    List<bool> *l3 = new BitVector();
}
