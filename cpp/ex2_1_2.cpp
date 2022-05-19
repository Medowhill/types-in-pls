#include <string>

using namespace std;

class EmailDst {
public:
    virtual void sendEmail(string content)=0;
};

class Person : public EmailDst {
public:
    virtual void sendEmail(string content) {}
};

void sendNewYearEmail(EmailDst *dst) {
    dst->sendEmail("");
}

int main() {
    Person *pr = new Person();
    sendNewYearEmail(pr);
}
