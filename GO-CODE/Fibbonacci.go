// OUTPUT: 0 1 1 2 3 5 8 13

package main

import "fmt"

func main(){
	var count int
	fmt.Println("Enter the number of iterations:")
	fmt.Scan(&count)
	var a int = 0
	var b int = 1
	var next int
	fmt.Println(a)
	fmt.Println(b)
	for i := 0; i < count; i++ {
		
		next = a + b // 0 + 1 = 1
		a = b
		b = next
		fmt.Println(next)
	}
}