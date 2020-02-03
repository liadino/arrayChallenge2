package arrayChallenge2;

import java.util.Scanner;

public class challenge2
	{
		static int monthNum;
		static Scanner Input = new Scanner(System.in);

	



		public static void main(String[] args)
			{
				solveChallenge1();
				solveChallenge2();
				solveChallenge3();
				

			}
				private static void solveChallenge1()
					{
						int[] numbers1 =
							{ 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
								
						int square = 0;
						for (int i = 0; i < numbers1.length; i++)
							{

								square = numbers1[i] * numbers1[i];
								System.out.println(square);
							}



					}
				private static void solveChallenge2()
				{
					String[] months = 
								{ "That's not a month", "January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
					System.out.println("Tell me a number 1-12! ");
					 monthNum = Input.nextInt();
					System.out.println(months[monthNum]);
				}
				private static void solveChallenge3()
				{
					String[] suits = 
								{"Diamonds", "Spades", "Hearts", "Clubs"};
				   int suitRandom = (int)(Math.random() * ((suits.length)));

					String[] value = 
								{"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
				  int  valueRandom = (int)(Math.random() * ((value.length)));
				    
					System.out.println(value[valueRandom] + " of " + suits[suitRandom]);
				}

			}


