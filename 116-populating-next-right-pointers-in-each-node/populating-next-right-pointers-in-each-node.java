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
        Queue<Node>q=new LinkedList<>();
        if(root==null) return root;
        q.add(root);
        fun(q);
        return root;
    }

    public void fun(Queue<Node>q){
        while(!q.isEmpty()){
            int s=q.size();
            Node pre=null;
            for(int i=0;i<s;i++){
                Node r=q.poll();
                if(pre!=null){
                    pre.next=r;
                }
                pre=r;
                if(r.left!=null) q.add(r.left);
                if(r.right!=null) q.add(r.right);
            }
        }
    }
}