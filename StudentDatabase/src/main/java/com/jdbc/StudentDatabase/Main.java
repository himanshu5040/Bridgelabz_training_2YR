package com.jdbc.StudentDatabase;

public class Main   {
    
    public static void main(String[] args) {
        IConnection con = new ConnectionImpl();
        IStudent studentService = new StudentImpl();
        IMenu menu = new Menu();
        menu.showMenu();
    }
}

