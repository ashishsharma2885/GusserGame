
import java.util.Scanner;

class Guesser
{
    int guessNum;
   int guessingNumber()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Guesser Kindly guess the number");
        guessNum= scan.nextInt();
        return guessNum;
    }
}
 class player
 {
   int guessNum;
  int guessingNumber()
   {
      Scanner scan=new Scanner(System.in);
      System.out.println("Player! Kindly guess the number");
      guessNum=scan.nextInt();
      return guessNum;
   }
 }
class Umpire
{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

   void collectNumGuesser()
    {
      Guesser g=new Guesser();
      numFromGuesser=g.guessingNumber();
    }
    void collectNumFromPlayers()
    {
      player p1=new player();
      player p2=new player();
      player p3=new player();
      numFromPlayer1=p1.guessingNumber();
      numFromPlayer2=p2.guessingNumber();
      numFromPlayer3=p3.guessingNumber();
      
    }
   void compare()
    {
if(numFromGuesser==numFromPlayer1)
{
  if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
  {
      System.out.println("Sab ney sahi answer diya! Sab winner hain bhai");
  }
  else if(numFromGuesser==numFromPlayer2)
  {
    System.out.println("Player 1 aur Player 2 jeet gaye");
  }
  else if(numFromGuesser==numFromPlayer3)
  {
    System.out.println("Player 1 aur Player 3 jeet gaye");
  }
  else
  {
    System.out.println("player1 won the game");
  }
  System.out.println("player1 won the game");
}
    else if(numFromGuesser==numFromPlayer2)
    {
      if(numFromGuesser==numFromPlayer3)
      {
        System.out.println("Player 2 aur player 3 jeet gaye");
      }
      else
      {
        System.out.println("Player2 won the game");
      }
      System.out.println("Player2 won the game");
    }
    else if(numFromGuesser==numFromPlayer3)
    {
      System.out.println("Player 3 won the game");
    }
    else
    {
       System.out.println("Sab ka sab ghalat hain. App game hargaye");
    }
}

}

 public class Launch1Game 
{
  public static void main(String[] args)
  {
    System.out.println("Game started");
    Umpire u=new Umpire();
    u.collectNumGuesser();
    u.collectNumFromPlayers();
    u.compare();
  }
}
