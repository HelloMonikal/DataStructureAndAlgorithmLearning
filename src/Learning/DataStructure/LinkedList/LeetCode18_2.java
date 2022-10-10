package Learning.DataStructure.LinkedList;

public class LeetCode18_2 {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
        public ListNode(int[] arr){
            if (arr == null || arr.length ==0)
                throw new IllegalArgumentException("arr not not be empty");

            this.val = arr[0];
            ListNode cur = this;
            for(int i = 1;i<arr.length;i++){
                cur.next = new ListNode(arr[i]);
                cur = cur.next;
            }

        }
        @Override
        public String toString(){
            StringBuilder res = new StringBuilder();
            ListNode cur = this;
            while(cur != null){
                res.append(cur.val+"->");
                cur = cur.next;
            }
            res.append("Null");
            return res.toString();
        }
    }
          public ListNode removeElements(ListNode head,int val){
//              不设置虚拟头结点
              ListNode dummyHead = new ListNode(-1);
              dummyHead.next = head;

              ListNode pre = dummyHead;
              while(pre.next!= null){
                  if(pre.next.val == val)
                      pre.next = pre.next.next;
                  else
                      pre = pre.next;
              }
              return dummyHead.next;
          }

    public static void main(String[] args) {
        int[] nums = {1,2,3,6,4,6,5,6};
        ListNode head = new ListNode(nums);
        System.out.println(head);

        ListNode res = (new LeetCode18_2()).removeElements(head,6);
        System.out.println(res);

    }

}
