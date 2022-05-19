class Person { email: string = ""; }
class Student { email: string = ""; grade: number = 0; }

let st = new Student();

function sendEmail(person: Person): void {
    let email: string = person.email;
}
sendEmail(st);

function sendEmail2(person: { email: string }): void {
    let email: string = person.email;
}
sendEmail2(st);
