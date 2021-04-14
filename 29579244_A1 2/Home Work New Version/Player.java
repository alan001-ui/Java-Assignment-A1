/**
 * Store details of player's information
 * such as name, score, guess, highestScore,numberofgameplayed,numberofgameswon
 * @author Shiyang Nie
 * @version 2020.05.07
 */
public class Player
{
    // player name.
    private String name;
    // player score.
    private int score;
    // player last guess.
    private int guess;
    // player highestScore.
    private int highestScore;
    // player numberOfGamePlayed.
    private int numberOfGamePlayed;
    // player numberOfGamesWon.
    private int numberOfGamesWon;
    
    /**
     * default constructor for objects of player class.
     */
    public Player()
    {
        name = "Ben";
        score = 40;
        guess = 1;
        highestScore = 0;
        numberOfGamePlayed = 1;
        numberOfGamesWon = 0;
    }

    /**
     *  non-default constructor for objects of player class.
     */
    public Player(String name, int score,int guess,int highestScore,int numberOfGmaePlayed,int numberOfGamesWon)
    {
        this.name = name;
        this.score = score;
        this.guess = guess;
        this.highestScore = highestScore;
        this.numberOfGamePlayed = numberOfGmaePlayed;
        this.numberOfGamesWon = numberOfGamesWon;
    }

    /**
     * return player name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * receive player name.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * return player score.
     */
    public int getScore()
    {
        return score;
    }

    /**
     * receive player score.
     */
    public void setScore(int score)
    {
        this.score = score;
    }

    /**
     * return player last guess. 
     */
    public int getGuess()
    {
        return guess;
    }

    /**
     * receive player last guess.
     */
    public void setGuess(int guess)
    {
        this.guess = guess;
    }

    /**
     * receive player highestScore.
     */
    public void setHighestScore(int score)
    {
        highestScore = score;
    }

    /**
     * return player highestScore.
     */
    public int getHighestScore()
    {
        return highestScore;
    }
   
    /**
     *  return play numbers of game.
     */
    public int getNumberOfGmaePlayed()
    {
        return numberOfGamePlayed;
    }

    /**
     * receive play numbers of game.
     */
    public void setNumberOfGmaePlayed(int numberOfGmaePlayed)
    {
        this.numberOfGamePlayed = numberOfGmaePlayed;
    }

    /**
     *  return win numbers of game.
     */
    public int getNumberOfGamesWon()
    {
        return numberOfGamesWon;
    }

    /**
     * receive win numbers of game.
     */
    public void setNumberOfGamesWon(int numberOfGamesWon)
    {
        this.numberOfGamesWon = numberOfGamesWon;
    }

    /**
     * display player state.
     */
    public String displayPlayer()
    {
        String result = name + "" + score + "" + guess + "" + highestScore + "" + numberOfGamePlayed + "" + numberOfGamesWon;
        return result;
    }

    /**
     * show player information in the terminal.
     */
    public void displayState()
    {
        System.out.println("The Player information below: ");
        System.out.println("player name: " + name);
        System.out.println("the current game score: " + getScore());
        System.out.println("the last guess: " + guess);
        System.out.println("the highest game score achieved: " + getHighestScore());
        System.out.println("the total number of games played: " + getNumberOfGmaePlayed());
        System.out.println("the total number of games won: " + getNumberOfGamesWon());
    }

}

