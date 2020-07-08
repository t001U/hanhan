package com.epoch.controller.user;

import com.epoch.model.user.UserInfo;
import com.epoch.service.user.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user/")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("GetMapping")
    public UserInfo findUserInfo() {

        return  userInfoService.findObject();
    }

}
