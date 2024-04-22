package com.tmCraftgruz.SearchPanel;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
@Component
public class ClientsMessageData {

    private static SimpleDateFormat simpleDateFormat;

    public ClientsMessageData(){}

    public static String getDate() {
        simpleDateFormat = new SimpleDateFormat("yyy-MM-dd");
        return simpleDateFormat.format(new Date());
    }

    public static String getTime() {
        simpleDateFormat = new SimpleDateFormat("H:mm");
        return simpleDateFormat.format(new Date());
    }
}
