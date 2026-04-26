public class TestVariable{
	int w=3;//成员变量
	static int r=4;//静态变量

	public static void main(String[] args){
		//局部变量
		int age = 18;
		int x=0,y=0,z=1;
		int b;//只是声明了变量b,没有初始化：
		System.out.println(age);
		b=0;//使用之前，必须初始化!
		System.out.println(b);
}

}