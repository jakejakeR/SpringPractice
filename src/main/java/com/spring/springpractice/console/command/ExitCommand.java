package com.spring.springpractice.console.command;

import org.springframework.stereotype.Component;

@Component()
class ExitCommand extends ConsoleCommandBase{

    public ExitCommand() {
        super("exit");
    }

    @Override
    public void handle(String input) {
        System.exit(0);
    }
}
