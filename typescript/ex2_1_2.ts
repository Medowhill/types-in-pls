abstract class EmailDst {
    abstract sendEmail(content: string): void;
}

class Person {
    sendEmail(content: string): void {}
}

let pr: Person = new Person();

function sendNewYearEmail(dst: EmailDst): void {
    dst.sendEmail("");
}
sendNewYearEmail(pr);

function sendNewYearEmail2(dst: { sendEmail: (content: string) => void }): void {
    dst.sendEmail("");
}
sendNewYearEmail2(pr);
