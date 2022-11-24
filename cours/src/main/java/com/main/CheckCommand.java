package com.main;

import java.sql.SQLException;

public class CheckCommand implements Command {
    @Override
    public void execute() throws SQLException {
        Main.printGiftComposition();
    }
}
