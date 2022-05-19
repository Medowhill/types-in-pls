abstract class EmailDst {
    public abstract void sendEmail(string content);
}

class Person : EmailDst {
    public override void sendEmail(string content) {}
}

class Example {
    static void sendNewYearEmail(EmailDst dst) {
        dst.sendEmail("");
    }
    
    public static void Main() {
        Person pr = new Person();
        sendNewYearEmail(pr);
    }
}
