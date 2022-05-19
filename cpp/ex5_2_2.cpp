class SparseVector;

class Vector {
public:
    virtual Vector *add(SparseVector *v) { return 0; }
};

class SparseVector : public Vector {
public:
    virtual SparseVector *add(SparseVector *v) { return 0; }
};

int main() {}
