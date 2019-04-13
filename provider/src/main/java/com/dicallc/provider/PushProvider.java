package com.dicallc.provider;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by dicallc on 2019/4/12.
 */
public interface PushProvider extends IProvider {
  String getPushId();
}
