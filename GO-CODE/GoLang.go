package main

import "fmt"
import "strconv"
import "booking-app/Helper"
import "sync"
import "time"


var Reset = "\033[0m"
var Red = "\033[31m"
var Green = "\033[32m"

// var Yellow = "\033[33m"
// var Blue = "\033[34m"
// var Magenta = "\033[35m"
// var Cyan = "\033[36m"
// var Gray = "\033[37m"
// var White = "\033[97m"

type UserBooking struct {
	name   string
	ticket uint
}

var wg = sync.WaitGroup{}

func main() {

	Helper.ExportedMethod()
	bookings := make([]map[string]string, 0)
	bookings_ := make([]UserBooking, 0)

	conferenceName := "Go Conference"
	const conferenceTickets = 50
	var userFirstName string
	var userLastName string
	var userEmail string
	var cityName string
	var userTickets uint
	var remainingTickets uint = conferenceTickets
	var bookingDetail string
	var isValidName bool = false
	var showBookings string
	var exit string

	fmt.Printf("Welcome to %s", conferenceName+" booking-app\n")
	for {
		if remainingTickets == 0 {
			fmt.Println(Red + "Show sold out !!" + Reset)
			break
		}

		for !isValidName {
			fmt.Printf("Please enter your first name:\n")
			fmt.Scan(&userFirstName)

			fmt.Printf("Please enter your last name:\n")
			fmt.Scan(&userLastName)
			isValidName = len(userFirstName) >= 3 && len(userLastName) >= 2
			if !isValidName {
				fmt.Println(Red + "Invalid Name. Please re-enter your name." + Reset)
			}
		}
		isValidName = false
		fmt.Printf("Please enter your email:\n")
		fmt.Scan(&userEmail)

		fmt.Printf("Enter your city: \n")
		fmt.Scan(&cityName)

		switch cityName {
		case "London":
			// code
		case "New York":
			//code
		default:
			fmt.Printf("Executer the default code\n")
		}

		fmt.Printf("Please enter your ticket numbers:\n")
		fmt.Scan(&userTickets)
		for userTickets > remainingTickets {
			fmt.Printf("Only %d tickets left. Please enter less tickets.", remainingTickets)
			fmt.Scan(&userTickets)
			if userTickets <= remainingTickets {
				break
			}
		}

		remainingTickets = remainingTickets - userTickets

		fmt.Printf("Remaining tickets are %d\n", remainingTickets)

		bookingDetail = userFirstName + " " + userLastName
		mapping := make(map[string]string)
		mapping["Name"] = bookingDetail
		mapping["tickets"] = strconv.FormatUint(uint64(userTickets), 10)

		var userData = UserBooking{
			name:   bookingDetail,
			ticket: userTickets,
		}

		bookings = append(bookings, mapping)
		bookings_ = append(bookings_, userData)
		wg.Add(1) // number in param will define how many threads are being created with go keyword.
		go Helper.SendEmail(bookingDetail,wg)
		fmt.Println("Show Bookings ? (Y/N)")
		fmt.Scan(&showBookings)
		if showBookings == "Y" {
			//printBookings(bookings)
			printBookings_(bookings_)
		}
		fmt.Println("Want to exit ? (Y/N)")
		fmt.Scan(&exit)
		if exit == "Y" {
			break
		}
	}
	wg.Wait()
}

// func printBookings(bookings []map[string]string){
// 	//firstNameOnly := []string{}

// 	for _, booking := range bookings{
// 		fmt.Println(Green+booking["Name"]+Reset+" booked "+Red+booking["tickets"]+Reset+" tickets.")

// 		//firstNameOnly = append(firstNameOnly,strings.Fields(booking)[0])
// 	}
// 	//fmt.Printf("Bookings by firstName only: "+ Green +"%v \n"+Reset,firstNameOnly)

// }
func printBookings_(bookings []UserBooking) {
	for _, booking := range bookings {
		fmt.Println(Green + booking.name + Reset + " booked " + Red + strconv.FormatUint(uint64(booking.ticket), 10) + Reset + " tickets.")
		
	}
}

func SendEmail_(userName string){
	
	time.Sleep(10 * time.Second)
	fmt.Printf("Sent email to: %v\n", userName)
	wg.Done()
	
}
