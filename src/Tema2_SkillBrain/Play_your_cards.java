package Tema2_SkillBrain;

import static java.lang.System.out;

public class Play_your_cards {

    public static int  parseCard(String card) {

        switch (card) {
            case "ace":
                return 11;
            case "two":
                return 2;
            case "three":
                return 3;
            case "four":
                return 4;
            case "five":
                return 5;
            case "six":
                return 6;
            case "seven":
                return 7;
            case "eight":
                return 8;
            case "nine":
                return 9;
            case "ten":
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return 0;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        return parseCard(card1)+parseCard(card2)==21;

    }

    public String largeHand(boolean isBlackjack, int dealerScore,String card1, String card2) {
        if (parseCard(card1)+parseCard(card1)==22) return ("P");
        if((dealerScore<10)&&(isBlackjack(card1,card2)==true)) return ("W");
        else return ("S");
    }

    public String smallHand(int handScore, int dealerScore) {
        if(handScore<=11) return ("H");
        if(handScore>=17) return ("S");
        if(handScore>=12&&handScore<=16)
        {
            if(dealerScore>=7)return ("H");
            else return ("S");
        }
        return null;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore,card1,card2);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }

    public static void main(String[] args) {
        Play_your_cards joc = new Play_your_cards();

        out.println("Decizie recomandata: "+joc.firstTurn("five","ten","eight"));


    }
}

