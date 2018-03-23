package com.glv.design.pattern.mediator;

/**
 * Created by Apple on 18/3/23.
 */
public class UserImpl extends User {
    public UserImpl(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("["+this.name+"] sending message:"+ message);
        chatMediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("["+this.name+"] receiving message:" + message);

    }
}
