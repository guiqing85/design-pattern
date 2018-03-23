package com.glv.design.pattern.mediator;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Apple on 18/3/23.
 */
public class ChatMediatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMediatorImpl() {
        users = new CopyOnWriteArrayList<User>();
    }

    @Override
    public void sendMessage(final String message, User user) {
        users.forEach(u -> {
            if(!user.name.equals(u.name)) {
                user.receiveMessage(message);
            }
        });
    }

    @Override
    public void addUser(User user) {
        users.add(user);

    }
}
