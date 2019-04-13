package com.dicallc.usercenter.provider;

import android.content.Context;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.dicallc.provider.aidl.UserInfoService;
import com.dicallc.provider.model.UserInfo;
import com.dicallc.provider.router.RouterManager;
import com.dicallc.usercenter.Manager.UserInfoManager;

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
