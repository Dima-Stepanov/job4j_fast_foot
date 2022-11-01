package ru.job4j.dish.service;

import ru.job4j.domains.model.Dish;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * 3.5.3. Межпроцессорное взаимодействие
 * 1. Синхронный обмен сообщений [#458496]
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 01.11.2022
 */
public interface DishService {
    void addDish(Dish dish);
}
