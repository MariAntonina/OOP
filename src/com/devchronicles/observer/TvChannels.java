package com.devchronicles.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by admin on 30.09.2017.
 */
public class TvChannels implements Observer{
    @Override
    public void update(Observable agency, Object newsItem) {
        if (agency instanceof Publisher) {
            System.out.println((String)newsItem);
        }
    }

}
