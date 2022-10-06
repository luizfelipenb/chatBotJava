package com.chatbot.chatbot.models.service;

import com.chatbot.chatbot.models.handlers.HandleTestingJava;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


@Service
public class ChatBotService {

    public ChatBotService(){
        try {

            HandleTestingJava handleTestingJava = new HandleTestingJava();
            TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
            telegramBotsApi.registerBot(handleTestingJava);
        }catch (Exception error){
            error.printStackTrace();
        }
    }

}
