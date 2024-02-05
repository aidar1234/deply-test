package org.example;

import org.telegram.abilitybots.api.objects.Ability;
import org.telegram.abilitybots.api.objects.Locality;
import org.telegram.abilitybots.api.objects.Privacy;

import static org.example.BotTest.BOT_TOKEN;
import static org.example.BotTest.BOT_USERNAME;

public class AbilityBot extends org.telegram.abilitybots.api.bot.AbilityBot {

    protected AbilityBot() {
        super(BOT_TOKEN, BOT_USERNAME);
    }

    public Ability say() {
        return Ability.builder()
                .name("hello")
                .info("say hello")
                .locality(Locality.ALL)
                .privacy(Privacy.PUBLIC)
                .action(ctx -> silent.send("Hello world", ctx.chatId()))
                .build();
    }

    @Override
    public long creatorId() {
        return 0;
    }
}
