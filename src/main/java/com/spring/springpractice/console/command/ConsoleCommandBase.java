package com.spring.springpractice.console.command;

import java.util.Locale;

import static java.util.Objects.requireNonNull;

abstract class ConsoleCommandBase implements ConsoleCommand {

    private final String input;

    protected ConsoleCommandBase(String input) {
        this.input = requireNonNull(input).toLowerCase(Locale.ROOT);
    }

    @Override
    public boolean canHandle(String input) {
        return this.input.equals(input);
    }
}
