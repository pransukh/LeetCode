package main
import "fmt"
import "strings"

func main(){
	var input string
	fmt.Println("Enter you string:")
	fmt.Scan(&input)
	fmt.Println(recursion(input))
}

func recursion(input string) string {
	var result string
	if(len(input) == 0){
		return input
	} else{
	result=strings.Split(input,"")[len(input) - 1] + recursion(input[:len(input) - 1])
	}
	return result
}