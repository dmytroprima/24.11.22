package com.main;

import java.sql.SQLException;

public class SortCommand implements Command{
    @Override
    public void execute() throws SQLException {Main.sortGift();}
}
