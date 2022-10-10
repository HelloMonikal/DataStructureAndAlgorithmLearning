package Learning.DataStructure.LinkedList;

public class ReverseList {

    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val =x;
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
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;

        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;

    }

    public ListNode reverseListRecursion(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode rev = reverseListRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return rev;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode listNode = new ListNode(nums);
        System.out.println(listNode);

        listNode = new ReverseList().reverseListRecursion(listNode);
        System.out.println(listNode);

    }
}
