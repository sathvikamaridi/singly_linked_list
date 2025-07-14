import java.util.*;
public class InsertatEndDeletebyValue
 
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

        static SLLNode search_delete(SLLNode head,int key)
        {
          if(head==null)
          {
            return null;
          }
          if(head.data==key)
          {
            return head.next;
          }
          SLLNode curr=head;
          while(curr.next!=null&&curr.next.data!=key)
          {
            curr=curr.next;
          }
          if(curr.next!=null)
          {
            curr.next=curr.next.next;
          }
          return head;
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
        int del_val=scan.nextInt();
        head=search_delete(head,del_val);
        sll_display(head);
        scan.close();
    }
}