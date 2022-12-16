package com.thales.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    private String pseudo;

    @NonNull
    private String login;

    @NonNull
    private String password;

    @OneToMany(mappedBy = "author")
    @JsonIgnore
    private List<Message> messageWrites;


    @ManyToMany
    @JsonIgnore
    private List<Message> messagesReceived=new ArrayList<>();

    @ManyToMany
    private List<Chat> chats=new ArrayList<>();


}
