package com.thales.controller;

import com.thales.dao.ChatDao;
import com.thales.dao.MessageDao;
import com.thales.dao.UserDao;
import com.thales.model.Chat;
import com.thales.model.Message;
import com.thales.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/datainsert")
public class DataInsertController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ChatDao chatDao;

    @Autowired
    private MessageDao messageDao;

    @GetMapping({"/", ""})
    public void insert() {getList();}

    final public void getList() {

        User user1=new User("test","test","test");
        User user2=new User("pseudo1","log1","mdp1");
        User user3=new User("pseudo2","log2","mdp2");
        User user4=new User("pseudo3","log3","mdp3");
        User user5=new User("pseudo4","log4","mdp4");
        User user6=new User("pseudo5","log5","mdp5");
        User user7=new User("pseudo6","log6","mdp6");

        this.userDao.save(user1);
        this.userDao.save(user2);
        this.userDao.save(user3);
        this.userDao.save(user4);
        this.userDao.save(user5);
        this.userDao.save(user6);
        this.userDao.save(user7);

        Message message11=new Message(user1,"message 1 de user1");
        Message message12=new Message(user1,"message 2 de user1");
        Message message13=new Message(user1,"message 3 de user1");
        Message message21=new Message(user1,"message 1 de user2");
        Message message22=new Message(user1,"message 2 de user2");
        Message message3=new Message(user1,"message 1 de user3");
        Message message4=new Message(user1,"message 1 de user4");

        this.messageDao.save(message11);
        this.messageDao.save(message12);
        this.messageDao.save(message13);
        this.messageDao.save(message21);
        this.messageDao.save(message22);
        this.messageDao.save(message3);
        this.messageDao.save(message4);


        Chat chat1=new Chat();
        Chat chat2=new Chat();

        //chat1.setUsers();
        //chat1.setUsers(user2);


    }
}
