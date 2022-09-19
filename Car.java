import greenfoot.*; 
/**
 * Write a description of class Car  here.
 * This calss check the collision between car and Traffic and Traffic1 and if they crash, game will stop and display Gameover.
 * Also if car touches fuel, the points are add to main 
 * @author (Mitansh CHaudhari) 
 * @version (1/15/20)
 */ 
public class Car extends Actor
{ 
    The_Road road;
    GreenfootSound coin = new GreenfootSound("coin.wav");
    GreenfootSound crash = new GreenfootSound("crash.wav");
    public void act() 
    {   
        road = (The_Road) getWorld();
        moveCar();
        checkCollision();
        checkCollision1();
    }    

    private void checkCollision()
    {
        if(isTouching(Traffic.class)){
            if (road.isFuel()){
                removeTouching(Traffic.class) ;
                road.setFuel(false);
            }else{
                crash.play();
                World myWorld = getWorld();
                GameOver gameover = new GameOver ();
                myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
                Greenfoot.stop();   
            } 
        }else if(isTouching(Fuel.class)){
            removeTouching(Fuel.class);
            road.countFuel();
            if(road.isFuel()){
                road.addScore(3);
                coin.play();
            }else{
                road.setFuel(true); 
                road.addScore(1);
                coin.play();
            }
        }
    }

    private void moveCar(){
        if(Greenfoot.isKeyDown("right")
        && getX()<280){ 
            setLocation(getX()+road.getSpeed(),getY()); 
            setImage("PlayerCarRight.png"); 
        }else if(Greenfoot.isKeyDown("left") && getX()>120){
            setLocation(getX()-road.getSpeed(),getY());
            setImage("PlayerCarLeft.png");
        }else{setImage("PlayerCar.png");}
    }

    private void checkCollision1()
    {
        if(isTouching(Traffic1.class)){
            if (road.isFuel()){
                removeTouching(Traffic1.class) ;
                road.setFuel(false);
            }else{
                crash.play();
                World myWorld = getWorld();
                GameOver gameover = new GameOver ();
                myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
                Greenfoot.stop();   
            } 
        }else if(isTouching(Fuel.class)){
            removeTouching(Fuel.class);
            road.countFuel();
            if(road.isFuel()){
                road.addScore(3);
                coin.play();
            }else{
                road.setFuel(true); 
                road.addScore(1);
                coin.play();
            }
        }
    }
}