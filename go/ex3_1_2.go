package main

func choose[T any](v1 T, v2 T) T {
    if true {
        return v1
    } else {
        return v2
    }
}

func main() {
    var num int = choose(1, 2)
    _ = num
}
