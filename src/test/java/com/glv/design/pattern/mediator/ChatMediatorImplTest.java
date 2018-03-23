package com.glv.design.pattern.mediator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Apple on 18/3/23.
 */
public class ChatMediatorImplTest {
    @Test
    public void sendMessage() {
        ChatMediator mediator = new ChatMediatorImpl();
        User u1 = new UserImpl(mediator, "John");
        User u2 = new UserImpl(mediator, "Jack");
        User u3 = new UserImpl(mediator, "Gary");

        mediator.addUser(u1);
        mediator.addUser(u2);
        mediator.addUser(u3);
        u1.sendMessage("Hello, I'm John");
        u2.sendMessage("Hello, I'm Jack");
    }

}