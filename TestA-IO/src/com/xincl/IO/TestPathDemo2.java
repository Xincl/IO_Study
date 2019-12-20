package com.xincl.IO;

import java.io.File;

/**
 * 测试File的路径
 * 相对路径和绝对路径
 * 有盘符就是绝对路径，没有盘符就是相对路径
 * @author xincl
 *
 */
public class TestPathDemo2 {
     public static void main(String[] args) {
    	 String path = "C:\\Users\\xincl\\Desktop\\Java\\项目\\TestA-IO\\src\\com\\xincl\\IO\\IO.png";
    	 
    	 
    	 //绝对路径
    	 File src = new File(path);
         System.out.println(src.getAbsolutePath());
    	 
    	 //相当路径
         System.out.println(System.getProperty("user.dir"));
         src = new File("IO.png");
         System.out.println(src);
         
         //创建一个不存在的文件，说明了File类只是连接数据源和程序的一个路径，文件，文件夹等
         src = new File("aaa/IO.png");
         System.out.println(src.getAbsolutePath());
         
    	 
     }
}     