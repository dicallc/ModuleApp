package com.dicallc.usercenter.provider;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.dicallc.provider.router.RouterManager;
import com.dicallc.usercenter.Manager.UserInfoManager;
import com.dicallc.usercenter.UserInfo;
import com.dicallc.usercenter.UserInfoService;

/**
 * Created by dicallc on 2019/4/13.
 */
@Route(path = RouterManager.AIDL_USERINFO)
public class UserInfoServiceImpl implements UserInfoService {
  @Override public UserInfo getUserInfo() {
    return UserInfoManager.getUserInfo();
  }

  @Override public void init(Context context) {

  }
}
