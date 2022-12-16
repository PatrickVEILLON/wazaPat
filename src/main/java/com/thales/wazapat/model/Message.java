package com.thales.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.lang.NonNull;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NonNull
    @ManyToOne
    private User author;

    @NonNull
    private String contents;

    @ManyToMany(mappedBy = "messagesReceived")
    private List<User> receivers;

    @ManyToOne
    private Chat chat;



}
