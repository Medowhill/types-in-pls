package main

func choose[T any](v1 T, v2 T) T {
    if true {
        return v1
    } else {
        return v2
    }
}

func main() {
    var str string = choose[string]("Korean", "Foreigner")
    var num int = choose[int](1, 2)
    _ = str
    _ = num
}
