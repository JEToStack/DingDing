package com.dingding;

import java.util.ArrayList;

public class PostCollection {
    public static ArrayList<CreatePost> getPosts(){
        ArrayList<CreatePost> posts = new ArrayList<>();

        CreatePost p = new CreatePost();
        p.setUserImage(R.drawable.user_profile_pic);
        p.setUsername("Jeto");
        p.setTimeStamp("1 mins");
        p.setStatusDesc("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        posts.add(p);

        p = new CreatePost();
        p.setUserImage(R.drawable.user_profile_pic);
        p.setUsername("VOTO");
        p.setTimeStamp("2 mins");
        p.setStatusDesc("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        posts.add(p);

        p = new CreatePost();
        p.setUserImage(R.drawable.user_profile_pic);
        p.setUsername("Hongly VA");
        p.setTimeStamp("5 mins");
        p.setStatusDesc("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        posts.add(p);

        p = new CreatePost();
        p.setUserImage(R.drawable.user_profile_pic);
        p.setUsername("Daramony");
        p.setTimeStamp("10 mins");
        p.setStatusDesc("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        posts.add(p);

        p = new CreatePost();
        p.setUserImage(R.drawable.user_profile_pic);
        p.setUsername("Sengly");
        p.setTimeStamp("15 mins");
        p.setStatusDesc("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
        posts.add(p);

        return posts;
    }
}
