package com.example.demo.repositories;

import com.example.demo.entities.ShippingInformation;
import com.example.demo.entities.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    User user1 = new User(
            1,
            "gogo",
            "mogo",
            "Gogo",
            "Mogov",
            "gogo.mogov@email.com",
            "1234567890",
            new ShippingInformation(
                    "Lozengrad 1",
                    "",
                    "Bulgaria",
                    "Elhovo",
                    "8700"
            ),
            new ShippingInformation(
                    "Lozengrad 1",
                    "",
                    "Bulgaria",
                    "Elhovo",
                    "8700"
            ),
            "user");
    User user2 = new User(
            2,
            "admin",
            "admin",
            "admin",
            null,
            null,
            null,
            null,
            null,
            "admin"
    );

    User user3 = new User(
            3,
            "pesho",
            "pesho",
            "Pesho",
            "Peshov",
            "pesho.peshov@email.com",
            "1234567890",
            new ShippingInformation(
                    "Lozengrad 1",
                    "",
                    "Bulgaria",
                    "Elhovo",
                    "8700"
            ),
            new ShippingInformation(
                    null,
                    null,
                    null,
                    null,
                    null
            ),
            "user"
    );

    public ArrayList<User> userList = new ArrayList<User>();

    public UserRepository(){
        this.userList.add(this.user1);
        this.userList.add(this.user2);
        this.userList.add(this.user3);
    }

    public List<User> getAllUsers() {
        return this.userList;
    }

    public User getUserById(Integer id) {
        return this.userList
                .stream()
                .filter(u -> u.id == id)
                .findFirst()
                .orElse(null);
    }

    public Boolean registerUser(User user){
        user.id = this.userList.size() + 1;
        user.role = "user";
        return this.userList.add(user);
    }

    public User authenticateUser(String username, String password) {
        return this.userList
                .stream()
                .filter(user -> user.username.equals(username) && user.password.equals(password))
                .findFirst()
                .orElse(null);
    }

    public User updateUser(Integer userId, User user) {
        User userToBeUpdated = this.userList
                .stream()
                .filter(u -> u.id == userId)
                .findFirst()
                .orElse(null);

        if (user.username != null){
            userToBeUpdated.username = user.username;
        }

        if (user.firstName != null){
            userToBeUpdated.firstName = user.firstName;
        }

        if (user.lastName != null){
            userToBeUpdated.lastName = user.lastName;
        }

        if (user.email != null){
            userToBeUpdated.email = user.email;
        }
        if (user.phone != null){
            userToBeUpdated.phone = user.phone;
        }

        if (user.shippingInformation != null){
            if (user.shippingInformation.address1 != null) {
                userToBeUpdated.shippingInformation.address1 = user.shippingInformation.address1;
            }

            if (user.shippingInformation.address2 != null) {
                userToBeUpdated.shippingInformation.address2 = user.shippingInformation.address2;
            }

            if (user.shippingInformation.country != null) {
                userToBeUpdated.shippingInformation.country = user.shippingInformation.country;
            }

            if (user.shippingInformation.city != null) {
                userToBeUpdated.shippingInformation.city = user.shippingInformation.city;
            }

            if (user.shippingInformation.zipCode != null) {
                userToBeUpdated.shippingInformation.zipCode = user.shippingInformation.zipCode;
            }
        }

        if (user.billingInformation != null){
            userToBeUpdated.billingInformation = user.billingInformation;
        }

        return  userToBeUpdated;
    }
}
