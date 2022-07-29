
public class MyNodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNode<Integer> myFirstNode=new MyNode<>(56);
		MyNode<Integer> mySecondNode=new MyNode<>(30);
		MyNode<Integer> myThirdNode=new MyNode<>(70);
		MyNode<Integer> myforthNode=new MyNode<>(40);
		MyNode<Integer> myfifthNode=new MyNode<>(80);
		System.out.println(myFirstNode.getKey());
		System.out.println(mySecondNode.getKey());
		System.out.println(myThirdNode.getKey());
		MyLinkedList myLinkedList=new MyLinkedList();
		myLinkedList.append(myFirstNode);
		myLinkedList.append(mySecondNode);
		myLinkedList.append(myThirdNode);
		myLinkedList.append(myfifthNode);
		myLinkedList.PrintMyNodes();
		myLinkedList.insert(myFirstNode,myforthNode);
		myLinkedList.PrintMyNodes();
		System.out.println("Deleted last node  "+myLinkedList.popLast().getKey());
		
		myLinkedList.PrintMyNodes();
		
		
		

	}

}
