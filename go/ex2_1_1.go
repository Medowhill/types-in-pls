package main

type Person struct {
    _email string
}
func (pr Person) email() string { return pr._email }

type Student struct {
    _email string
    _grade int
}
func (st Student) email() string { return st._email }
func (st Student) grade() int { return st._grade }

func sendEmail(person interface { email() string }) {
    var email string = person.email()
    _ = email
}

func main() {
    var st Student = Student{"", 0}
    sendEmail(st)
}
