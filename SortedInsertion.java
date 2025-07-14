import java.util.*;
public class SortedInsertion
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
        static void sll_display(SLLNode head)
      {
         SLLNode tptr;
         for(tptr=head;tptr!=null;tptr=tptr.next)
        {
            System.out.print(tptr.data+" ");
        }
      }

 static SLLNode sorted_insert(SLLNode head,int data) 
        {
         SLLNode newn=new SLLNode(data);
         if(head==null||data<head.data)
         {
           newn.next=head;
           return newn;
         }
         SLLNode curr=head;
         while(curr.next!=null&&curr.next.data<data)
         {
           curr=curr.next;
         }
         newn.next=curr.next;
         curr.next=newn;
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
            head=sorted_insert(head,num);
        }
        sll_display(head);
        scan.close();
    }
}