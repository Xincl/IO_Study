package com.xincl.IO;

import java.io.File;
import java.io.IOException;

/**
 * 测试File类的下属几个方法
 * 正式使用时会先判断是否存在
 * 补充con.com3等这些都是系统的设备名称，不能正确进行创建
 * @author xincl
 *
 */
public class TestFileMethod {
     public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\xincl\\Desktop\\Java\\项目\\TestA-IO\\src\\com\\xincl\\IO\\IO.png";
		
//		fileMethod(path);
		
		//正式使用的文件状态
		File file = new File(path);
		if(!file.exists()) {
			System.out.println("文件不存在");
		}else {
			if(file.isFile()) {
				System.out.println("文件操作");
			}else {
				System.out.println("文件夹操作");
			}
		}
		
		fileMethod2();
		
	}
     
     //基础的File方法
     public static void fileMethod(String path) {
    	 File src = new File(path);
 		
 		//获取文件名字
 		System.out.println("文件名称为： "+src.getName());
 		
 		//获取路径
 		System.out.println("文件的path路径：  "+src.getPath());  //这个方法，在构建File的时候使用相对路径就显示相对路径，绝对路径就会显示绝对路径
 		
 		//获取绝对路径
 		System.out.println("文件的绝对路径"+src.getAbsolutePath());
 		
 		//获取父文件夹
 		System.out.println("父文件夹: "+src.getParent());
 		
 		//测试是否存在
 		System.out.println("测试文件是否存在： "+src.exists());
 		
 		//判断是否为文件
 		System.out.println("测试是否为文件： "+src.isFile());
 		
 		//判断是否为路径
 		System.out.println("测试是否为路径、文件夹： "+src.isDirectory());
 		
 		//获取父对象名称
 		System.out.println("父对象名称为："+src.getParentFile().getName());
 		
 		//获取文件的长度
 		System.out.println("文件的长度大小： "+src.length());
 		src = new File("C:\\Users\\xincl\\Desktop\\Java\\项目\\TestA-IO\\src\\com\\xincl\\IO");
 		System.out.println("文件的长度大小： "+src.length());
 		
 		
     }

     //createNewFile方法和delete方法
     public static void fileMethod2() throws IOException{
    	 //不存在才创建
    	 File file = new File("C:/Users/xincl/Desktop/Java/项目/TestA-IO/src/com/xincl/IO/aaa.txt");
    	 boolean flag = file.createNewFile();
    	 System.out.println(flag);
    	 flag = file.delete();
    	 System.out.println(flag);
    	 
    	 System.out.println("-------这里是分割线---------");
    	
    	 //创建文件夹，但是不是一个正经的文件夹，没有像普通文件夹一样
    	 file = new File("C:\\Users\\xincl\\Desktop\\Java\\测试\\aaa");
    	 flag = file.createNewFile();
    	 System.out.println(flag);
    	 
    	 
    	 //删除文件
    	 flag = file.delete();
    	 System.out.println(flag);
     }
     
     
}
