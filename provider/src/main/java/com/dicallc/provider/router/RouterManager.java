package com.dicallc.provider.router;

import android.app.Application;
import android.content.Context;
import com.alibaba.android.arouter.BuildConfig;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by dicallc on 2019/4/12.
 */
public class RouterManager {
  /**
   * Router Path
   */
  public static final String URL_WELCOME = "/loginModule/welcome";
  public static final String URL_LOGIN = "/user/login";

  public static final String URL_MAIN_LOGIN = "/loginModule/main";
  public static final String URL_MAIN_PEDU = "/peduModule/main";
  public static final String AIDL_USERINFO = "/aidl/user_info";


  /**
   * Module application name
   */
  public static final String MODULE_LOGIN = "loginmodule";
  public static final String MODULE_PEDU = "pedumodule";

  public static void initRouter(Application application) {
    if (BuildConfig.DEBUG) {
      ARouter.openLog();     // 打印日志
      ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
    }
    ARouter.init(application);
  }

  public static void gotoNewPage(Context context, String pageUrl) {
    ARouter.getInstance().build(pageUrl).navigation();
  }

  public static void goWelcome(Context context) {
    ARouter.getInstance().build(URL_WELCOME).navigation();
  }

  public static void goLogin(Context context) {
    ARouter.getInstance().build(URL_LOGIN).navigation();
  }

  public static void goHome(Context context) {
    String packageName = context.getApplicationInfo().packageName;
    String suffix = packageName.substring(packageName.lastIndexOf(".") + 1);
    switch (suffix) {
      case MODULE_LOGIN:
        ARouter.getInstance().build(URL_MAIN_LOGIN).navigation();
        break;
      case MODULE_PEDU:
        ARouter.getInstance().build(URL_MAIN_PEDU).navigation();
        break;
    }
  }
}
