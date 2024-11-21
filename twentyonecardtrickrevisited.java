package mansurbarancirit;
import java.util.Scanner;
public class twentyonecardtrickrevisited {
	public static void Shuffle(String [] deck) {
		for(int i=deck.length-1; i>0;i--)
		{
			int j=(int)(Math.random()*(i+1));
			String temp=deck[i];
			deck[i]=deck[j];
			deck[j]=temp;
		}

	}
	
	public static String[] pick21(String [] deck) {
		String[] myDeck= new String[21];
		for(int i=0;i<21;i++) 
		{
			myDeck[i]=deck[i];
		}
		return myDeck;
	}
	
	public static void displayList_str(String[] list) {
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
	}
	
	public static void showDeckToUser(String[] deck) {
		System.out.format(" %-9s%-10s%-14s\n","1","2","3");
		System.out.print("------------------------\n");
		for (int i=0; i<21; i++) 
		{
			System.out.format("%-10s",deck[i]);
			if (i==2 || i==5|| i==8|| i==11 || i==14
					|| i==17)
				System.out.print("\n");
			
		}
	}

	public static String[] arrangeDeck(String[] deck,int choice) {
		String[] arrangedDeck=new String[21];
		int i=0;
		switch(choice) 
		{
		case 1:
			i=2;
			while (i<21)
			{
				for (int z=0; z<7;z++)
				{
					arrangedDeck[z]=deck[i];
				
				i+=3;
				}
			}
		i=0;
		while (i<21)
		{
			for (int z=0; z<7;z++)
			{
				arrangedDeck[z+7]=deck[i];
			
			i+=3;
			}
		}
		i=1;
		while (i<21)
		{
			for (int z=0; z<7;z++)
			{
				arrangedDeck[z+7+7]=deck[i];
			
			i+=3;
			}
		}
		break;
		
		case 2:
		
			i=0;
			while (i<21)
			{
				for (int z=0; z<7;z++)
				{
					arrangedDeck[z]=deck[i];
				
				i+=3;
				}
			}
		i=1;
		while (i<21)
		{
			for (int z=0; z<7;z++)
			{
				arrangedDeck[z+7]=deck[i];
			
			i+=3;
			}
		}
		i=2;
		while (i<21)
		{
			for (int z=0; z<7;z++)
			{
				arrangedDeck[z+7+7]=deck[i];
			
			i+=3;
			}
		}
		break;
		
		case 3:
		
			i=1;
			while (i<21)
			{
				for (int z=0; z<7;z++)
				{
					arrangedDeck[z]=deck[i];
				
				i+=3;
				}
			}
		i=2;
		while (i<21)
		{
			for (int z=0; z<7;z++)
			{
				arrangedDeck[z+7]=deck[i];
			
			i+=3;
			}
		}
		i=0;
		while (i<21)
		{
			for (int z=0; z<7;z++)
			{
				arrangedDeck[z+7+7]=deck[i];
			
			i+=3;
			}
		}
		break;
		
		}
		
		return arrangedDeck;
		
	}
	
	public static void findTheCard(String[] deck,int choice) {
		switch(choice) 
		{
		case 1:
			System.out.print("Your card was "+deck[9]+"!");
			break;
		case 2:
			System.out.print("Your card was "+deck[10]+"!");
			break;
		case 3:
			System.out.print("Your card was "+deck[11]+"!");
			break;
		}
		
	}
	
public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		
		
		String[] wholedeck= {"A\u2663","K\u2663","Q\u2663","J\u2663","10\u2663","9\u2663","8\u2663","7\u2663","6\u2663","5\u2663","4\u2663","3\u2663","2\u2663",
				"A\u2660","K\u2660","Q\u2660","J\u2660","10\u2660","9\u2660","8\u2660","7\u2660","6\u2660","5\u2660","4\u2660","3\u2660","2\u2660",
				"A\u2666","K\u2666","Q\u2666","J\u2666","10\u2666","9\u2666","8\u2666","7\u2666","6\u2666","5\u2666","4\u2666","3\u2666","2\u2666",
				"A\u2665","K\u2665","Q\u2665","J\u2665","10\u2665","9\u2665","8\u2665","7\u2665","6\u2665","5\u2665","4\u2665","3\u2665","2\u2665"};
			String [] deck1=new String[21];
			String [] deck2=new String[21];
			String [] deck3=new String[21];
			Shuffle(wholedeck);
						deck1=pick21(wholedeck);
						displayList_str(deck1);
						System.out.print("\nChoose a card with your eye and hit enter!\n");
						inp.nextLine();
		showDeckToUser(deck1);
		System.out.print("\n\nChoose which column your card is in(1/3): ");
		int choice1=inp.nextInt();
				deck2=arrangeDeck(deck1,choice1);
		showDeckToUser(deck2);
		System.out.print("\n\nChoose which column your card is in(2/3): ");
		int choice2=inp.nextInt();
				deck3=arrangeDeck(deck2,choice2);
		showDeckToUser(deck3);	
		System.out.print("\n\nChoose which column your card is in(3/3): ");		
		int choice3=inp.nextInt();
		System.out.print("\nI found you card! Hit enter to see my guess!");
		inp.nextLine();
		inp.nextLine();
		findTheCard(deck3,choice3);
		
		inp.close();		
	}

}
