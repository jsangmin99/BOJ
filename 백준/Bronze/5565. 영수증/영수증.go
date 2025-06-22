package main

import (
    "fmt"
)

func main() {
    var total int
    fmt.Scan(&total)

    sum := 0
    for i := 0; i < 9; i++ {
        var price int
        fmt.Scan(&price)
        sum += price
    }

    fmt.Println(total - sum)
}
