
public class LinkedListImplementationsOfStack {
        public class Node{
        private Node next;
        int val;
        Node(int val){
            this.val=val;
        }
    }
        Node head=null;
        private int size=0;
        
        //push
        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        //display rev
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        //display
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");

        }
        void display(){
           displayrec(head);
        }
        //size
        void size(){
            System.out.println(size);
        }
        //peek
        void peek(){
            System.out.println(head.val);
        }
        //pop
        int pop(){
            if(head==null){
                System.out.println("Stack is Empty");
                return -1;
            }
            int top=head.val;
            head=head.next;
            size--;
            return top;

        }
        //empty
        boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
    public static void main(String[] args) {
        LinkedListImplementationsOfStack st=new LinkedListImplementationsOfStack();
        st.push(10);
        st.push(20);
        st.push(40);
        st.push(50);
        st.displayRev();
        st.display();
   
    }
    
}
