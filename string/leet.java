
//   Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class leet {
    public static void main(String[] args) {
        // ListNode a=new ListNode(5);
        // int b=0;
        // while (b<5) {
            ListNode n=new ListNode(2);
            n=new ListNode(3, n);
            n=new ListNode(4, n);
            n=new ListNode(5, n);
        // }
        while (n.next!=null|| n== null) {
            
            System.out.println(n.val);
            n=n.next;
        }
    }
   
      public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
          if(list1 == null && list2 == null)
          return null;
          if(list1.val<list2.val)
              {
                ListNode head=new ListNode(list1.val);
                  list1=list1.next;
              }
              else{
                ListNode head=new ListNode(list1.val);
                list2=list2.next;
              }
          while(list1 != null && list2 != null){
            
          if(list1.val<list2.val)
              {
                head=new ListNode(list1.val,head);
                  list1=list1.next;
              }
              else{
                head=new ListNode(list1.val,head);
                list2=list2.next;
              }}
            while (list1!=null) {
                head=new ListNode(list1.val,head);
                  list1=list1.next;
                
            }
            while (list2!=null) {
                head=new ListNode(list2.val,head);
                  list2=list2.next;
                
            }
              return head;
      }
  }