package chenjiajin.listUtilsdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 第一个是排序的
 */
public class Collenctions {

    static List<Integer> list = new ArrayList<>();

    static {
        list.add(-1);
        list.add(3);
        list.add(3);
        list.add(-5);
        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(-7);
    }

    public static void main(String[] args) {
//        reverse();//翻转
//        shuffle();//随机排序
//        sort();//自然升序排序
//        swap();//交换下标位置
        rotate(4);//旋转位置，相当于所有元素向后移动四位，如遇到末尾数则进到0后移直至满足移动4位数

    }

    /**
     * 翻转
     */
    public static void reverse() {
        System.out.println();
        System.out.println("翻转开始");

        System.out.println("-----------原始数组----------");
        System.out.println(list.toString());
        System.out.println("-----------转换后----------");
        Collections.reverse(list);
        System.out.println(list.toString());
        System.out.println("-----------转换结束----------");
    }

    /**
     * 随机排序
     */
    public static void shuffle() {
        System.out.println();
        System.out.println("随机排序开始");
        System.out.println("-----------原始数组----------");
        System.out.println(list.toString());
        System.out.println("-----------转换后----------");
        Collections.shuffle(list);
        System.out.println(list.toString());
        System.out.println("-----------转换结束----------");
    }

    /**
     * 自然升序排序
     */
    public static void sort() {
        System.out.println();
        System.out.println("自然升序排序开始");
        System.out.println("-----------原始数组----------");
        System.out.println(list.toString());
        System.out.println("-----------转换后----------");
        Collections.sort(list);
        System.out.println(list.toString());
        System.out.println("-----------转换结束----------");
    }

    /**
     * 交换索引位置
     */
    public static void swap() {
        System.out.println();
        System.out.println("交换索引位置开始");
        System.out.println("-----------原始数组----------");
        System.out.println(list.toString());
        System.out.println("-----------转换后----------");
        Collections.swap(list, 0, list.size() - 1);
        System.out.println(list.toString());
        System.out.println("-----------转换结束----------");
    }

    /**
     * 交换索引位置
     */
    public static void rotate(int a) {
        System.out.println();
        System.out.println("交换索引位置开始");
        System.out.println("-----------原始数组----------");
        System.out.println(list.toString());
        System.out.println("-----------转换后----------");
        Collections.rotate(list, a);
        System.out.println(list.toString());
        System.out.println("-----------转换结束----------");
    }

}

/**
 * 第二个是查找的
 */
class find {
    static List<Integer> list = new ArrayList<>();

    static {
        list.add(-1);
        list.add(3);
        list.add(3);
        list.add(-5);
        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(-7);
    }

    public static void main(String[] args) {
//        max();//找到最大的元素
//        min();//找到最小的元素
        frequency(3);//查找指定元素出现的次数


    }

    /**
     * 查找到最大的元素 英文中文适用，中文用来干嘛不知道了
     */
    public static void max() {
        List<String> l = new ArrayList<>();
        l.add("爱的");
        l.add("武器");
        l.add("速度");
        l.add("过道");
        System.out.println();
        System.out.println("查找到最大的元素开始");
        System.out.println("-----------原始数组----------");
        System.out.println(l.toString());
        System.out.println("-----------查找后----------");
        System.out.println(Collections.max(l));
        System.out.println("-----------结束----------");
    }

    /**
     * 查找到最小的元素 英文中文适用，中文用来干嘛不知道了
     */
    public static void min() {
        List<String> l = new ArrayList<>();
        l.add("爱的");
        l.add("武器");
        l.add("速度");
        l.add("过道");
        System.out.println();
        System.out.println("查找到最小的元素开始");
        System.out.println("-----------原始数组----------");
        System.out.println(l.toString());
        System.out.println("-----------查找后----------");
        System.out.println(Collections.min(l));
        System.out.println("-----------结束----------");
    }

    /**
     * 查找到最小的元素 英文中文适用，中文用来干嘛不知道了
     */
    public static void frequency(Object o) {
        System.out.println();
        System.out.println("查找到最小的元素开始");
        System.out.println("-----------原始数组----------");
        System.out.println(list.toString());
        System.out.println("-----------查找后----------");
        System.out.println(Collections.frequency(list,o));
        System.out.println("-----------结束----------");
    }



}