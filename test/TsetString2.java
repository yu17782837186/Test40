package oop;

/**
 * 测试String的常用方法
 */

public class TsetString2 {
    public static void main(String[] args) {

//        String s1 = "core java";
//        String s2 = "Core java";
//        System.out.println(s1.charAt(2));
//        System.out.println(s2.length());
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));//(忽略大小写)
//        System.out.println(s1.indexOf("java"));
//        String s = s1.replace(' ','&');
//        System.out.println(s);
//        String s = " ";
//        String s1 = "How are you？";
//        System.out.println(s1.startsWith("How"));
//        System.out.println(s1.endsWith("？"));
//
//        s = s1.substring(2); //提取字符串  从当前下标开始一直到最后
//        System.out.println(s);
//        s = s1.substring(2,7);// 左闭右开区间
//        System.out.println(s);
//        s = s1.toUpperCase();// 全转换为大写
//        System.out.println(s);
//        s = s1.toLowerCase();// 全转换为小写
//        System.out.println(s);
          String s2 = " How old are you！ ";
          String s = s2.trim();
          System.out.println(s);
          System.out.println(s2);
    }
}
