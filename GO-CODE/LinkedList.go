package main

import "fmt"

type Node struct{
	data int
	next *Node
}

type LinkedList struct{
	head *Node
}

func (ll *LinkedList) Insert (data int ){
	newNode := &Node{data: data, next: nil}

	if(ll.head == nil){
		ll.head = newNode
		return
	}


	currentNode := ll.head
	for(currentNode.next != nil){
		currentNode = currentNode.next
	}

	currentNode.next = newNode
}

func (ll *LinkedList) Display(){
	node := ll.head
	for(node != nil){
		fmt.Printf("%d ->",node.data)
		node = node.next
	}
	fmt.Printf("nil")
}

func main(){
	ll := LinkedList{}
	ll.Insert(1)
	ll.Insert(2)
	ll.Insert(3)
	ll.Display()
}