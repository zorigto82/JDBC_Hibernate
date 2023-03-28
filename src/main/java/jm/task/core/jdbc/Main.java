package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoHibernateImpl();userDao.createUsersTable();
        userDao.saveUser("Name5", "LastName5", (byte) 40);
        userDao.removeUserById(5);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();


        UserService service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Name1", "LastName1", (byte) 20);
        service.saveUser("Name2", "LastName2", (byte) 25);
        service.saveUser("Name3", "LastName3", (byte) 31);
        service.saveUser("Name4", "LastName4", (byte) 38);
        service.removeUserById(1);
        System.out.print(service.getAllUsers());
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}
