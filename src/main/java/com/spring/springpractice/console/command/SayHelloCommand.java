package com.spring.springpractice.console.command;

import org.springframework.stereotype.Component;

@Component("injectSayHello")
public class SayHelloCommand extends ConsoleCommandBase{

    protected SayHelloCommand() {
        super("2");
    }

    @Override
    public void handle(String input) {
        System.out.println("Hello!");
    }
}