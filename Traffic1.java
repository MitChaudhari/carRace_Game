import greenfoot.*; 

public class Traffic1 extends Actor
{
    public void act() 
    {
        moveTraffic1();     
    }

    private void moveTraffic1(){
        The_Road road = (The_Road) getWorld();
        setLocation(getX(), getY() +road.getSpeed());
        if(getY()>=599)
        {
            getWorld().removeObject(this); 
            road.addScore(1);
        }else if(isTouching(Traffic1.class)){
            getWorld().removeObject(this);   
        }
    }
}
