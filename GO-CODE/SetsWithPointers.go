package main

import "fmt"

var array []int



func add(data int){
	
	array = append(array,data)
}

func main(){
	
	fmt.Println("Hello")
	node_.add(1)
	node_.add(2)
	node_.add(3)
	node_.add(4)


	for _,data := range array{
		fmt.Println(data)
	}
}