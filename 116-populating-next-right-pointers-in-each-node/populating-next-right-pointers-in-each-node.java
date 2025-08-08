/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node left=root;
        if(left==null) return null;
        while(left.left!=null){
            Node cur=left;
            while(cur!=null){
                cur.left.next=cur.right;
                if(cur.next!=null){
                    cur.right.next=cur.next.left;
                }
                cur=cur.next;
            }
            left=left.left;
        }
        return root;
    }
}