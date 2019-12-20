package com.xincl.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 测试输出FileReader  文件输出字符流      加入缓冲流
 * 1.创建源
 * 2.选择流
 * 3.操作（写）
 * 4.释放系统资源
 * @author xincl
 *
 */
public class TestWriter {
     public static void main(String[] args) {
    	//1.创建源
		File f = new File("test.txt");
		//2.选择流
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(f,false));  //f:目标文件，不存在会自己创建，false和true确定是否调用append，true为在后面加数据
			                                                   
			//3.操作
			//写法一
//			String str = "soilder\n我争";      //要写的数据
//			char[] c = str.toCharArray();   //到字符数组
//			writer.write(c, 0, c.length);
//			writer.flush();                                        //刷新
			
			//写法二
//			String str = "soilder\n我争";
//			writer.write(str,0,2);
//			writer.flush();
			
			//写法三
//			String str = "soilder\n我争";
//			writer.append(str);
			writer.append("soilder");
			writer.newLine();
			writer.append("我争");
			writer.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(writer!=null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
		
		
	}
}
