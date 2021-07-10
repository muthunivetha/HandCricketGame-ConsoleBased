import java.util.Scanner;

public class HandCricketGame {

    public static void takeBattingDecision(Player Batsman,Player Bowler){
        int NoOfThrows = 0;
        while(NoOfThrows <= 6){
            Batsman.showGesture();
            Bowler.showGesture();

            System.out.println(Batsman.gesture+"---Batsman.gesture--");
            System.out.println(Bowler.gesture+"---Bowler.gesture--");

            if(Batsman.gesture != Bowler.gesture){
                Batsman.setScore(Batsman.gesture);
                NoOfThrows++;
                continue;
            }
            break;
        }
        System.out.println(Batsman.getScore()+"---playscore");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player A = new Player("Nivetha",1120);
        Player B = new Player("ParkHyungSik",1170);
        System.out.println("Who bats first?");
        System.out.println("1) Player A");
        System.out.println("2) PLayer B");

        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("***Player A is batting***");
            takeBattingDecision(A,B);
            System.out.println("***Player B is batting***");
            takeBattingDecision(B,A);
        }

        if(choice == 2){
            System.out.println("***Player B is batting***");
            takeBattingDecision(B,A);
            System.out.println("***Player A is batting***");
            takeBattingDecision(A,B);
        }

        if(A.getScore() > B.getScore()){
            System.out.println("Player A wins with score "+A.getScore());
        }
        if(A.getScore() < B.getScore()){
            System.out.println("Player B wins with score "+B.getScore());
        }
        if(A.getScore() == B.getScore()){
            System.out.println("Its a Tie with score "+A.getScore());
        }

    }
}
