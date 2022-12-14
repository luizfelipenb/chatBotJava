package com.chatbot.chatbot.models.handlers;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

public class HandleTestingJava extends TelegramLongPollingBot {

    @Override
    public String getBotUsername() {
        return "VictorLTestebot";
    }

    @Override
    public String getBotToken() {
        return "5625842736:AAFdVMtWY0mC3nHpn_4W7_MI5DXuygkNSLc";
    }

    @Override
    public void onUpdateReceived(Update update) {
        Pedido pedido = new Pedido();
        SendMessage message = new SendMessage();
        String command = update.getMessage().getText();
        message.setChatId(update.getMessage().getChatId().toString());

        try{

            String response = ResponsesType.getResponse(command, pedido);


            message.setText(response);

            execute(message);

        }catch (Exception error){
            error.printStackTrace();
        }
    }
}
