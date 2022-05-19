package main

type Chooser[T any] struct {
    v1 T
    v2 T
}

func (c Chooser[T]) choose() T {
    if true {
        return c.v1
    } else {
        return c.v2
    }
}

func main() {
    var c Chooser[int] = Chooser[int]{1, 2}
    var n int = c.choose()
    _ = n
}
