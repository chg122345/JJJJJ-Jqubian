package org.jleopard;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-16  上午11:13
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 *
 *  链表实现二叉树
 *  顺序二叉树
 *  小中大 --> 左 父 右
 */
public class DoubleTree {

    Node root; //根节点
    /**
     * 添加数据占据二叉树
     * @param value
     */
    public void add(int value){
        Node node = new Node(value);
        if (root == null){
            root = node;
        }else {
            Node temp = root;
            while (true){
                // 比根节点数小 放左边
                if (value < temp.getValue()){
                    if (temp.getLeft() == null){
                        temp.setLeft(node);
                        break;
                    }else {
                        temp = temp.getLeft();
                    }
                }else {  // 放右节点
                    if (temp.getRight() == null){
                        temp.setRight(node);
                        break;
                    }else {
                        temp = temp.getRight();
                    }
                }
            }

        }
    }

    public void showNode(Node root){
      //  System.out.println("先序" + root.getValue());
        if (root.getLeft() != null){
            showNode(root.getLeft());
        }
        System.out.println("中序" + root.getValue());
        if (root.getRight() != null){
            showNode(root.getRight());
        }
      //  System.out.println("后序" + root.getValue());
    }

    public void show(){
        showNode(root);
    }

    public static void main(String[] args) {
       DoubleTree tree = new DoubleTree();
       tree.add(1);
        tree.add(11);
        tree.add(18);
        tree.add(15);
        tree.add(14);
        tree.add(12);
        tree.add(13);
        tree.show();

    }

    class Node{

        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }
}
