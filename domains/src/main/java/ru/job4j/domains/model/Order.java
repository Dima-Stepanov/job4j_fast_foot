package ru.job4j.domains.model;

import java.time.LocalDateTime;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * 3.5.3. Межпроцессорное взаимодействие
 * 1. Синхронный обмен сообщений [#458496]
 * 2. Монолитные системы [#338433 #326394]
 * Доменная модель описывает ЗАКАЗ
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 01.11.2022
 */

public class Order {
    private int id;
    private Dish dish;
    private LocalDateTime created = LocalDateTime.now().withNano(0);
    private LocalDateTime completed;
    private StatusOrder status = StatusOrder.ORDERED;
}
