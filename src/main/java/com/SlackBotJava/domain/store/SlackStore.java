package com.SlackBotJava.domain.store;

import com.SlackBotJava.domain.vo.SlackBotVO;

/**
 * Created by teradashoutarou on 2016/09/18.
 */
public interface SlackStore {

    public String put(SlackBotVO slackBotVO);
}
