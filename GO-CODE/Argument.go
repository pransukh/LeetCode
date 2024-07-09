package main

import "fmt"
import "os"

func main(){
	fmt.Println(os.Args)
	fmt.Println(os.Args[1:])
	fmt.Println(os.Args[3])
}