package org.jleopard.list;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-16  上午10:35
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 * <p>
 * 单链表 简单实现
 */
public class MyLinkList {

    Node head; // 表头

    int size = 0;

    public int size() {
        return size;
    }

    public void add(Object value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
        size++;
    }

    public void set(int index, Object value){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        temp.setValue(value);
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public Object get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.getValue();
    }

    public void removeAt(int index) {

        if (index == 0){
            head = head.getNext();
        }else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
            }
            // 绕过删除的节点
            temp.setNext(temp.getNext().getNext());
        }
        size --;
    }

    public static void main(String[] args){
        MyLinkList list = new MyLinkList();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.set(1, 18);
        list.removeAt(2);
        list.clear();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    class Node {
        Object value;
        Node next;  // 下一个节点

        public Node(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }

        public void setValue(Object value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
