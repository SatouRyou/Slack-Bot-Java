package com.SlackBotJava.domain.builder;

import com.SlackBotJava.domain.vo.BotVO;
import com.SlackBotJava.domain.vo.SlackBotVO;
import org.springframework.stereotype.Component;

/**
 * Created by teradashoutarou on 2016/09/19.
 */
@Component
public class SlackBotVOBuilder {

    public SlackBotVO build(BotVO botVO) {
        SlackBotVO slackBotVO = new SlackBotVO();

        slackBotVO.setUrl( this.createUrl( botVO ) );
        return  slackBotVO;
    }

    private String createUrl( BotVO botVO ) {
        StringBuffer sb = new StringBuffer();
        sb.append( "token=" );
        sb.append( "トークン" );
        sb.append( "&channel=" );
        sb.append( botVO.getTarget() );
        sb.append( "&userName" );
        sb.append( botVO.getName() );
        sb.append( "&text=" );
        sb.append( botVO.getMessage() );
        return  sb.toString();
    }
}
