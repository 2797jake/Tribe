/**
 * Created by Jake on 5/14/2015.
 */
import java.util.Scanner;
public class Runner
{
	public static void main(String args[])
	{
		String[] PossibleStructures = {"Logger's Cabin","Stone Cutter's Hut","Leader's Hut","Water Trenches","Witch's Lair"};
		Scanner scan = new Scanner(System.in);
		int pop = 0;
		int food = 0;
		while(pop+food!=50)
		{
			System.out.println("Enter population then food supply from a pool of 50");
			pop = Math.abs(scan.nextInt());
			food = Math.abs(scan.nextInt());
		}
		int wood = 0;
		int stone = 0;
		while(wood+stone!=100)
		{
			System.out.println("Enter wood then stone stock from a pool of 100");
			wood = Math.abs(scan.nextInt());
			stone = Math.abs(scan.nextInt());
		}
		String struc = "";
		scan.nextLine();
		while(true)
		{
			System.out.println("Choose one starting structure");
			System.out.println("Logger's Cabin\nStone Cutter's Hut\nLeader's Hut\nWater Trenches\nWitch's Lair");
			struc = scan.nextLine();
			if(java.util.Arrays.asList(PossibleStructures).indexOf(struc) != -1)
			{
				break;
			}
		}
		InitialInclination inc = new InitialInclination(food, pop, wood, stone, struc);
	}
}
