package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Seb", "Loeb", (byte) 50);
        userService.saveUser("Seb", "Ogier", (byte) 40);
        userService.saveUser("Ott", "Tanak", (byte) 36);
        userService.saveUser("Kalle", "Rovanpera", (byte) 23);

        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
