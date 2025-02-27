package leson29.layerst.model;


import leson29.layerst.utils.MyArrayList;
import leson29.layerst.utils.MyList;

import java.util.Objects;


public class User {
    private String email;
    private String password;
    private Role role;
    private final MyList<Car> userCars;


    public User(String email, String password) {
        this.email = email;
        this.password = password;
        this.role = Role.USER;
        this.userCars = new MyArrayList<>();
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", userCars=" + userCars +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;

        return Objects.equals(email, user.email) && Objects.equals(password, user.password) && role == user.role && userCars.equals(user.userCars);

    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(email);
        result = 31 * result + Objects.hashCode(password);
        result = 31 * result + Objects.hashCode(role);
        result = 31 * result + userCars.hashCode();
        return result;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public MyList<Car> getUserCars() {
        return userCars;
    }
}
