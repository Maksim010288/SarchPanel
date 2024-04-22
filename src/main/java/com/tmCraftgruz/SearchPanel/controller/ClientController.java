package com.tmCraftgruz.SearchPanel.controller;

import com.tmCraftgruz.SearchPanel.service.ClientsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/clients")
public class ClientController {
    private Logger LOGGER = Logger.getLogger(ClientController.class);

    @Autowired
    private ClientsService clientsService;

    @GetMapping("/")
    public String getClientsAll(Model model) {
        try {
            model.addAttribute("clientsAll", clientsService.getAll());
            if (clientsService.getAll().isEmpty()) {
                model.addAttribute("emptyList", "Пусто");
            }
        } catch (Exception e) {
            model.addAttribute("messageExeptionClientAll", "ПОМИЛКА ЗЄДНАННЯ ВИБАЧТЕ ЗА НЕЗРУЧНОСТІ");
            LOGGER.error(e.getMessage());
        }
        return "notification_cabinet";
    }

    @GetMapping("/search")
    public String find(Model model) {
        return "clientSearch";
    }

    @GetMapping("/search/by")
    public String findBy(@RequestParam(defaultValue = "0") String value,
                         @RequestParam(defaultValue = "0") String date,
                         Model model) {
        try {
            model.addAttribute("clientsBy", clientsService.findBy(value));
            model.addAttribute("not_found", clientsService.check(value));
        } catch (Exception e) {
            LOGGER.trace(e.getMessage());
            model.addAttribute("messageException", "Виникла помилка підключення!!! вибачте за незручності");
        }
        return "clientSearch";
    }


}
