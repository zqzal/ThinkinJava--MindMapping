package com.com.thinkinginjava7;

/**
 * Created by xuxi on 2019/2/22.
 */
public class SpaceShip extends SpaceShipControls{

    private String name;
    public SpaceShip(String name){
        this.name = name;
    }
    public String toString(){
        return name;
    }
    public static void main(String[] args) {
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(100);
    }
}