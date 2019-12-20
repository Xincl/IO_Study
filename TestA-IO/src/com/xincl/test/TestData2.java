package com.xincl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 测试DataInputStream   DataOutputStream   节点为文件
 * 1.先写出后读取
 * 2.按照输入顺序来读取，不然会产生错误
 * @author xincl
 *
 */
public class TestData2 {
     public static void main(String[] args) throws IOException {
    	File f = new File("testdata.txt");
    	BufferedOutputStream os = new BufferedOutputStream(new FileOutputStream(f));
		DataOutputStream dos =  new DataOutputStream(os); 
    	dos.writeUTF("编码sss");
		dos.writeInt(1022);
		dos.writeBoolean(false);
		dos.writeChar('a');
		
		dos.flush();
    	dos.close();
    	
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(f)));
    	String msg = dis.readUTF();
		int i = dis.readInt();
		boolean flag = dis.readBoolean();
		char c = dis.readChar();
        dis.close();
		System.out.println("按照输入的顺序输出： "+msg+" "+i+" "+flag+" "+c);
    	
	}
}
