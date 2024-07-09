package main

import "fmt"
func main()  {
	array := []int{4,2,6,1,7,9,3,5,8,0}

	for i := 0; i < len(array); i++ {
		for idx := 0; idx < len(array) - 1; idx++ {
			if(array[idx] > array[idx+1]){
				var temp = array[idx+1]
				array[idx+1] = array[idx]
				array[idx] = temp
			}
		}
	}
	
	fmt.Println(array)
}