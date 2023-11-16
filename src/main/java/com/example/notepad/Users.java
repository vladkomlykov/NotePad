package com.example.notepad;

import java.util.ArrayList;
import java.util.List;

public class Users {
    List<User> users = new ArrayList<>();
    {
        User admin =  new User("0");
        users.add(admin);
    }
}
