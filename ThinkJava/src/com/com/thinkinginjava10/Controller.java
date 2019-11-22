package com.com.thinkinginjava10;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xuxi on 2019/11/22.
 */
public class Controller {
    //A class from java.util to hold Event objects
    private List<Event> eventList = new ArrayList<>();
    public void addEvent(Event c){
        eventList.add(c);
    }
    public void run(){
        while (eventList.size() > 0){
            //Make a copy so you are not modifying the list
            //while you are selecting the elements in it
            for (Event e : new ArrayList<>(eventList)){
                if (e.ready()){
                    System.out.println(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
