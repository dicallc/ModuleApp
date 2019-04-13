package com.dicallc.module;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.alibaba.android.arouter.launcher.ARouter;
import com.dicallc.provider.router.RouterManager;
import com.dicallc.usercenter.UserInfoService;

public class MainActivity extends AppCompatActivity {

  @BindView(R.id.button) Button mButton;
  @BindView(R.id.txt_user) TextView mTxtUser;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    ButterKnife.bind(this);
    loadUserInfo();
  }

  private void loadUserInfo() {
    UserInfoService mUserInfoService =
        (UserInfoService) ARouter.getInstance().build(RouterManager.AIDL_USERINFO).navigation();
    mTxtUser.setText(mUserInfoService.getUserInfo().name);
  }

  @OnClick(R.id.button) public void onViewClicked() {
    RouterManager.goLogin(MainActivity.this);
  }
}
