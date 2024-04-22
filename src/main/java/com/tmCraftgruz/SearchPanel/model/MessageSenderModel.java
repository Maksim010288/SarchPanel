package com.tmCraftgruz.SearchPanel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
public class MessageSenderModel {
    private String pointOfDeparture;
    private String itemOfImportance;
    private String weight;
    private String firstName;
    private String numberPhone;
    private String email;

    public MessageSenderModel() {
    }

    ;

    @Override
    public String toString() {
        return "Клієнт:\n" +
                "Імя: " + firstName +  "\n" +
                "Телефон: " + numberPhone + "\n" +
                "Email: " + email + "\n" +
                "Відправка: " + pointOfDeparture + "\n" +
                "Прибуття: " + itemOfImportance +  "\n" +
                "Вага: " + weight +  " кг. \n";
    }
}
