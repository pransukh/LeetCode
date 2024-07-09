package main

import "fmt"


func main(){
	array := []int{4,5,3,6,2,7,9,8,1}

for j := 0; j<len(array) - 1;j++{
for i := 0; i<len(array) - 1;i++{
		if(array[i] > array[i + 1]){
			var temp = array[i]
			array[i] = array[i + 1]
			array[i + 1] = temp
		}
	}
}
	
	fmt.Println(array)
}