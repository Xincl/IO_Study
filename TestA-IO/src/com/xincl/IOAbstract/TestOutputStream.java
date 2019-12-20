package com.xincl.IOAbstract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 测试输出FileOutputStream
 * 1.创建源
 * 2.选择流
 * 3.操作（写）
 * 4.释放系统资源
 * @author xincl
 *
 */
public class TestOutputStream {
     public static void main(String[] args) {
    	//1.创建源
		File f = new File("test.txt");
		//2.选择流
		OutputStream os = null;
		try {
			os = new FileOutputStream(f,true);  //f:目标文件，不存在会自己创建，false和true确定是否调用append，true为在后面加数据
			                                                   
			//3.操作
			String str = "xiaoluo is a beautiful girl\n";      //要写的数据
			byte[] b = str.getBytes();                         //编码
			os.write(b,0,b.length);                            //write（数组，开始位置，长度）
			os.flush();                                        //刷新
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(os!=null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
		
		
		
	}
}
