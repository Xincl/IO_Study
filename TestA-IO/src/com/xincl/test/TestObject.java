package com.xincl.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 测试ObjectInputStream称为反序列化,ObjectOutputSream过程成为序列话化
 * 1.先写出后读取
 * 2.按照输入顺序来读取，不然会产生错误
 * 3.不是所有对象都可以序列化
 * @author xincl
 *
 */
public class TestObject {
     public static void main(String[] args) throws IOException, ClassNotFoundException {
    	//输出
    	ByteArrayOutputStream bes = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(bes));
		//操作数据类型+数据
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
		byte[] datas = bes.toByteArray();

		//读取
		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
		
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
		

	}
}

@SuppressWarnings("serial")
//javabean
class Employee implements java.io.Serializable{   //加上"通行证"serializable才可以进行对象的序列化
	private transient String name;   //该数据不需要序列话，存在透明，敏感数据可以不显示
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, double salary) {
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




