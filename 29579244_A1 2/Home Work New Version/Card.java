/**
 * Store the details of Card,
 * such as the number, suit.
 * @author Shiyang Nie
 * @version 2020.05.07
 */
public class Card
{
    // The Card suit.
    private int suit;
    // The Card number
    private int number;

    /** 
     * Default Constructor for objects of class Card. 
     */
    public Card()
    {
        suit = 0;
        number = 2;
    }

    /**
     * Non-default constructor for objects of class card.
     */
    public Card(int suit, int number)
    {
        this.suit = suit;
        this.number = number;
    }

    /**
     * return the card suit
     */
    public int getSuit()
    {
        return suit; 
    }

    /**
     * receive the card suit
     */
    public void setSuit(int suit)
    {
        this.suit = suit;
    }

    /**
     * return card number
     */
    public int getNumber()
    {
        return number;
    }

    /**
     * receive card number
     */
    public void setNumber(int number)
    {
        this.number = number;
    }

    /**
     * show the hidden card suit
     */
    public String showSuit()
    {
        int a = getSuit();
        String result = "";

        switch(a)
        {
            case 1 : result = "Hearts";break;
            case 2 : result = "Diamonds";break;
            case 3 : result = "Clubs";break;
            case 4 : result = "Spades";break;
            default: result = "";break;
        }
        return result;
    }

    /**
     * display card state
     */
    public String displayCard()
    {
        String result = suit + "" + number;
        return result;
    }
}
