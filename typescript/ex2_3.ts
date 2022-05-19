class Person { email: string = ""; }
class Student { email: string = ""; grade: number = 0; }

function startMentoring(select: (s: Student) => Person): void {
    let st: Student = new Student();
    let mentor: Person = select(st);
}

function selectStudentMentor(st: Student): Student { return new Student(); }
startMentoring(selectStudentMentor);

function sendEmails(needEmail: (s: Student) => Boolean): void {
    let st: Student = new Student();
    if (needEmail(st)) {}
}

function isHacked(pr: Person): Boolean { return true; }
sendEmails(isHacked);
