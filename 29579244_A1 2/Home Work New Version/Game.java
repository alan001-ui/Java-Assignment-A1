import java.util.*;
/**
 * This class is for player to guess card.
 *
 * @author Shiyang Nie
 * @version 2020.05.08
 */
public class Game
{
    // a field for getting player object.
    private Player cardGamePlayer;
    // a filed for getting randomNumber.
    private RandomNumber randomNumer;
    // a field for getting card obeject.
    private Card card;
    // a filed for storing highestScore.
    private int highestScore;

    /**
     *  default constructor for game class.
     */
    public Game()
    {
        cardGamePlayer = new Player();
        randomNumer = new RandomNumber();
        card = new Card();
        highestScore = 0;
    }

    /**
     *  non-default constructor for game class.
     */
    public Game(Player cardGamePlayer,RandomNumber randomNumer,Card card,int highestScore)
    {
        this.cardGamePlayer = cardGamePlayer;
        this.randomNumer = randomNumer;
        this.card = card;
        this.highestScore = highestScore;
    }

    /**
     *  return player object.
     */
    public Player getCardGamePlayer()
    {
        return cardGamePlayer;
    }

    /**
     *  set up a player
     */
    public void setCardGamePlayer(Player player)
    {
        this.cardGamePlayer = player;
    }
    
    /**
     *  return randomNumber.
     */
    public RandomNumber getRandomNumer()
    {
        return randomNumer;
    }

    /**
     * set up a randomNumber.
     */
    public void setRandomNumer(RandomNumber randomNumber)
    {
        this.randomNumer = randomNumer;
    }
    
    /**
     *  return card obeject.
     */
    public Card getCard()
    {
        return card;
    }

    /**
     * set up a card.
     */
    public void setCard(Card card)
    {
        this.card = card;
    }
    
    /**
     *  receive the highestScore.
     */
    public void setHighestScore(int score)
    {
        highestScore = score;
    }

    /**
     *  return highestScore.
     */
    public int getHighestScore()
    {
        return highestScore;
    }

    /**
     *  Computer generates suit and number for a card randomly.
     */
    public void computerGenerate()
    {
        RandomNumber randomNumer = new RandomNumber(4);
        int a = randomNumer.generateRandomNumber(4);
        int b = randomNumer.generateRandomNumber(13);
        card.setSuit(a);
        card.setNumber(b);
    }

    /**
     *  Give a player clue to print their name.
     */
    public void welcomeMessage()
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("Wecome to this game.Please enter your name: ");
        String playerName = input.nextLine().trim();

