package org.example.Repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public String getUser(){
        return "User from Repository";
    }
}
