import java.util.*;
public class InsertatStart 
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
static SLLNode insert_at_begin(SLLNode head,int data) 
        {
          SLLNode newn=new SLLNode(data);
          newn.next=head;
          return newn;
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
            head=insert_at_begin(head,num);
        }
        sll_display(head);
        scan.close();
    }
}