/**
 * Generate random from 1 to max.
 *
 * @author Shiyang Nie
 * @version 2020.05.07
 */
public class RandomNumber
{
    // randomnumber maximumValue.
    private int maximumValue;

    /**
     * default constructor for obejects of class randomNumber.
     */
    public RandomNumber()
    {
        maximumValue = 8;
    }

    /**
     * non-default constructor for obejects of class randomNumber.
     */
    public RandomNumber(int maximumValue)
    {
        this.maximumValue = maximumValue;
    }

    /**
     * return random number maximumValue.
     */
    public int getMaximumValue()
    {
        return maximumValue;
    }

    /**
     * receive random number maximumValue.
     */
    public void setMaximumValue(int maximumValue)
    {
        this.maximumValue = maximumValue;
    }

    /**
     * generate number range from 1 to maximumValue.
     */
    public int generateRandomNumber(int maximumValue)
    {
        return 1 + (int)(Math.random() * maximumValue);
    }

}