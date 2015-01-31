public reverseListIteratively (Node head)
{
	if (head == NULL || head.next == NULL)
		return;  //empty or just one node in list

	Node Second = head.next;

	//store third node before we change 
	Node Third = Second.next;  

	//Second's next pointer
	Second.next = head;  //second now points to head
	head.next = NULL;  //change head pointer to NULL

	//only two nodes, which we already reversed
	if (Third == NULL)
		return;  

	Node CurrentNode = Third;

	Node PreviousNode = Second;

	while (CurrentNode != NULL)
	{ 
		Node NextNode = CurrentNode.next;

		CurrentNode.next = PreviousNode;

		/*  repeat the process, but have to reset
     the PreviousNode and CurrentNode
		 */

		PreviousNode = CurrentNode;
		CurrentNode = NextNode;  
	}

	head  = PreviousNode; //reset the head node
}


public void recursiveReverse(Node currentNode )
{  
	//check for empty list 
	if(currentNode == NULL)
		return;

	/* if we are at the TAIL node:
    recursive base case:
	 */
	if(currentNode.next == NULL) 
	{ 
		//set HEAD to current TAIL since we are reversing list
		head = currentNode; 
		return; //since this is the base case
	}

	recursiveReverse(currentNode.next);
	currentNode.next.next = currentNode;
	currentNode.next = null; //set "old" next pointer to NULL
}
