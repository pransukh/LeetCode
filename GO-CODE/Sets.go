package main

import "fmt"
import "slices"

var array []int

func  add(data int) bool{
	// node_:= &Node{data:data}
	hasElement := slices.Contains(array, data)
	if(hasElement){
		return hasElement
	}else{
		hasElement = false
		array = append(array,data)
		return hasElement
	}
}

func get(idx int) int{
	if idx < len(array){
		return array[idx]
	}else{
		return 0
	}
}

func getAll() []int{
	return array
}

func main(){
	fmt.Println(add(1))
	fmt.Println(add(2))
	fmt.Println(add(3))
	fmt.Println(add(4))
	fmt.Println(add(2))
	fmt.Println(get(2))
	fmt.Println(getAll())


}