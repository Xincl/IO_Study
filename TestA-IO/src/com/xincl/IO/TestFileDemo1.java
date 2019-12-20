package com.xincl.IO;

import java.io.File;

/**
 * 测试一个文件的路径创建
 * @author xincl
 *
 */
public class TestFileDemo1 {
     public static void main(String[] args) {
		String path = "C:\\Users\\xincl\\Desktop\\Java\\项目\\TestA-IO\\src\\com\\xincl\\IO\\IO.png";
		
		//第一种创建File的方法  File src = new File(url);
		File src = new File(path);
		System.out.println(src);
		
		//第二种方式创建File的方法  File src = new File(String parents,String child); 
		src = new File("C:\\Users\\xincl\\Desktop\\Java\\项目\\TestA-IO\\src\\com\\xincl\\IO","IO.png");
		System.out.println(src);
		
		src = new File("C:\\Users\\xincl\\Desktop\\Java\\项目","TestA-IO\\src\\com\\xincl\\IO\\IO.png");
		System.out.println(src);
		
		//第三种方式来创建File File src = new File(new File(url),String);
		src = new File(new File("C:\\Users\\xincl\\Desktop\\Java\\项目\\TestA-IO\\src\\com\\xincl\\IO"),"IO.png");
		System.out.println(src);
	}
}
