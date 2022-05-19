package main

func isPositive(num int) bool { return num > 0 }

func printString(str string) {}

func add(num1 int, num2 int) int { return num1 + num2 }

func main() {
    var res int
    res = 3
    _ = res
    
    isPositive(1)
    printString("2")
    add(1, 2)
}
