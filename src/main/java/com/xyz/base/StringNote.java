package com.xyz.base;

public class StringNote {


    public static void main(String args[]) {



        //split()
        String str = "小学,初中,高中,大专,本科,研究生,博士,";
        String[] buff = str.split(",");
        for(int i=0;i<buff.length;i++){
            System.out.println(buff[i]);
        }



        //replace()
        String str1="hello";
        System.out.println(str1.replace('l','a'));


        //substring() 按索引返回字符串
        String str2="just do it";
        System.out.println(str2.substring(2,5));

        StringBuffer sBuffer = new StringBuffer("just do it：");
        sBuffer.append("live");
        sBuffer.append("Z");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        //append 追加
        //reverse 反转
        //delete(int start, int end)    移除
        //insert(int offset, int i)     插入
        //replace(int start, int end, String str) 替换

    }
}
