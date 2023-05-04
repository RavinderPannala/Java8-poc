package com.java8.features.practice;

public class SingletonEx {

    private SingletonEx singletonEx;

    private SingletonEx() {

    }

    public SingletonEx getInstance() {
        if (singletonEx == null) {
            singletonEx = new SingletonEx();
        }
        return singletonEx;
    }
}
