package com.dicallc.usercenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.dicallc.provider.router.RouterManager;

@Route(path = RouterManager.URL_LOGIN)
public class LoginActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.user_activity_main);
  }
}
