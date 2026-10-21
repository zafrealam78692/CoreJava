package com.kodewala.hotstar.user;

public class User {
	String userId;
	String userNmae;
    String type;
   public static int liveUserCounts=0;
	public User(String userId, String userNmae, String type) {
		super();
		this.userId = userId;
		this.userNmae = userNmae;
		this.type = type;
	}
	public User(String userNmae, String type) {
		super();
		this.userNmae = userNmae;
		this.type = type;
	}
	{
		liveUserCounts=liveUserCounts+1;
	}
}
