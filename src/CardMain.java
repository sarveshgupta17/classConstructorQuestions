import java.util.Scanner;
import Cards.Card;
public class CardMain {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Card obj =new Card(1,"Diamonds");
        System.out.println("the current card rank is="+obj.getRank());
        System.out.println("the current card suit is="+obj.getSuit());
        //updating the values
        int rank1;
        System.out.println("enter the value of update rank ");
        rank1=sc.nextInt();
        System.out.println("enter the value of update suit");
        String suit1=new String(sc.next());
        obj.setRank(rank1);
        obj.setSuit(suit1);
        System.out.println("the updated rank is"+obj.getRank());
        System.out.println("the updated suit is="+obj.getSuit());



    }

}
