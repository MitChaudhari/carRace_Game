import greenfoot.*; 

public class Traffic extends Actor
{
    public void act() 
    {
        moveTraffic();     
    }

    private void moveTraffic(){
        The_Road road =(The_Road) getWorld();
        setLocation(getX(), getY()+road.getSpeed());
        if(getY()>=599)
        {
            getWorld().removeObject(this); 
            road.addScore(1);
        }else if(isTouching(Traffic.class)){
            getWorld().removeObject(this);   
        }
    }
}
