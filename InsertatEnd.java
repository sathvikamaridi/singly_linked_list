import java.util.*;
public class InsertatEnd
{
    static class SLLNode 
    {
        int data;
        SLLNode next;
        public SLLNode()
        {
          this.data=0;
          this.next=null;
        }
        public SLLNode(int data, SLLNode next)
        {
          this.data=data;
          this.next=next;
        }
    }
        static SLLNode insert_at_end(SLLNode head, int input) 
        {
            SLLNode newNode = new SLLNode(input,null);
            if (head == null) 
            {
                head = newNode;
            } 
            else 
            {
                SLLNode temp = head;
                while (temp.next != null) 
                {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
            return head;
        }
        static void sll_display(SLLNode head)
      {
         SLLNode tptr;
         for(tptr=head;tptr!=null;tptr=tptr.next)
        {
            System.out.print(tptr.data+" ");
        }
      }
    public static void main(String[] args) 
    {
        SLLNode head=null;
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            int num=scan.nextInt();
            if(num==-1)
                break;
            head=insert_at_end(head,num);
        }
        sll_display(head);
        scan.close();
    }
}