public class Player {
    private String PlayerName;
    private int PlayerId;
    private int PlayerScore=0;
    public int gesture;

    public Player(String name,int id){
        this.PlayerId=id;
        this.PlayerName=name;
    }

    public int showGesture(){
        // generate a random number between [0-6]
        int max = 6;
        int min = 0;
        gesture = (int) ((Math.random() * (max - min)) + min);
        return gesture;
    }

    public void setScore(int score){
        PlayerScore = PlayerScore + score;
    }

    public int getScore(){
        return PlayerScore;
    }
}
