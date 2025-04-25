package com.actividad.lista.lista_usuarios.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import com.actividad.lista.lista_usuarios.models.User;

@Service
public class UserService {

    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();

        users.add(new User("Luis", "Sanchez", "luis@gmail.com"));
        users.add(new User("Ivan", "Membreño", "ivan@gmail.com"));
        users.add(new User("Sonia", "Abrego", null));
        users.add(new User("Alex", "Pineda", "pineda@gmail.com"));
        users.add(new User("Wendy", "Ayala", null));
        users.add(new User("Alondra", "López", "alondra@gmail.com"));

        return users;
    }

}
