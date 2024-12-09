package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Артур", "Каныбеков", (byte)21);
        userService.saveUser("Эскобар", "Пабло", (byte)44);
        userService.saveUser("Трамп", "Дональд", (byte)78);
        userService.saveUser("Путин", "Владимир", (byte)72);

        List<User> users = userService.getAllUsers();
        for (User user: users)
            System.out.println(user);

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
