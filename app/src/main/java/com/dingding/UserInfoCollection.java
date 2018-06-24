package com.dingding;

import java.util.ArrayList;

public class UserInfoCollection {
    public static ArrayList<UserInfo> getUsers(){
        ArrayList<UserInfo> users = new ArrayList<>();

        UserInfo user = new UserInfo();
        user.setUserImg(R.drawable.yunnan);
        user.setUserName("YunNan");
        user.setUserAge(20);
        users.add(user);

        user = new UserInfo();
        user.setUserImg(R.drawable.paopei);
        user.setUserName("PaoPei");
        user.setUserAge(20);
        users.add(user);

        user = new UserInfo();
        user.setUserImg(R.drawable.soyun);
        user.setUserName("Soyun");
        user.setUserAge(21);
        users.add(user);

        user = new UserInfo();
        user.setUserImg(R.drawable.tongyum);
        user.setUserName("TongYum");
        user.setUserAge(22);
        users.add(user);

        user = new UserInfo();
        user.setUserImg(R.drawable.yunan);
        user.setUserName("YuNan");
        user.setUserAge(18);
        users.add(user);

        return users;
    }
}
