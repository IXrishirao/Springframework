package org.example.Service;

import org.example.Repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository repo;

    public UserService(UserRepository repo){
        this.repo = repo;
    }

    public void printUser(){
        System.out.println(repo.getUser());
    }
}
