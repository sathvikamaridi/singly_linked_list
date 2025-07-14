import java.util.*;
public class EndInsertEndDelete
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

         static SLLNode delete_at_end(SLLNode head)
        {
          if(head==null)
          {
            return null;
          }
          if(head.next==null)
          {
            return null;
          }
          SLLNode tmp=head;
          while(tmp.next.next!=null)
          {
            tmp=tmp.next;
          }
          tmp.next=null;
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
        head=delete_at_end(head);
        sll_display(head);
        scan.close();
    }
}