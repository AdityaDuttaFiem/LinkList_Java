//Applying LinkedList in Java

class Node{
    int val;Node next;
    Node(int v){
        val=v;
        next=null;
    }
}
public class Main
{
    
	public static void main(String[] args) {
		Node st=new Node(6);
		Node lst=new Node(7);
		st.next=lst;
		for(int i=0;i<2;i++)    
		    {
		        System.out.println(st.val+"->");
		        st=st.next;
		    }
	}
}
