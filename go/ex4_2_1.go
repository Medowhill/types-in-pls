package main

type HasAge interface { age() int }

type Person struct {
    _age int
}
func (pr Person) age() int { return pr._age }

type Student struct {
    _age int
    _grade int
}
func (st Student) age() int { return st._age }
func (st Student) grade() int { return st._grade }

func elder[T HasAge](p T, q T) T {
    if p.age() >= q.age() {
        return p
    } else {
        return q
    }
}

func main() {
    var p Person = elder[Person](Person{0}, Person{1});
    var s Student = elder[Student](Student{0, 0}, Student{1, 1});
    _ = p
    _ = s
}

type Group[T HasAge] struct {
    p T
}
func (gr Group[T]) sortByAge() {
    var age int = gr.p.age()
    _ = age
}

func elder2[T interface { age() int }](p T, q T) T {
    if p.age() >= q.age() {
        return p
    } else {
        return q
    }
}
