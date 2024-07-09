package main

import "fmt"


func main(){
    myChannel1 := make(chan string, 3)
    myChannel2 := make(chan string)

    go func(){
        myChannel1 <- "data 1"
    }()
    go func(){
            myChannel2 <- "data 2"
        }()

   select{
        case msgFromMyChannel1 := <- myChannel1:
            fmt.Println(msgFromMyChannel1)
        case msgFromMyChannel2 := <- myChannel2:
            fmt.Println(msgFromMyChannel2)
   }
}
