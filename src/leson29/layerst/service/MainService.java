package leson29.layerst.service;


import leson29.layerst.model.User;

public interface MainService {

    User registerUser(String email, String password);

    boolean loginUser(String email, String password);

    void logout();
}


