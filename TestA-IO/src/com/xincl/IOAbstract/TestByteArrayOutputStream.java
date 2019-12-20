package com.xincl.IOAbstract;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 测试输出ByteArrayOutputStream
 * 1.创建源:内部维护
 * 2.选择流：不关联源
 * 3.操作（写）
 * 4.释放系统资源
 * 
 * 需要获取数据，用toByteArray.
 * @author xincl
 *
 */
public class TestByteArrayOutputStream {
     public static void main(String[] args) {
    	//1.创建源
		byte[] bes = null;
		//2.选择流
		ByteArrayOutputStream os = null;
		try {
			os = new ByteArrayOutputStream();  
			                                                   
			//3.操作
			String str = "show me the code\n";      
			byte[] b = str.getBytes();                         
			os.write(b,0,b.length);                           
			os.flush();                                       
			//获取数据
			bes = os.toByteArray();
			System.out.println(bes.length+"-->"+new String(bes,0,bes.length));
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
