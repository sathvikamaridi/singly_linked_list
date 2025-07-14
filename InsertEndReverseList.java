import java.util.*;
public class InsertEndReverseList
{
    static class SLLNode 
    {
        int data;
        SLLNode next;
        SLLNode(int data) 
        {
            this.data = data;
            this.next = null;
        }
    }
        static SLLNode insert_at_end(SLLNode head, int data) 
        {
            SLLNode newNode = new SLLNode(data);
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

        static SLLNode sll_reverse(SLLNode head)
        {
          SLLNode prev=null;
          SLLNode curr=head;
          SLLNode next=null;
          while(curr!=null)
          {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
          }
          return prev;
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
        head=sll_reverse(head);
        sll_display(head);
        scan.close();
    }
}