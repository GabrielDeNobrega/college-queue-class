package application;

import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.Scanner;

import model.entities.Game;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Queue<Game> games = new LinkedList<>();

		// creates three different types of games

		Game game1 = new Game("Bioshock", 60.0);
		Game game2 = new Game("LEGO Star Wars", 100.0);
		Game game3 = new Game("Minecraft", 45.0);

		// fills the queue with games (First In - First Out)

		games.add(game1);
		games.add(game2);
		games.add(game3);

		// prints the queue as it was created above

		System.out.println(games);

		// returns first inserted item of the queue without removing it

		System.out.println();
		System.out.println(games.peek());
		System.out.println(games);

		// returns and removes the first inserted item of the queue

		System.out.println();
		System.out.println(games.poll());
		System.out.println(games);

		// checks if a certain item exists in the queue

		System.out.println();
		System.out.println("Does it contain " + game3 + "? " + games.contains(game3));
		System.out.println("Does it contain " + game1 + "? " + games.contains(game1));

		// checks if the queue is empty or not

		System.out.println();
		System.out.println("Is the queue empty? " + games.isEmpty());

		// returns an element from the queue using its index

		try {

			System.out.println();
			System.out.print("Which index do you want to search for? ");
			int index = sc.nextInt();
			System.out.println("The element on index [" + index + "] is " + games.toArray()[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("This index does not exist on the queue.");
		}

		// returns the size of the queue

		System.out.println();
		System.out.println("The number of elements in the queue is: " + games.size());

		// deletes all the elements of a queue

		System.out.println();
		games.clear();
		System.out.println("Is the queue empty? " + games.isEmpty());
		System.out.println("Current queue elements: " + games);

		sc.close();
	}

}