package com.SlackBotJava.domain.service;

import com.SlackBotJava.domain.builder.SlackBotVOBuilder;
import com.SlackBotJava.domain.store.SlackStore;
import com.SlackBotJava.domain.vo.BotVO;
import com.SlackBotJava.domain.vo.SlackBotVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by teradashoutarou on 2016/09/19.
 */
@Component
@Service
@ComponentScan("infrastructure")
public class SlackService {

    @Autowired
    private SlackStore slackStore;

    @Autowired
    private SlackBotVOBuilder slackBotVOBuilder;

    public String putSlack(BotVO botVO) {

        SlackBotVO slackBotVO = this.slackBotVOBuilder.build( botVO );
        return  this.slackStore.put( slackBotVO );
    }
}
