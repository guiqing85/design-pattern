package com.glv.design.pattern.mediator;

/**
 * Created by Apple on 18/3/23.
 */
public interface ChatMediator {

    public void sendMessage(String message, User user);

    void addUser(User user);

}
