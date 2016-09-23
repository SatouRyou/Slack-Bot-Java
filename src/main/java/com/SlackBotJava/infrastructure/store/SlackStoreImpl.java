package com.SlackBotJava.infrastructure.store;

import com.SlackBotJava.domain.store.SlackStore;
import com.SlackBotJava.domain.vo.SlackBotVO;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by teradashoutarou on 2016/09/18.
 */
@Component
public class SlackStoreImpl implements SlackStore {

    private RestTemplate restTemplate;

    public SlackStoreImpl( RestTemplateBuilder restTemplateBuilder ) {
        this.restTemplate = restTemplateBuilder.build();
    }


    @Override
    public String put(SlackBotVO slackBotVO) {
        System.out.println(  slackBotVO  );
        String uri = "https://slack.com/api/chat.postMessage?" + slackBotVO.getUrl();
        return this.restTemplate.getForObject( uri ,String.class);
    }
}
