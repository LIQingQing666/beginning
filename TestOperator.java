/*
*测试操作符 + - * / % ++ --等
*测试扩展运算符
*测试关系运算符
*逻辑运算符
*位运算符
*测试字符串连接符
*测试条件运算符
*符号优先级
*自动转换
*强制转换
*常见错误：溢出
*/
public class TestOperator{

	public static void main(String[] args){

		int a=3,b=4;
		int c=a+b;
		double d=3+3.14;//有一个为double,值为double
		int e=31/3;//两个整数相除，直接保留整数部分，没有四舍五入
		System.out.println(e);
		
		a+=b;//扩展运算符
		a*=b+3;//相当于 a=a*(b+3)
		System.out.println(a);

		boolean g=a<b;
		System.out.println(g);

		boolean b1=true;
		boolean b2=false;
		System.out.println(b1&b2);//与
		System.out.println(b1|b2);//或
		System.out.println(!b2);//取反
		System.out.println(b1^b2);//异或
		//短路与、短路或
		//int b3=3/0;//报错
		boolean b3=1>2 && (4>(3/0));
		System.out.println(b3);
		
		int c1=7;
		int c2=8;
		System.out.println(c1&c2);
		System.out.println(c1|c2);		
		System.out.println(c1^c2);
		System.out.println(~c2);
		//移位
		int c3=5<<2;//左移相当于5*2*2
		System.out.println(c3);
		System.out.println(40>>3);//相当于40/2^3

		String c4="3";
		int c5=4;
		System.out.println(c4+c5);
		//条件是String,不是char。若是char,则仍然是加法
		char d1='h';
		char d2='i';
		System.out.println(d1+d2);
		System.out.println(""+d1+d2);//通过加空字符串，让整个+都变成连接符

		int score=90;
		String d3=score<60?"不及格":"及格";
		System.out.println(d3);

		boolean s1=true,s2=true,s3=false;
		System.out.println(s1||s2&&s3);//非>与>或
		boolean s4 = (3>1||4>3)&&(5>6);
		System.out.println(s4);

		int g1=2345;
		int g2=g1;//容量小的类型可以自动转成容量大的类型
		//int g3=g2;//long类型不能自动转换成int
		double g4=g2;
		float g5=g2;
		//特例：整型常量是int类型。但是可以自动转换成：byte/short/char  只要不超过对应类型的表述范围
		byte h1=123;
		//byte h2=1234;//超过表述范围
		char h3=97;
		System.out.println(h3);

		double h4 =3.1415;
		int h5=(int) h4;//浮点数转为整数，直接丢失小数部分
		//强制转型，超过了表述范围，则会转成一个完全不同的值
		byte e1=(byte)300;
		System.out.println(e1);

		int money =1000000000;//10亿
		int year =20;
		//返回的total是负数，超过了int的范围
		int total =money*year;	
		System.out.println(total);
		//返回的total1仍然是负数。默认是int,因此结果会变成int值，再转成long类型
		long total1=money*year;
		System.out.println(total1);
		//返回的total2正确：先将一个因子变成long,整个表达式发生提升，变为long类型
		long total2=1L*money*year;//或是long total2=money*(long)year;
		System.out.println(total2);
		
		


}
}