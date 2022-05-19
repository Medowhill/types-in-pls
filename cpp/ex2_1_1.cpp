#include <string>

using namespace std;

class Person { public: string email; };
class Student : public Person { public: int grade; };

void sendEmail(Person *person) {
    string email = person->email;
}

int main() {
    Student *st = new Student();
    sendEmail(st);
}
