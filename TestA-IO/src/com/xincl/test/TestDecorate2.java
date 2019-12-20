package com.xincl.test;
/**
 * ģ�⿧��
 * 1.�����������Ҫװ�εĳ�����󣨽ӿڻ��߳����ࣩ
 * 2.�����������Ҫװ�εĶ���
 * 3.����װ���ࣺ�����˶Գ�������������Լ�װ���߹��еķ���
 * 4.����װ���ࣺ��װ�ε���
 * @author xincl
 *
 */
public class TestDecorate2 {
      public static void main(String[] args) {
		Drink coffee = new Coffee();
		System.out.println("ԭζ����ԭ��Ϊ-->"+coffee.cost());
		Drink milk = new Milk(coffee);
		System.out.println(milk.info()+"-->"+milk.cost());
		Drink sugar = new Sugar(coffee);
		System.out.println(sugar.info()+"-->"+sugar.cost());
		milk = new Milk(sugar);
		System.out.println(milk.info()+"-->"+milk.cost());
	}
}

//�������
interface Drink{
	double cost();
	String info();
}

//�������
class Coffee implements Drink{

	private String name = "ԭζ����";
	@Override
	public double cost() {
		return 10;
	}

	@Override
	public String info() {
		return this.name;
	}
	
}

//����װ����
abstract class Decorate implements Drink{

	//�Գ������������
	private Drink drink;
	
	public Decorate(Drink drink) {
		super();
		this.drink = drink;
	}

	@Override
	public double cost() {
		return this.drink.cost();
	}

	@Override
	public String info() {
		return this.drink.info();
	}
	
}

//����װ����1
class Milk extends Decorate{

	public Milk(Drink drink) {
		super(drink);
	
    }
	@Override
	public double cost() {
		return super.cost()+3;
	}
	
	@Override
	public String info() {
		return super.info()+"����ţ��";
	}
}
//����װ����2
class Sugar extends Decorate{

	public Sugar(Drink drink) {
		super(drink);
	
  }
	@Override
	public double cost() {
		return super.cost()+2;
	}
	
	@Override
	public String info() {
		return super.info()+"������";
	}
}










