package com.xincl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 测试DataInputStream   DataOutputStream   节点为文件
 * 1.先写出后读取
 * 2.按照输入顺序来读取，不然会产生错误
 * @author xincl
 *
 */
public class TestObject2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
    	File f = new File("testObject.txt");
    	
    	ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(f)));
    	oos.writeUTF("编码");
		oos.writeInt(10);
		oos.writeBoolean(false);
		oos.writeChar('a');
		//写出-->这叫序列化
		oos.writeObject("我的故事都是关于你啊");
		oos.writeObject(new Date());
		Employee e = new Employee("xincl", 50000);
		oos.writeObject(e);
		oos.flush();
		oos.close();
    	
    	ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(f)));
    	String msg = ois.readUTF();
		int i = ois.readInt();
		boolean flag = ois.readBoolean();
		char c = ois.readChar();
		
		System.out.println("按照输入的顺序输出： "+msg+" "+i+" "+flag+" "+c);
		//读取-->这叫反序列化
		Object object1 = ois.readObject();
		Object object2 = ois.readObject();
		Object object3 = ois.readObject();
		
		//添加类型转换
		if(object1 instanceof String) {
			String obj = (String)object1;
			System.out.println(obj);
		}
		if(object2 instanceof Date) {
			Date objdate = (Date)object2;
			System.out.println(objdate);
		}
		if(object3 instanceof Employee) {
			Employee objemp = (Employee)object3;
			System.out.println(objemp.getName()+"--->"+objemp.getSalary());
		}
    	ois.close();
    }   
    
    
}
@SuppressWarnings("serial")
class Employee2 implements java.io.Serializable{
	private String name;
	private double salary;
	public Employee2() {
		super();
	}
	public Employee2(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}



