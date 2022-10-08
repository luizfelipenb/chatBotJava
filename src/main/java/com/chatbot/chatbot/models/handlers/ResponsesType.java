package com.chatbot.chatbot.models.handlers;

class Pedido{
    String pizza = "";
    String refrigerante = "";
    int valor = 0;
}

public class ResponsesType {

    public static String getResponse(String question){
        String response = "Envie uma mensagem valida";
        Pedido pedido = new Pedido();

        if(question.toLowerCase().equals("boa noite")) {
            response = "Ola boa noite, bem vindo a Gallo`s Pizzaria, gostaria de receber o cardapio?" +
                    "\n Sim \n Nao";
        }else if(question.toLowerCase().equals("sim")){
            response = "Para pedir pizza de 2 sabores digite FALAR COM UM ATENDENTE" +
                    "\n Apenas 1 sabor escolha uma das numerações abaixo:" +
                    "\n 1 - Calabresa R$20,00    2 - Mussarela R$20,00 \n 3 - Portuguesa R$25,00    4 - Marguerita R$25,00" +
                    "\n 5 - Frango com Catupiry R$27,00    6 - Atum R$27,00 \n 7 - Presunto R$22,00    8 - Palmito R$24,00" +
                    "\n 9 - Lombo canadense R$30,00    10 - Paulista R$25,00";
        }else if(question.toLowerCase().equals("nao")){
            response = "Obrigado pelo contato, aguardamos seu retorno! - Gallo`s Pizzaria";
        }else if(question.toLowerCase().equals("falar com um atendente")){
            response = "Obrigado pelo contato estamos te encaminhando para um atendente!";
        }else if(question.toLowerCase().equals("/start")){
            response = "Ola boa noite, bem vindo a Gallo`s Pizzaria, gostaria de receber o cardapio?" +
                    "\n Sim \n Nao";
        }else if(question.toLowerCase().equals("1")){
            pedido.pizza = "Calabresa";
            pedido.valor = 20;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!" +
                    "\n Seu pedido ficou R$" + pedido.valor + ",00"+
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("2")){
            pedido.pizza = "Mussarela";
            pedido.valor = 20;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00" +
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("3")){
            pedido.pizza = "Portuguesa";
            pedido.valor = 25;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00"+
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("4")){
            pedido.pizza = "Marguerita";
            pedido.valor = 25;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00"+
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("5")){
            pedido.pizza = "Frango com catupiry";
            pedido.valor = 27;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00"+
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("6")){
            pedido.pizza = "Atum";
            pedido.valor = 27;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00"+
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("7")){
            pedido.pizza = "Presunto";
            pedido.valor = 22;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00" +
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("8")){
            pedido.pizza = "Palmito";
            pedido.valor = 24;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00" +
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("9")){
            pedido.pizza = "Lombo canadense";
            pedido.valor = 30;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00"+
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("10")){
            pedido.pizza = "Paulista";
            pedido.valor = 25;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00" +
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO para finalizar seu pedido:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina"+
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("7")){
            pedido.pizza = "Presunto";
            pedido.valor = 10;
            response = "Pizza " + pedido.pizza + " adicionada ao pedido!"+
                    "\n Seu pedido ficou R$" + pedido.valor + ",00" +
                    "\n Gostaria de adicionar refrigerante? Se sim digite o nome ou FINALIZAR PEDIDO:" +
                    "\n Coca cola, Guarana, Pepsi, Fanta Laranja, Fanta Uva, Tubaina" +
                    "\n " +
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("coca cola")){
            pedido.refrigerante = "Coca Cola";

            response = pedido.refrigerante + " adicionado ao pedido, digite FINALIZAR PEDIDO para escolher a forma de pagamento" +
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("guarana")){
            pedido.refrigerante = "Guarana";

            response = pedido.refrigerante + " adicionado ao pedido, digite FINALIZAR PEDIDO para escolher a forma de pagamento" +
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("pepsi")){
            pedido.refrigerante = "Pepsi";

            response = pedido.refrigerante + " adicionado ao pedido, digite FINALIZAR PEDIDO para escolher a forma de pagamento" +
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("fanta laranja")){
            pedido.refrigerante = "Fanta Laranja";

            response = pedido.refrigerante + " adicionado ao pedido, digite FINALIZAR PEDIDO para escolher a forma de pagamento" +
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("fanta uva")){
            pedido.refrigerante = "Fanta Uva";

            response = pedido.refrigerante + " adicionado ao pedido, digite FINALIZAR PEDIDO para escolher a forma de pagamento" +
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("tubaina")){
            pedido.refrigerante = "Tubaina";

            response = pedido.refrigerante + " adicionado ao pedido, digite FINALIZAR PEDIDO para escolher a forma de pagamento" +
                    "\n Para limpar seu pedido digite LIMPAR";
        }else if(question.toLowerCase().equals("limpar")){
            pedido.refrigerante = "";
            pedido.valor= 0;
            pedido.pizza = "";

            response = "Para pedir pizza de 2 sabores digite FALAR COM UM ATENDENTE" +
                    "\n Apenas 1 sabor escolha uma das numerações abaixo:" +
                    "\n 1 - Calabresa R$20,00    2 - Mussarela R$20,00 \n 3 - Portuguesa R$25,00    4 - Marguerita R$25,00" +
                    "\n 5 - Frango com Catupiry R$27,00    6 - Atum R$27,00 \n 7 - Presunto R$22,00    8 - Palmito R$24,00" +
                    "\n 9 - Lombo canadense R$30,00    10 - Paulista R$25,00";
        }else if(question.toLowerCase().equals("finalizar pedido")){
            response =  "Digite a forma de pagamento:" +
                        "\n Cartao, Dinheiro, PIX";

        }else if(question.toLowerCase().equals("cartao")){
            response = "Pedido realizado com sucesso, obrigado pela preferência e volte sempre";
        }else if(question.toLowerCase().equals("debito")){
            response = "Pedido realizado com sucesso, obrigado pela preferência e volte sempre";
        }else if(question.toLowerCase().equals("pix")){
            response = "Chave: 555.555-55 - CPF" +
                    "\n Gallo`s Pizzaria" +
                    "\n Banco Money" +
                    "\n " +
                    "\n Pedido realizado com sucesso, obrigado pela preferência e volte sempre";
        }

        return response;
    }
}
