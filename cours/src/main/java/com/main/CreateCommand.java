package com.main;

public class CreateCommand implements Command {
    @Override
    public void execute() {
        Main.createGift();
    }
}
