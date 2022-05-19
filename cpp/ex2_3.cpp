#include <functional>

using namespace std;

class Person {};
class Student : public Person {};

void startMentoring(function<Person *(Student *)> select) {
    Student *st = new Student();
    Person *mentor = select(st);
}

Student *selectStudentMentor(Student *st) { return new Student(); }

void sendEmails(function<bool(Student *)> needEmail) {
    Student *st = new Student();
    if (needEmail(st)) {}
}

bool isHacked(Person *pr) { return true; }

int main() {
    startMentoring(selectStudentMentor);
    sendEmails(isHacked);
}
