package problem_1;

public class PairOfDice
{
    private Die dieOne, dieTwo;

    public PairOfDice()
    {
        dieOne = new Die();
        dieTwo = new Die();
    }

    public int getDieOneValue()
    {
        return dieOne.getFaceValue();
    }

    public int getDieTwoValue()
    {
        return dieTwo.getFaceValue();
    }

    public void setDieOneValue(int value)
    {
        dieOne.setFaceValue(cleanValue(value));
    }

    public void setDieTwoValue(int value)
    {
        dieTwo.setFaceValue(cleanValue(value));
    }

    public void roll()
    {
        dieOne.roll();
        dieTwo.roll();
    }

    public int sum()
    {
        return getDieOneValue() + getDieTwoValue();
    }

    private int cleanValue(int value)
    {
        return value > 6 ? 6 : value < 1 ? 1 : value;
    }
}
