class Vector {
public:
    virtual int length() { return 0; }
};

class SparseVector : public Vector {
public:
    virtual int length() { return 1; }
};

int main() {
    Vector *v = new SparseVector();
    v->length();
}
