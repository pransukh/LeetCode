package main

import (
	"fmt"
)

type Node struct{
	left *Node
	data int
	right *Node
}

type binaryTree struct{
	headNode *Node
}


func (bt *binaryTree) add(inputData int){

	if(bt.headNode == nil){
		node := &Node{left:nil, data:inputData, right:nil}
		bt.headNode = node
	}
	
	currentNode = bt.headNode
	for(currentNode != nil){
		if(inputData > currentNode.data){
			node := &Node{left:nil, data:inputData, right:nil}
			currentNode.
		}
	}

}

func main(){
	bt := binaryTree{}
	bt.add(1)
}