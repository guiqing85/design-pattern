package com.glv.design.pattern.mediator;

/**
 * Created by Apple on 18/3/23.
 */
public abstract class User {

    protected String name;
    protected ChatMediator chatMediator;

    public User(ChatMediator chatMediator, String name){
        this.name = name;
        this.chatMediator = chatMediator;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);

}
