import kareltherobot.*;

/**
 * Write a description of class TreasureHunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureHunter extends Robot implements Directions
{  
    private int d;

    public TreasureHunter(int street, int avenue, Direction dir, int beeps)
    {
        super(street, avenue, dir, beeps);
    }

    public void work()
    {
        while(!nextToABeeper())
        {
            move();
        }

        if(nextToABeeper())
        {
            countBeepers();
            moveToNextClue();
            work();
        }
    }

    public void turnRight()
    {
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public int countBeepers()
    {
        d=0;
        while(nextToABeeper()) {
            pickBeeper();
            d++;
        }
        return d;
    }

    public void moveToNextClue()
    {
        if (d==1)
        {
            faceNorth();
        }

        if (d==2)
        {
            faceWest();
        }

        if (d==3)
        {
            faceSouth();
        }

        if (d==4)
        {
            faceEast();
        }

        if (d==5)
        {
            turnOff();
        }
    }

    private void faceNorth()
    {
        while (!facingNorth())
        turnLeft();
    }

    private void faceSouth()
    {
        while (!facingSouth()) 
        turnLeft();
    }
    
    private void faceEast()
    {
        while (!facingEast())
        turnLeft();
    }
    
    private void faceWest()
    {
        while (!facingWest())
        turnLeft();
    }
}
