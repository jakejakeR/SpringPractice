package com.spring.springpractice.console.command;

public interface ConsoleCommand {
    boolean canHandle(String input);
    void handle(String input);
    String introduce();

}
