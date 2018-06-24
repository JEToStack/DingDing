package com.dingding;

import java.util.ArrayList;

public class NotificationCollection {
    public static ArrayList<NotificationItem> getNotifications(){
        ArrayList<NotificationItem> items = new ArrayList<>();

        NotificationItem n = new NotificationItem();
        n.setUserImage(R.drawable.user_profile_pic);
        n.setUsername("Jeto");
        n.setDesc("want to join your meeting.");
        n.setTimeStamp("1 min ago");
        items.add(n);

        n = new NotificationItem();
        n.setUserImage(R.drawable.user_profile_pic);
        n.setUsername("Hongly Va");
        n.setDesc("want to join your meeting.");
        n.setTimeStamp("3 mins ago");
        items.add(n);

        n = new NotificationItem();
        n.setUserImage(R.drawable.user_profile_pic);
        n.setUsername("Manith");
        n.setDesc("want to join your meeting.");
        n.setTimeStamp("10 mins ago");
        items.add(n);

        n = new NotificationItem();
        n.setUserImage(R.drawable.user_profile_pic);
        n.setUsername("VOTO");
        n.setDesc("want to join your meeting.");
        n.setTimeStamp("11 mins ago");
        items.add(n);

        n = new NotificationItem();
        n.setUserImage(R.drawable.user_profile_pic);
        n.setUsername("Daramuny");
        n.setDesc("want to join your meeting.");
        n.setTimeStamp("20 mins ago");
        items.add(n);

        n = new NotificationItem();
        n.setUserImage(R.drawable.user_profile_pic);
        n.setUsername("Sengly Houth");
        n.setDesc("want to join your meeting.");
        n.setTimeStamp("30 mins ago");
        items.add(n);

        return items;
    }
}
