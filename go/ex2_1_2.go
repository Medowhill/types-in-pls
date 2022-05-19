package main

type EmailDst interface {
    sendEmail(content string)
}

type Person struct {}
func (p Person) sendEmail(content string) {}

func sendNewYearEmail(dst EmailDst) {
    dst.sendEmail("")
}

func main() {
    var pr Person = Person{}
    sendNewYearEmail(pr)
}
