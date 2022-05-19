package main

type List[T any] struct { v T }
func (l List[T]) get(idx int) T { return l.v }

type Comparable[T any] interface {
    gt(that T) bool
}

func sort[T Comparable[T]](lst List[T]) {
    if (lst.get(0).gt(lst.get(1))) {}
}

type Person struct { age int }
func (this Person) gt(that Person) bool {
    return this.age > that.age
}

func main() {
    var people List[Person] = List[Person]{Person{0}}
    sort[Person](people)
}
