package com.dicallc.module;

import android.content.Context;
import android.util.Log;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.dicallc.provider.aidl.ISkill;

@Route(path = "/app/ISkillImpl")
public class ISkillImpl implements ISkill {

    @Override
    public void eat() {
        Log.i("TAG", "大王叫我来巡山!");
    }

    @Override
    public void init(Context context) {

    }
}
