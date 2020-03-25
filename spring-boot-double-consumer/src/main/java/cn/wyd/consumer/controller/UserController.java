package cn.wyd.consumer.controller;

import cn.wyd.base.common.ResultVO;
import cn.wyd.base.entity.User;
import cn.wyd.base.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Reference
    private UserService userService;

    @GetMapping("list")
    public ResultVO findList(){
        List<User> list = userService.findList();
        return new ResultVO.Builder<>().data(list).build();
    }
}
