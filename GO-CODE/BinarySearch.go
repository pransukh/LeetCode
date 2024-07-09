package main

import "fmt"

var array = []int{4,2,6,1,7,9,3,5,8,10}

func main(){

	var elementToSearch int
	

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

	fmt.Println("Please enter element to search:")
	fmt.Scan(&elementToSearch)
	fmt.Println(binarySearch(elementToSearch))

}

func binarySearch(element int) int{
	var start int = 0
	var end int = len(array) - 1
	var mid = len(array) / 2
	var idx int
	for{
		if(array[mid] == element){
			idx = mid;
			break
		} else if(array[start] ==  element){
			idx = start
			break
		} else if(array[end] == element){
			idx = end
			break
		} else if(element > array[mid]){
			start = mid + 1
			mid = (start + end)/2
		}else if(element < array[mid]){
			end = mid - 1
			mid = (start + end)/2
		}
	}

	return idx
	

}

func ExportedMethod(){
	fmt.println("Exported method executed!!")
}