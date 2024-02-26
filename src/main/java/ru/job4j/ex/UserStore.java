package ru.job4j.ex;

import java.util.Objects;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User user = null;
        for (User value : users) {
            if (Objects.equals(value.getUsername(), login)) {
                user = value;
                break;
            }
        }
        if (user == null) {
            throw new UserNotFoundException("User doesn't exist!");
        }
        return user;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid or user name is less than 3 chars");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException uie) {
            uie.printStackTrace();
        } catch (UserNotFoundException nfe) {
            nfe.printStackTrace();
        }
    }
}
