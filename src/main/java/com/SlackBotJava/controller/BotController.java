package com.SlackBotJava.controller;

import com.SlackBotJava.domain.service.SlackService;
import com.SlackBotJava.domain.vo.BotVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teradashoutarou on 2016/09/18.
 */
@RestController
@RequestMapping("/Bot")
public class BotController {

    @Autowired
    private SlackService slackService;

    public String putMessage(@RequestBody BotVO botVO) {
        return this.slackService.putSlack(botVO);
    }
}
