import java.util.Scanner;
class quiz
{
	Scanner obj=new Scanner(System.in);
	public int marks=0;
	public char ch;
	public String name;
	public void takedetails()
	{
		System.out.print("Enter the name:-");
		name=obj.nextLine();
	}
	public void question1()
	{
		System.out.println("When India get Indipendent?");
		System.out.println("a. 15 Janauary 1951");
		System.out.println("b. 15 August 1947");
		System.out.println("c. 26 August 1947");
		System.out.println("d. 26 August 1951");
		System.out.print("Enter the choise:");
		ch=obj.next().charAt(0);
		if(ch=='b')
		{
			marks=marks+5;
		}
	}
	public void question2()
	{
		System.out.println("Who is the first Prime Minister of India?");
		System.out.println("a. Jabahal Lal Neheru");
		System.out.println("b. M. Gandhi");
		System.out.println("c. Indira Gandhi");
		System.out.println("d. B.R. Ambedkar");
		System.out.print("Enter the choise:");
		ch=obj.next().charAt(0);
		if(ch=='a')
		{
			marks=marks+5;
		}
	}
	public void question3()
	{
		System.out.println("Who known as Missile Man?");
		System.out.println("a. Achariya Aryabhat");
		System.out.println("b. Shree Ramanujan");
		System.out.println("c. Pratibha Devi Singh Patel");
		System.out.println("d. A.P.J. Abdul Kalam");
		System.out.print("Enter the choise:");
		ch=obj.next().charAt(0);
		if(ch=='d')
		{
			marks=marks+5;
		}
	}
	void question4()
	{
		System.out.println("Who is the Father of Constitution?");
		System.out.println("a. M.D.K. Gandhi");
		System.out.println("b. B.R. Ambedkar");
		System.out.println("c. Subhas Chandra Bose");
		System.out.println("d. Ranbindra Nath Tagore");	
		System.out.print("Enter the choise:");
		ch=obj.next().charAt(0);
		if(ch=='b')
		{
			marks=marks+5;
		}
	}
	public void question5()
	{
		System.out.println("In which year Hony Sub Maj Prabir Kumar Samui is retired?");
		System.out.println("a. 2019");
		System.out.println("b. 2018");
		System.out.println("c. 2020");
		System.out.println("d. 2017");
		System.out.print("Enter the choise:");
		ch=obj.next().charAt(0);
		if(ch=='a')
		{
			marks=marks+5;	
		}	
	}
	public void showdetails()
	{
		System.out.println("Your name is "+name);
		System.out.println("You got "+marks+"marks");
	}
	public static void main(String[] ar)
	{
		quiz q=new quiz();
		System.out.println("Your quiz start now. Each question have 5 points. All the best!!!");
		q.takedetails();
		q.question1();
		q.question2();
		q.question3();
		q.question4();
		q.question5();
		q.showdetails();
	}

}		
		