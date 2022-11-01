package ru.job4j.domains.model;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * 3.5.3. Межпроцессорное взаимодействие
 * 1. Синхронный обмен сообщений [#458496]
 * Доменная модель описывает ЗАКАЗ
 * Перечисление статусов заказа
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 01.11.2022
 */
public enum StatusOrder {
    ORDERED, READY, DELIVERED;
}
