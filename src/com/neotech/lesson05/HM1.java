package com.neotech.lesson05;

public class HM1 {

	public static void main(String[] args) {
		boolean seafood = true;
		boolean lactose = true;
		boolean peanut = false;
		boolean allergies = true;
		boolean bee = false;{

		if(allergies)
		{
			System.out.println("You have allergies");

			if (peanut) {
				System.out.println("Peanuts are not good for you. Don't eat peanuts");
			}

			if (lactose) {
				System.out.println("Lactose is not good for you. Dont consume lactose.");
				}

			if (seafood)
			{
				System.out.println("Don't consume seafood. You have seafood allergies.");
			}
			
			if(bee)
			{
				System.out.println("Stay away from bee!");
			}
			else 
			{
				System.out.println("Other than that,you are healty! You can enjoy peanuts.");
					
				}
			}
		
		}
		}

	}


