package com.SlackBotJava.domain.builder;

import com.SlackBotJava.domain.vo.BotVO;
import com.SlackBotJava.domain.vo.SlackBotVO;

/**
 * Created by teradashoutarou on 2016/09/19.
 */
public class SlackBotVOBuilder {

    public SlackBotVO build(BotVO botVO) {
        SlackBotVO slackBotVO = new SlackBotVO();
        slackBotVO.setChannel( botVO.getTarget() );
        slackBotVO.setText(botVO.getMessage() );
        slackBotVO.setUsername( botVO.getName() );
        slackBotVO.setToken("");
        return  slackBotVO;
    }
}
