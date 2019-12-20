package com.xincl.IO;

import java.io.File;

/**
 * 测试File类的几种创建对象的方法
 * @author xincl
 *
 */
public class TestPathDemo1 {
     public static void main(String[] args) {
		String path = "C:\\Users\\xincl\\Desktop\\Java\\项目\\TestA-IO\\src\\com\\xincl\\IO\\IO.png";
		System.out.println(path);
		
		//建议使用/，或者常量字符
		//1
		path = "C:/Users/xincl/Desktop/Java/项目/TestA-IO/src/com/xincl/IO/IO.png";
		System.out.println(path);
		
		//使用常量拼接
		path = "C:"+File.separator+"Users"+File.separator+"xincl"+File.separator+"Desktop"+File.separator+"Java"+File.separator+"项目"+File.separator+"TestA-IO"+File.separator+"src"+File.separator+"com"+File.separator+"xincl"+File.separator+"IO"+File.separator+"IO.png";
		System.out.println(path);
	}
}
