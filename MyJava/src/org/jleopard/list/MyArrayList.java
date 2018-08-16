package org.jleopard.list;

/**
 * @Copyright (c) 2018, Chen_9g 陈刚 (80588183@qq.com).
 * @DateTime 2018-08-15  上午10:35
 *
 * <p>
 * 众里寻他千百度，蓦然回首，那人却在，灯火阑珊处。
 * Find a way for success and not make excuses for failure.
 * </p>
 */
public class MyArrayList {

    private Object[] arr = new Object[4];

    private int size;

    public int size() {
        return size;
    }

    public void add(Object value) {
        if (size >= arr.length){
            Object[] temp = new Object[arr.length * 2];
            for (int i = 0; i < arr.length; i ++){
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size] = value;
        size ++;
    }

    public void set(int index ,Object value) throws Exception {
        if (index >=0 && index < size){
            arr[index] = value;
        }else {
            throw new Exception("数组下标越界");
        }
    }

    public void clear(){
        size = 0;
        arr = new Object[4];
    }

    public Object get(int index) throws Exception {
        if (index <0 || index > size){
            throw new Exception("数组下标越界");
        }
        return arr[index];
    }

    public void removeAt(int index) throws Exception {
        if (index <0 || index > size){
            throw new Exception("数组下标越界");
        }
        for (int i = index + 1; i < arr.length; i ++){
            arr[i - 1] = arr[i];
        }
        size --;
        arr[size] = null;
    }

    public static void main(String[] args) throws Exception {
        MyArrayList list = new MyArrayList();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
      //  list.set(1,18);
      //  list.clear();
        list.removeAt(2);
        for (int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }

    }
}
