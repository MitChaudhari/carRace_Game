import greenfoot.*;  

public class Fuel extends Actor
{
    public void act() 
    {
        moveTraffic();
    }

    private void moveTraffic(){
        The_Road road = (The_Road) getWorld();
        setLocation(getX(), getY()+road.getSpeed());
        if(getY()>=599)
        {
            getWorld().removeObject(this); 
        }else if(isTouching(Fuel.class)){
            getWorld().removeObject(this);   
        }
    }
}
