package com.dicallc.usercenter.Manager;

import com.dicallc.provider.model.UserInfo;

/**
 * Created by dicallc on 2019/4/13.
 */
public class UserInfoManager {
  public static UserInfo getUserInfo(){
    return new UserInfo("我是jack");
  }
}
