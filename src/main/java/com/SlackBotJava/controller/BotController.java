package com.SlackBotJava.controller;

import com.SlackBotJava.domain.service.SlackService;
import com.SlackBotJava.domain.vo.BotVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by teradashoutarou on 2016/09/18.
 */
@RestController
@RequestMapping("/test")
@ComponentScan("domain")
public class BotController {

    @Autowired
    private SlackService slackService;

    @ResponseBody
    @RequestMapping(value="/slack", method=RequestMethod.POST)
    public String putMessage(@RequestBody BotVO botVO) {
        return this.slackService.putSlack(botVO);
    }

    @ResponseBody
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String putMessage() {
        BotVO botVO = new BotVO();
        botVO.setMessage("hellow slack java");
        botVO.setName("sample");
        botVO.setTarget("チャンネルID");
        return this.slackService.putSlack(botVO);
    }
}
