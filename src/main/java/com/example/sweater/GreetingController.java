package com.example.sweater;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Что делает этот контроллер?
 * Он слушает запросы от пользователя по пути "/greeting"
 * и возвращает какие-то данные. В данном случае это файл HTML-шаблона.
 */

@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(
            name = "name",
            required = false,
            defaultValue = "World") String name, Map<String, Object> model) {
        model.put("name", name);
        return "greeting"; //имя файла, которое хотим отобразить
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        model.put("some", "hello, letsCode!");
        return "main";
    }

}
