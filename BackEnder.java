package org.example;

public class BackEnder extends Developer implements BackendAction{
    @Override
    public void back() {
        System.out.println("BackEnd working");
    }

    @Override
    public void developGUI() {
        System.out.println("BackEnder GUI method");
    }
}
