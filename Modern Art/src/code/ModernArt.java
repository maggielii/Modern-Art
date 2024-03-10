package code;

import java.util.Scanner;

public class ModernArt {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int M = input.nextInt();//rows
		int N = input.nextInt();//columns
		int K = input.nextInt();
		int gold = 0;
		
		int[][] canvas = new int[M][N];
		
		for(int x = 0; x < canvas.length; x++)
		{
			for(int y = 0; y < canvas[x].length; y++)
			{
				System.out.print(canvas[x][y] + " "); //0 is black
			}
			System.out.println();
		}
		
		for(int x = 0; x < K; x++)
		{
			String choice = input.next(); 
			char[] array = choice.toCharArray();
			int label = Integer.parseInt( choice.substring(1) ) - 1;

			if(array[0] == 'R')
			{ 
				for(int z = 0; z < canvas.length; z++)
				{
					for(int y = 0; y < canvas[z].length; y++)
					{
						if(canvas[label][y] == 0)
						{
							canvas[label][y] = 1;
						}
						else if(canvas[label][y] == 1)
						{
							canvas[label][y] = 0;
						}
					}
				}
			}
			if(array[0] == 'C')
			{
				for(int z = 0; z < canvas.length; z++)
				{
					if(canvas[z][label] == 0)
					{
						canvas[z][label] = 1;
					}
					else if(canvas[z][label] == 1)
					{
						canvas[z][label] = 0;
					}
				}
			}
		}
		for(int x = 0; x < canvas.length; x++)
		{
			for(int y = 0; y < canvas[x].length; y++)
			{
				System.out.print(canvas[x][y] + " "); 
			}
			System.out.println();
		}
		
		
		for(int x = 0; x < canvas.length; x++)
		{
			for(int y = 0; y < canvas[x].length; y++)
			{
				if(canvas[x][y] == 1)
				{
					gold++;
				}
			}
		}
		
		System.out.println(gold);
		
	}

}
