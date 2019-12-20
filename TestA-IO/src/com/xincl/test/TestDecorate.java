package com.xincl.test;
/**
 * 测试修饰
 * 实现放大器对声音的放大
 * @author xincl
 *
 */
public class TestDecorate {
      public static void main(String[] args) {
		Person p  = new Person();
		p.say();
		
		Amplifier a = new Amplifier(p);
		a.say();
	}
}
interface Say{
	void say();
}

class Person implements Say{
    private int voice = 10;
	public int getVoice() {
		return voice;
	}
	public void setVoice(int voice) {
		this.voice = voice;
	}
	@Override
	public void say() {
		System.out.println("人类的叫声为:  "+this.getVoice()+"分贝");
	}
	
}

class Amplifier implements Say{
    Person p = new Person();
    
	public Amplifier(Person p) {
		super();
		this.p = p;
	}

	@Override
	public void say() {
		System.out.println("经过放大之后人的声音为： "+p.getVoice()*100+"分贝");
	}
	
}






