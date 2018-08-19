package test;

import com.inspur.cmis.dao.UserDao;
import com.inspur.cmis.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args)
    {
        ApplicationContext ac = new FileSystemXmlApplicationContext("conf/applicationContext.xml");
        UserDao userDao = (UserDao)ac.getBean("userDao");
        User user = new User("sanhao", "sanhao", "1234");
        userDao.add(user);
    }
}
