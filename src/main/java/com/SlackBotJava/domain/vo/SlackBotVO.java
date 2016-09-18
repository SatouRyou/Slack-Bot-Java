package com.SlackBotJava.domain.vo;

import lombok.Data;

/**
 * Created by teradashoutarou on 2016/09/18.
 */
@Data
public class SlackBotVO {

    private String token;
    private String channel;
    private String username;
    private String text;
}
