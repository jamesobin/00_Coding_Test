package main

import "fmt"

func main() {
    var n int
    fmt.Scan(&n)

    answer := ""
    for i := 1; i <= n; i++ {
        answer += "*"
        fmt.Println(answer)
    }
}