        while(!playerName.chars().allMatch(Character::isLetter))
        {
            System.out.println("Please, just enter only alphabetic characters");
            playerName = input.nextLine().trim();
        }
        cardGamePlayer.setName(playerName);
        System.out.println("your name is: " + playerName);
        System.out.println("your beginning score is 40 ");
        System.out.println();
    }

    /**
     *  player starts to guess suit of a card.
     *  if player guess wrong, the socre will be deduct, until his guess is right or wasted all chances.
     */
    public void playGuessSuit()
    {
        Scanner input = new Scanner(System.in);
        cardGamePlayer.setScore(40);
        int userScore = cardGamePlayer.getScore();
        System.out.println("Please enter your choice of suit(H for Hearts, D for Diamonds,C for Clubs,S for Spades): " );
        char l = input.nextLine().toUpperCase().charAt(0);
        int result = 0;

        while (l != 'D' && l != 'H' && l != 'C' && l != 'S')
        {
            System.out.println();
            System.out.println("Invaid Choice " );
            System.out.println("Please enter your choice of suit,again (H for Hearts, D for Diamonds,C for Clubs,S for Spades): " );
            l = input.nextLine().toUpperCase().charAt(0);
        }
        switch (l)
        {
            case'H': result = 1;break;
            case'D': result = 2;break;
            case'C': result = 3;break;
            case'S': result = 4;break;
            default: result = 0;break;
        }
        cardGamePlayer.setGuess(result);
        if (cardGamePlayer.getGuess() == card.getSuit())
        {
            System.out.println("Congrulation! Your guess is right, we will go to next stage!");
            System.out.println("The corret suit: " + card.showSuit());
        }
        else
        {
            userScore = userScore - 5;
            cardGamePlayer.setScore(userScore);
            System.out.println("Wrong choice,Please enter choice,again" );
            System.out.println("Please enter your choice of suit(H for Hearts, D for Diamonds,C for Clubs,S for Spades):");
            char ll = input.nextLine().toUpperCase().charAt(0);

            while (ll != 'D' && ll != 'H' && ll != 'C' && ll != 'S')
            {
                System.out.println();
                System.out.println("Invaid Choice" );
                System.out.println("Please enter your choice of suit,again (H for Hearts, D for Diamonds,C for Clubs,S for Spades): " );
                ll = input.nextLine().toUpperCase().charAt(0);
            }
            switch (ll)
            {
                case'H': result = 1;break;
                case'D': result = 2;break;
                case'C': result = 3;break;
                case'S': result = 4;break;
                default: result = 0;break;
            }
            cardGamePlayer.setGuess(result);
            if (cardGamePlayer.getGuess() == card.getSuit())
            {
                System.out.println("Congrulation! Your guess is right, we will go to next stage!");
                System.out.println("The corret suit: " + card.showSuit());
            }
            else
            {
                userScore = userScore - 10;
                cardGamePlayer.setScore(userScore);
                System.out.println("Wrong choice,Please enter choice,again" );
                System.out.println("You have alrealy wasted two chances, and this one is your last chance,enter your choice.");
                char lll = input.nextLine().toUpperCase().charAt(0);

                while (lll != 'D' && lll != 'H' && lll != 'C' && lll != 'S')
                {
                    System.out.println();
                    System.out.println("Invaid Choice " );
                    System.out.println("Please enter your choice of suit,again (H for Hearts, D for Diamonds,C for Clubs,S for Spades): " );
                    lll = input.nextLine().toUpperCase().charAt(0);
                }
                switch (lll)
                {
                    case'H': result = 1;break;
                    case'D': result = 2;break;
                    case'C': result = 3;break;
                    case'S': result = 4;break;
                    default: result = 0;break;
                }
                cardGamePlayer.setGuess(result);
                if (cardGamePlayer.getGuess() == card.getSuit())
                {
                    System.out.println("Congrulation! Your guess is right, we will go to next stage!");
                    System.out.println("The corret suit: " + card.showSuit());
                }
                else
                {
                    userScore = userScore - 15;
                    cardGamePlayer.setScore(userScore);
                    System.out.println("Your guess is still not correct, and we will go to next stage");
                    System.out.println("The corret suit: " + card.showSuit());
                }
            }
            System.out.println("Your current score is: " + userScore);
            cardGamePlayer.setScore(userScore);
            System.out.println();
        }
    }

    /**
     *  player starts to guess number of a card.
     *  game will be end afer correct guess or score is less than or equal 0, or wasted all chances.
     */
    public void playGuessNumber()
    {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.println();
            System.out.println("Please enter your guess Card Number(between 1-13): " );
            String sc = input.next();
            int a = 0;

            try
            {
                a = Integer.parseInt(sc);

                while (a < 1 || a > 13)
                {
                    System.out.println();
                    System.out.println("Please enter correct choice " );
                    System.out.println("Please enter your guess Card Number(between 1-13): ");
                    a = input.nextInt();
                }
                cardGamePlayer.setGuess(a);
                break;
            }
            catch (NumberFormatException ne)
            {
                System.out.println("This is not a number, try again");
            }
        }
        int currentScore = cardGamePlayer.getScore();
        int b = card.getNumber();
        if(b == cardGamePlayer.getGuess())
        {
            System.out.println("Congrulation! Your guess is right, and you win the game!");
            System.out.println("You get score is: " + currentScore);
            System.out.println("The correct card number is: " + b);
        }
        else
        {
            currentScore = currentScore - 2;
            cardGamePlayer.setScore(currentScore);
            if (b > cardGamePlayer.getGuess())
            {
                System.out.println("Your guess is less than the correct number");
            }
            else
            {
                System.out.println("Your guess is greater than the correct number");
            }
            System.out.println("Your answer is wrong, enter your choice again(between 1-13):");
            while (true)
            {
                String sc = input.next();
                int aa = 0;

                try
                {
                    aa = Integer.parseInt(sc);

                    while (aa < 1 || aa > 13)
                    {
                        System.out.println();
                        System.out.println("Please enter correct choice " );
                        System.out.println("Please enter your guess Card Number(between 1-13): ");
                        aa = input.nextInt();
                    }
                    cardGamePlayer.setGuess(aa);
                    break;
                }
                catch (NumberFormatException ne)
                {
                    System.out.println("This is not a number, try again");
                }
            }
            if (b == cardGamePlayer.getGuess())
            {
                System.out.println("Congrulation! Your guess is right, and you win the game!");
                System.out.println("You get score is: " + currentScore);
                System.out.println("The correct card number is: " + b);
            }
            else
            {
                currentScore = currentScore - 6;
                cardGamePlayer.setScore(currentScore);
                if (b > cardGamePlayer.getGuess())
                {
                    System.out.println("Your guess is less than the correct number");
                }
                else
                {
                    System.out.println("Your guess is greater than the correct number");
                }
                System.out.println("Your answer is wrong, enter your choice again(between 1-13):");
                while (true)
                {
                    String sc = input.next();
                    int aaa = 0;

                    try
                    {
                        aaa = Integer.parseInt(sc);

                        while (aaa < 1 || aaa > 13)
                        {
                            System.out.println();
                            System.out.println("Please enter correct choice " );
                            System.out.println("Please enter your guess Card Number(between 1-13): ");
                            aaa = input.nextInt();
                        }
                        cardGamePlayer.setGuess(aaa);
                        break;
                    }
                    catch (NumberFormatException ne)
                    {
                        System.out.println("This is not a number, try again");
                    }
                }
                if (b == cardGamePlayer.getGuess())
                {
                    System.out.println("Congrulation! Your guess is right, and you win the game!");
                    System.out.println("You get score is: " + currentScore);
                    System.out.println("The correct card number is: " + b);
                }
                else 
                {
                    currentScore = currentScore - 12;
                    cardGamePlayer.setScore(currentScore);
                    if(currentScore > 0 )
                    {
                        if(b > cardGamePlayer.getGuess())
                        {
                            System.out.println("Your last guess is less than the correct number");
                        }
                        else
                        {
                            System.out.println("Your last guess is greater than the correct number");
                        }
                        System.out.println("Enter your choice again(between 1-13):");
                        while (true)
                        {
                            String sc = input.next();
                            int aaaa = 0;

                            try
                            {
                                aaaa = Integer.parseInt(sc);

                                while (aaaa < 1 || aaaa > 13)
                                {
                                    System.out.println();
                                    System.out.println("Please enter correct choice " );
                                    System.out.println("Please enter your guess Card Number(between 1-13): ");
                                    aaaa = input.nextInt();
                                }
                                cardGamePlayer.setGuess(aaaa);
                                break;
                            }
                            catch (NumberFormatException ne)
                            {
                                System.out.println("This is not a number, try again");
                            }
                        }
                        if(b == cardGamePlayer.getGuess())
                        {
                            System.out.println("Congrulation! Your guess is right, and you win the game!");
                            System.out.println("You get score is: " + currentScore);
                            System.out.println("The correct card number is: " + b);
                        }
                        else
                        {
                            currentScore = currentScore - 20;
                            cardGamePlayer.setScore(currentScore);
                            System.out.println("Your game is over, because your four chances are done");
                            System.out.println("You get score is: " + currentScore);
                            System.out.println("The correct card number is: " + b);
                        }
                    }
                    else 
                    {
                        System.out.println("Your game is over, because your socore is less than or equal zero");
                        System.out.println("Your score is: " + currentScore);
                        System.out.println("The correct card number is: " + b);
                    }
                    System.out.println();
                    cardGamePlayer.setScore(currentScore);
                    System.out.println("Player's name: " + cardGamePlayer.getName());
                    System.out.println("This Suit Is:  " + card.showSuit());
                    System.out.println("This Number Is:  " + card. getNumber());
                    System.out.println("The Score Is:  " + currentScore);
                }
            }
        }
    }  

    /**
     *  get player highestScore.
     */
    public void setHighestScore()
    {
        int score = cardGamePlayer.getScore();

        if (score > highestScore)
        {
            highestScore = score;
        }
        cardGamePlayer.setHighestScore(highestScore);
    }

    /**
     *  player will win when the score is greater 0 and guess the correct card nunmber.
     */
    public int winNumberOfGame()
    {
        int score = cardGamePlayer.getScore();
        int numberOfGamesWon = cardGamePlayer.getNumberOfGamesWon();
        int a = cardGamePlayer.getGuess();
        int b = card.getNumber();

        if (score > 0 && b == a)
        {
            numberOfGamesWon++;
            cardGamePlayer.setNumberOfGamesWon(numberOfGamesWon);
        }
        return cardGamePlayer.getNumberOfGamesWon();
    }

    /**
     *  Ask player if he wants to continue game or not.
     */
    public void askContinueGame()
    {
        System.out.println();
        System.out.println("Do you want to continue another game? Enter Yes/No");
        Scanner input = new Scanner(System.in);
        String userAnwser = input.nextLine();
        int numberOfGames = cardGamePlayer.getNumberOfGmaePlayed();

        while (userAnwser.charAt(0) == 'y' || userAnwser.charAt(0) == 'Y')
        {
            System.out.println();
            numberOfGames++;
            cardGamePlayer.setNumberOfGmaePlayed(numberOfGames);
            computerGenerate();
            playGuessSuit();
            playGuessNumber();
            setHighestScore();
            winNumberOfGame();
            System.out.println();
            System.out.println("Do you want to continue another game? Enter Yes/No");
            userAnwser = input.nextLine();
            System.out.println();
        }
        setHighestScore();
        System.out.println("Player's name: " + cardGamePlayer.getName());
        System.out.println("The highest game score achieved: " + cardGamePlayer.getHighestScore());
        System.out.println("The total number of games played: " + cardGamePlayer.getNumberOfGmaePlayed());
        System.out.println("The total number of games won: " + cardGamePlayer.getNumberOfGamesWon());
    }

    /**
     *  start a game.
     */
    public void startGame()
    {
        computerGenerate();
        welcomeMessage();
        playGuessSuit();
        playGuessNumber();
        setHighestScore();
        winNumberOfGame();
        askContinueGame();
    }
}