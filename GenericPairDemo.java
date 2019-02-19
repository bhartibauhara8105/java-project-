package com.javaTraining;
import java.util.Scanner;;
public class GenericPairDemo {

	public static void main(String[] args) {
		Pair<String> secretPair=new Pair<String>("Happy","Day");
		Scanner keyboard = new Scanner(System.in);
		String word1=keyboard.next();
		String word2=keyboard.next();
		Pair<String> inputpair=new Pair<String>(word1,word2);
		Pair<Integer> secretPair1=new Pair<Integer>(10,20);
		secretPair1.display();
		if(inputpair.equals(secretPair))
		{
			System.out.println("you guessed the secret words");
			System.out.println("in correct order");
		}
		else
		{
			System.out.println("you guessed incorrectly");
			System.out.println("you guessed:");
			System.out.println(inputpair);
			System.out.println("the secret words are:");
			System.out.println(secretPair);
		}
	}

}
