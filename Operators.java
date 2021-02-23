public class Operators{
	public static void main(String[] args){
		int a=3,b=2;
		int Left_shift=a<<b;//Left shift operator. To calculate this:(a*2^b)
		System.out.println(Left_shift);
		int Right_shift=a>>b;//Right shift operator. To calculate this:(a/2^b)
								//definitely it will o, 3/2^2=3/4=0(question)
		System.out.println(Right_shift);
	}
}