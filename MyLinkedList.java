public class MyLinkedList {
	private INode head;
	private INode tail;

	public MyLinkedList() {
		// TODO Auto-generated constructor stub
		this.head=null;
		this.tail=null;
	}

	public void add(INode newNode)
	{
		// TODO Auto-generated method stub
		if(this.tail==null)
			this.tail=newNode;
		if(this.head==null)
			this.head=newNode;
		else
		{
			INode tempNode=this.head;
			this.head=newNode;
			this.head.setNext(tempNode);
		}		
		
	}
	public void append(INode myNode)
	{
		if(this.head==null)
		{
			this.head=myNode;
		}
		if(this.tail==null)
		{
			this.tail=myNode;
		}
		else
		{
			this.tail.setNext(myNode);
			this.tail=myNode;
		}
	}
	public void insert(INode myNode,INode newNode)
	{
		INode tempNode=myNode.getNext();
		myNode.setNext(newNode);
		newNode.setNext(tempNode);
	}
	public void PrintMyNodes()
	{
		StringBuffer myNodes=new StringBuffer("My nodes: ");
		INode tempNode=head;
		while(tempNode.getNext()!=null)
		{
			myNodes.append(tempNode.getKey());
			if(!tempNode.equals(tail)) myNodes.append("->");
				tempNode=tempNode.getNext();
		}
		myNodes.append(tempNode.getKey());
		System.out.println(myNodes);
	}
	public INode pop()
	{
		INode tempNode=this.head;
		this.head=head.getNext();
		return tempNode;
	}
	public INode popLast()
	{
		INode tempNode=this.head;
		while(tempNode.getNext()!=this.tail)
		{
			tempNode=tempNode.getNext();
		}
		INode deletedNode=tempNode.getNext();
		tempNode.setNext(null);
		this.tail=tempNode;
		return deletedNode;
		
	}

}
