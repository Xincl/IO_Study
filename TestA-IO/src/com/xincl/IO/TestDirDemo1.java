package com.xincl.IO;

import java.io.File;

/**
 * 测试创建文件目录
 * 使用mkdir(),需要确保上级目录存在，才会创建成功
 * 使用mkdirs(),上级目录可以不存在，在创建的时候会一起创建
 * @author xincl
 *
 */
public class TestDirDemo1 {
     public static void main(String[] args) {
		File dir = new File("C:/Users/xincl/Desktop/Java/测试/测试测试222/aaa");
		
		//创建目录 mkdirs()
		boolean flag = dir.mkdir();
		System.out.println(flag);
		
		//创建目录mkdirs()
		
		flag = dir.mkdirs();
		System.out.println(flag);
		
		
		
		
		
	}
}
