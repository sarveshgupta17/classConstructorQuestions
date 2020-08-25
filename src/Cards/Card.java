package Cards;

public class Card {
    private int rank;
    private String suit;

    //parameterised const.
    public Card(int r,String s){
        rank=r;
        suit=s;

    }
    //getter
    public int getRank(){
        return rank;
    }
    public String getSuit(){
        return suit;
    }
    public void setRank(int rank){
        this.rank=rank;
    }
    public void setSuit(String suit){
        this.suit=suit;
    }

}

