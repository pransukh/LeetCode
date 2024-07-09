package main

import "fmt"
import "strings"

type TreeNode struct {
    value int
    left  *TreeNode
    right *TreeNode
}

// Function to create a new node
func newNode(value int) *TreeNode {
    return &TreeNode{value: value, left: nil, right: nil}
}

// Function to insert nodes in level order
func insertLevelOrder(arr []int, root *TreeNode, i int, n int) *TreeNode {
    // Base case for recursion
	fmt.Println("I: ",i)
    if i < n {
        temp := newNode(arr[i])
        root = temp

        // Insert left child
        root.left = insertLevelOrder(arr, root.left, 2*i+1, n)

        // Insert right child
        root.right = insertLevelOrder(arr, root.right, 2*i+2, n)
    }
    return root
}

// Function to print tree nodes in InOrder traversal
func inOrderTraversal(root *TreeNode) {
    if root != nil {
        inOrderTraversal(root.left)
        fmt.Printf("%d ", root.value)
        inOrderTraversal(root.right)
    }
}

func printTree(root *TreeNode) {
	printTreeUtil(root, 0)
}

func printTreeUtil(node *TreeNode, level int) {
	if node == nil {
		return
	}

	printTreeUtil(node.right, level+1)

	fmt.Println(strings.Repeat("        ", level) + "|--", node.value)

	printTreeUtil(node.left, level+1)
}

func main() {
    arr := []int{4,6,2,7,1,3,5}
    n := len(arr)
    root := insertLevelOrder(arr, nil, 0, n)

    fmt.Println("InOrder Traversal of the Full Binary Tree:")
    inOrderTraversal(root)
    fmt.Println()
	printTree(root)
}
