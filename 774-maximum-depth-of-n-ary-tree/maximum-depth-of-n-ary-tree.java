/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    int d=0;
    public int maxDepth(Node root) {
        if(root==null) return 0;
        Queue<Node>q=new LinkedList<>();
        q.add(root);
        fun(root,q);
        return d;
    }

    public void fun(Node root,Queue<Node>q){
        while(!q.isEmpty()){
            int s=q.size();
            for(int i=0;i<s;i++){
                Node r=q.remove();
                for(Node nn:r.children){
                    q.add(nn);
                }
            }
            d++;
        }
    }
}