package com.xincl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * 测试DataInputStream   DataOutputStream   数据源为字节数组
 * 1.先写出后读取
 * 2.按照输入顺序来读取，不然会产生错误
 * @author xincl
 *
 */
public class TestData {
     public static void main(String[] args) throws IOException {
    	//输出
    	ByteArrayOutputStream bes = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(bes));
		//操作数据类型+数据
		dos.writeUTF("编码");
		dos.writeInt(10);
		dos.writeBoolean(false);
		dos.writeChar('a');
		dos.flush();
		byte[] datas = bes.toByteArray();

		//读取
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		
		String msg = dis.readUTF();
		int i = dis.readInt();
		boolean flag = dis.readBoolean();
		char c = dis.readChar();
		
		System.out.println("按照输入的顺序输出： "+msg+" "+i+" "+flag+" "+c);

	}
}
