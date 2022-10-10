package Learning.DataStructure.LinkedList;
public class LeetCode18_3 {



    public LeetCode18_2.ListNode removeElements(LeetCode18_2.ListNode head, int val, int depth) {
        String depthString = generateDepthString(depth);

        System.out.print(depthString);
        System.out.println("Call remove " + val+ " in " + head);

        if (head == null){
            System.out.print(depthString);
            System.out.println("Return "+ head);
            return null;}


        //  get next chain
        LeetCode18_2.ListNode res = removeElements(head.next, val,depth + 1);
        //  check current head
        System.out.print(depthString);
        System.out.println("After Remove "+ val+ ":" + res);

        LeetCode18_2.ListNode ret;

        if(head.val == val)
            ret = res;
        else{
            head.next = res;
            ret = head;
        }
        System.out.print(depthString);
        System.out.println("Return "+ ret);
        return ret;

    }
    private String generateDepthString(int depth){
        StringBuilder res = new StringBuilder();
        for(int i=0;i<depth;i++)
            res.append("--");
        return res.toString();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,6,4,6,5,6};
        LeetCode18_2.ListNode head = new LeetCode18_2.ListNode(nums);
        System.out.println(head);
        LeetCode18_2.ListNode res = new LeetCode18_3().removeElements(head,6, 0);
        System.out.println(res);

    }

}