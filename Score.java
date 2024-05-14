public class Score{
    public static void main(String args[]){

displayHighScorePosition("Tim",calculateHighScorePosition(1500));
displayHighScorePosition("miya",calculateHighScorePosition(1000));
displayHighScorePosition("meena",calculateHighScorePosition(500));
displayHighScorePosition("jiya",calculateHighScorePosition(100));
displayHighScorePosition("riya",calculateHighScorePosition(25));
    }
    public static void displayHighScorePosition(String name,int high_score){
        System.out.println(name+" managed to get into position "+high_score+" on the high score list");
    }
    public static int calculateHighScorePosition(int score){
        int position = 4;
        if(score>=1000){
            position = 1;
        }
        else if(score>=500 ){
            position = 2;
        }
        else if(score>=100 ){
            position = 3;
        }
        return position;
    }
}