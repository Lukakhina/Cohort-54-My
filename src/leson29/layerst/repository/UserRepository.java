package leson29.layerst.repository;


import leson29.layerst.model.User;

public interface UserRepository {

    // CRUD

    User addUser(String email, String password);


    boolean isEmailExist(String email);

    // GET
    User getUserByEmail(String email);

    // Update
    boolean updatePassword(String email, String newPassword);

}