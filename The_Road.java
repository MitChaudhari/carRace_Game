import greenfoot.*; 
/**
 * Write a description of class The_Road  here.
 * This class is the foudation of the game. Its the setup and communation 
 * @author (Mitansh CHaudhari) 
 * @version (1/15/20)
 */ 
public class The_Road extends World
{ 
    int speed = 1;
    int mi_h = 10;
    int score = 0;
    int mi=0;
    int m=0;
    GreenfootSound rum = new GreenfootSound("rum.wav");
    GreenfootSound music = new GreenfootSound("music.wav"); 
    boolean fuel=false;
    int countFuel=0;

    public The_Road()
    {    
        super(400, 600, 1); 
        setup();
        displayScore();
        displayMi();
        displaySPEED();
        addFuel();
    }    

    public void started(){
        rum.playLoop();  
        music.playLoop();
    }

    public void stopped(){
        rum.stop();
        music.stop();
    }

    public void act()
    {
        addTraffic();
        addTraffic1();
        addFuel();
        checkEP();
        displaySPEED();
    }

    private void setup(){
        addObject(new Lines(),195, 40);
        addObject(new Lines(),195, 140);
        addObject(new Lines(),195, 240);
        addObject(new Lines(),195, 340);
        addObject(new Lines(),195, 440);
        addObject(new Lines(),195, 540);
        addObject(new Car(),250,550);
    } 

    public void addMts(){
        m+=50;
        if(m==1000){
            m=0;
            mi++;
            displayMi();    
        }
    }

    public void countFuel(){
        countFuel++;    
    }

    private void checkEP(){
        if (countFuel==3){
            countFuel=0;
        }
    }

    public int getSpeed(){
        return speed;
    }

    public void addTraffic()
    {
        if(Greenfoot.getRandomNumber((11-getSpeed())*100)==1){
            addObject(new Traffic(),Greenfoot.getRandomNumber(160)+120,0);
        }
    }

    public void addTraffic1()
    {
        if(Greenfoot.getRandomNumber((11-getSpeed())*100)==1){
            addObject(new Traffic1(),Greenfoot.getRandomNumber(160)+120,0);
        }
    }

    private void displayScore(){
        showText("Score "+score, 45, 20);
    }

    public void addScore(int points){
        score=score+points;
        displayScore();  
    }

    private void displayMi(){
        showText("Mi "+mi, 45, 65);    
    }

    public void setFuel(boolean fuel){
        this.fuel=fuel;    
    }

    public boolean isFuel(){
        return fuel;    
    }

    private void addFuel(){
        if(Greenfoot.getRandomNumber(1000)==1){
            addObject(new Fuel(),Greenfoot.getRandomNumber(160)+120,0);    
        }
    }

    private void displaySPEED(){
        int SPEED=getSpeed() + mi +10;
        showText("SPEED ",350, 30); 
        showText(+SPEED+" Mi/h",350,60);
    }

}