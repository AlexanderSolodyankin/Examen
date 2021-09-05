package com.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.GregorianCalendar;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String login;
    private int dateBerth;
    private Boolean gender;


    @Override
    public String toString() {

        return String.format("%s: %s, Ваш год рождения: %s, вам %s %s",
                gender? "Увожаемый": "Уважаемая", login, dateBerth, new GregorianCalendar().getWeekYear() - dateBerth,
                dateBerth % 10 >4? "лет" : dateBerth % 10 == 1? "год" : "года");
    }
}
