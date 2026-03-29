package design;

import java.util.*;

interface Button {
    void getButton();
}

interface Checkbox {
    void getCheckbox();
}

class DarkThemeButton implements Button {

    @Override
    public void getButton() {
        System.out.println("Dark theme button");
    }
}


class DarkThemeCheckbox implements Checkbox {

    @Override
    public void getCheckbox() {
        System.out.println("Dark theme checkbox");
    }
}

class LightThemeButton implements Button {

    @Override
    public void getButton() {
        System.out.println("Light theme button");
    }
}

class LightThemeCheckbox implements Checkbox {

    @Override
    public void getCheckbox() {
        System.out.println("Light theme checkbox");
    }
}

interface UIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class DarkThemeFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new DarkThemeButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new DarkThemeCheckbox();
    }
}

class LightThemeFactory implements UIFactory {

    @Override
    public Button createButton() {
        return new LightThemeButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LightThemeCheckbox();
    }
}

public class AbstractFactoryDesignPattern {

    public static void main(String[] args) {

        UIFactory darkThemeFactory = new DarkThemeFactory();
        Button button1 = darkThemeFactory.createButton();
        Checkbox checkbox1 = darkThemeFactory.createCheckbox();

        UIFactory lightThemeFactory = new LightThemeFactory();
        Button button2 = lightThemeFactory.createButton();
        Checkbox checkbox2 = lightThemeFactory.createCheckbox();

        button1.getButton();
        button2.getButton();

        checkbox1.getCheckbox();
        checkbox2.getCheckbox();
    }

}
