package com.chltec.module_day_6;

/**
 * @author Rair
 * @date 2019/7/11
 * <p>
 * desc:
 */
public class WechatMessage {

    private int avatar;
    private String name;
    private String message;
    private String date;

    public int getAvatar() {
        return avatar;
    }

    public WechatMessage setAvatar(int avatar) {
        this.avatar = avatar;
        return this;
    }

    public String getName() {
        return name;
    }

    public WechatMessage setName(String name) {
        this.name = name;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public WechatMessage setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getDate() {
        return date;
    }

    public WechatMessage setDate(String date) {
        this.date = date;
        return this;
    }
}
