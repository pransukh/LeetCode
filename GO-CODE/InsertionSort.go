package main

import "fmt"

func main(){

	array := []int{3,1,2,6,4,5,9,8,7}


	for i := 1; i<len(array);i++ {
		var data = array[i] // 2
		var j = i - 1 // 1

		

		for j >= 0 && array[j] > data { // 5 > 2
			array[i] = array[j]
			array[j] =data
		}

		fmt.Println(array)
	}
	
}