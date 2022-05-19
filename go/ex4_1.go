package main

type List[T any] interface {
    get(idx int) T
}

type ArrayList[T any] struct { t T }
func (l ArrayList[T]) get(idx int) T {
    return l.t
}

type BitVector struct {}
func (l BitVector) get(idx int) bool {
    return true
}

func main() {
    var l1 List[string] = ArrayList[string]{""}
    var l2 List[bool] = ArrayList[bool]{true}
    var l3 List[bool] = BitVector{}
    _ = l1
    _ = l2
    _ = l3
}
