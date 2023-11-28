// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class alien1 here.
 * @author (your name) @version (a version number or a date)
 */
public class alien1 extends Actor
{

    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/

    /**
     * Act - do whatever the alien1 wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Actor cow = getOneIntersectingObject(cow.class);
        if (cow != null) {
            World world = getWorld();
            world.removeObject(cow);
        }
        Actor bulllet = getOneIntersectingObject(bulllet.class);
        if (bulllet != null) {
            World forrest = getWorld();
            forrest.removeObject(bulllet);
        }
        moveAround();
    }

    /**
     * 
     */
    public void moveAround()
    {
        move(-3);
        if (Greenfoot.getRandomNumber(10) == 1) {
            turn(Greenfoot.getRandomNumber(90) - 45);
        }
        if (isAtEdge()) {
            turn(180);
        }
    }
}
