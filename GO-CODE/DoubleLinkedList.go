package main

import (
	"fmt"
)

type Node struct{
	previous *Node
	data int
	next *Node
}

type doubleLinkedList struct{
	head *Node
}

func (dll *doubleLinkedList) add(data int){
	
	if(dll.head == nil){
		node := &Node{previous:nil, data:data, next:nil}
		dll.head = node
		return
	}
	
	currentNode := dll.head
	for(currentNode.next != nil){
		currentNode = currentNode.next
	}
	node := &Node{previous:currentNode, data:data, next:nil}
	currentNode.next = node
	return

	
}

func (dll *doubleLinkedList) Display (){
	headPointer := dll.head
	for(dll.head != nil){
		fmt.Println(dll.head)
		dll.head = dll.head.next
	}
	dll.head = headPointer
}


func (dll *doubleLinkedList) addAtIndex(data int, idx int){
	saveheadPointer := dll.head
	currentNode := dll.head
	var index int = 0
	
	for(currentNode != nil){
		
		if(index == idx){
			
			node := &Node{previous:currentNode.previous, data:data, next:currentNode.previous.next}
			currentNode.previous.next = node
			currentNode.previous = node
			currentNode = node
			break
		}
		index += 1
		currentNode = currentNode.next
		
	}
	
	dll.head = saveheadPointer
}

func main(){
	dll := &doubleLinkedList{}
	dll.add(1)
	dll.add(2)
	dll.add(3)
	dll.add(4)
	dll.Display()
	dll.addAtIndex(5,2)
	dll.Display()
}