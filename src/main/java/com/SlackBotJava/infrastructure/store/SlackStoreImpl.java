package com.SlackBotJava.infrastructure.store;

import com.SlackBotJava.domain.store.SlackStore;
import com.SlackBotJava.domain.vo.SlackBotVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by teradashoutarou on 2016/09/18.
 */
@Component
public class SlackStoreImpl implements SlackStore {

    @Autowired
    private RestTemplate restTemplate;

    public String put(SlackBotVO slackBotVO) {
        return this.restTemplate.postForObject("https://slack.com/api/chat.postMessage",slackBotVO,String.class);
    }
}
