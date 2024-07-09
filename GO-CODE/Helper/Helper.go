package Helper
import "fmt"
import "time"
import "sync"
func ExportedMethod(){
	fmt.Println("Helper Exported method !!")
}

func SendEmail(userName string, wg sync.WaitGroup){
	
	time.Sleep(10 * time.Second)
	fmt.Printf("Sent email to: %v\n", userName)
	wg.Done()
	
}