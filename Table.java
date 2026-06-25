import java.util.Scanner;


class Table {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any number:");

		int number = sc.nextInt();

		for(int i=1 ; i<=10 ; i++)
		{
          int result = number*i;

          System.out.println(number+ "*"+i+"="+result);
		}


	}
}

OUTPUT/
Enter any number:
4
4*1=4
4*2=8
4*3=12
4*4=16
4*5=20
4*6=24
4*7=28
4*8=32
4*9=36
4*10=40
