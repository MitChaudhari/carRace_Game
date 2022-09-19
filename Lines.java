import greenfoot.*; 
public class Lines extends Actor
{
    public void act() 
    {
        The_Road road = (The_Road) getWorld();
        setLocation(getX(), getY()+road.getSpeed());
        if(getY()>=599)
        {
            setLocation(195, 0);  
            road.addMts();
        }      
    }    
}
