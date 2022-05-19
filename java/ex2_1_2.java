abstract class EmailDst {
    abstract void sendEmail(String content);
}

class Person extends EmailDst {
    void sendEmail(String content) {}
}

class Example {
    static void sendNewYearEmail(EmailDst dst) {
        dst.sendEmail("");
    }

    public static void main(String[] args) {
        Person pr = new Person();
        sendNewYearEmail(pr);
    }
}
