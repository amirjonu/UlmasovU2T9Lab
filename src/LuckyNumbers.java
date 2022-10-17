public class LuckyNumbers
{
    /* No instance variables */

    /* "empty" constructor with no parameters */
    public LuckyNumbers() { }

    public int randomIntegerBetween(int min, int max) {
        return (int)(Math.random()* max-min+1)+min;
    }

    public String getLuckyNumbers() {
       return "Your Lucky Numbers are: " + randomIntegerBetween(1, 65)+" " + randomIntegerBetween(1, 65)+" "+randomIntegerBetween(1, 65)+" "+randomIntegerBetween(1, 65)+" "+randomIntegerBetween(1, 65)+" \n"+"The super ball is: "+ randomIntegerBetween(1, 30);
    }
}

