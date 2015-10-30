import kareltherobot.*; 

public class LabDriver implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setTrace(true);
        World.setVisible(true);
        World.setDelay(8);
        World.readWorld("treasureWorld.kwld");
        TreasureHunter walk1=new TreasureHunter(2, 2, North, 0); 
        walk1.work();

    }
}