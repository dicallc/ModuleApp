package com.dicallc.provider.aidl;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.dicallc.provider.model.UserInfo;

/**
 * Created by dicallc on 2019/4/13.
 */
public interface UserInfoService extends IProvider {
  UserInfo getUserInfo();
}
