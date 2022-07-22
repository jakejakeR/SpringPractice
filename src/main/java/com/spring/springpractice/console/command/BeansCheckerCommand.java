package com.spring.springpractice.console.command;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component("injectThisOne")
public class BeansCheckerCommand extends ConsoleCommandBase {
    private final ApplicationContext context;

    protected BeansCheckerCommand(ApplicationContext context) {
        super("1");
        this.context = context;
    }

    @Override
    public void handle(String input) {
        System.out.println("All beans created: " + context.getBeanDefinitionCount());
        String[] beanDefinitionNames = context.getBeanDefinitionNames();

        for (int i = 0; i < beanDefinitionNames.length; i++) {
            System.out.println("\t" + (i < 9 ? " " : "") + (i+1) + ". " + beanDefinitionNames[i]);
        }
    }
}
