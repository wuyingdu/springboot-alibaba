package cn.wyd.provider.service;

import cn.wyd.base.entity.User;
import cn.wyd.base.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findList() {
        List<User> list = new ArrayList<>();
        list.add(new User("wyd", "123", 10));
        list.add(new User("wyd1", "456", 15));
        list.add(new User("wyd2", "789", 18));
        return list;
    }
}
