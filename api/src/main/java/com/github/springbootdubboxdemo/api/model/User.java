package com.github.springbootdubboxdemo.api.model;

import java.io.Serializable;

/**
 * 用户实体
 *
 * @author: lvhao
 * @since: 2016-10-13 16:03
 */
public class User implements Serializable{
    private long userId;
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getUserId() {

        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("userId=").append(userId);
        sb.append(", userName='").append(userName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
