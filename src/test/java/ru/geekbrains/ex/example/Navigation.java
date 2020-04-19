package ru.geekbrains.ex.example;

import sun.jvm.hotspot.debugger.Page;

public class Navigation {

    //123
    public Page clickButton(String nameButton) throws NotFoundPageException {
        switch (nameButton){
            case "Курсы":{
                return new Page(1,1);
            } default:{
                throw new NotFoundPageException("Страницы: "+nameButton+" не существует!");
            }
        }

    }
}
