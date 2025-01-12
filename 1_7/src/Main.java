//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        L746_Min_Cost_Climbing_Stairs test = new L746_Min_Cost_Climbing_Stairs();
//        int[] data = new int[] {1,100,1,1,1,100,1,1,100,1};
//        System.out.println(test.minCostClimbingStairs(data));

//        L198_House_Robber test = new L198_House_Robber();
//        int[] data = new int[]{1,2,3,1};
//        System.out.println(test.rob(data));

//        L70_Climbing_Stairs test = new L70_Climbing_Stairs();
//        System.out.println(test.climbStairs(3));

        //  415
//        L415_AddString test = new L415_AddString();
//        System.out.println(test.addStrings("6913259244","71103343"));

        // 206
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        L206_ReverseNode node = new L206_ReverseNode();
        System.out.println(node.reverseList(test));
    }
}