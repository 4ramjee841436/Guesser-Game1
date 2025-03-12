package PW_COURSE.java;
import java.util.Scanner;
class Guesser
{
    int GuesserNum;
    public int GuessNum()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Guesser Guess your number ");
        GuesserNum=sc.nextInt(); return GuesserNum;
    }
}
class Player
{
    int PlayerNum;
    public int GuessNum()
    {
        Scanner sc= new Scanner(System.in);

        PlayerNum=sc.nextInt();
        return PlayerNum;
    }
}
class Umpire{
    int GuesserNum1;
    int PlayerNum1;
    int PlayerNum2;
    int PlayerNum3;
    public void collectNumFromGuesser(){
        Guesser G= new Guesser();
        GuesserNum1=G.GuessNum();
    }
    public void collectNumFromPlayers()
    {
        Player p1=new Player();
        System.out.println("Player1 Guess your number ");
        PlayerNum1=p1.GuessNum();
        System.out.println("Player2 Guess your number ");
        Player p2=new Player();
        PlayerNum2=p1.GuessNum();
        System.out.println("Player3 Guess your number ");
        Player p3=new Player();
        PlayerNum3=p1.GuessNum();
    }
    void compare()
    {
        if(GuesserNum1==PlayerNum1)
        {
            if(GuesserNum1==PlayerNum2 && GuesserNum1== PlayerNum3)
            {
                System.out.println("All Players Won the Game!");
            }
            else if(GuesserNum1==PlayerNum2)
            {
                System.out.println("Player1  a nd Player2 Won the Game!");
            }
            else if(GuesserNum1==PlayerNum3)
            {
                System.out.println("Player1  a nd Player3 Won the Game!");
            }
            else {
                System.out.println("Player2 Won the Game!");
            }
        }
        else if(GuesserNum1==PlayerNum2)
        {
            if(GuesserNum1==PlayerNum3)
            {
                System.out.println("Player2 and Player3 Won the Game!");
            }
            else{
                System.out.println("Player2 Won the Game!");
            }
        }
        else if(GuesserNum1==PlayerNum3)
        {
            System.out.println("Only Player3 Won the Game!");
        }
        else {
            System.out.println("All Player Lost the Game!");
        }
    }
}
public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("<---------- START GAME----------->");
        Umpire u= new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
        System.out.println("<---------------- GAME OVER--------------->");

    }
}
