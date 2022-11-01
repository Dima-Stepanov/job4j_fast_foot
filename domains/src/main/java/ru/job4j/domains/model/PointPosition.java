package ru.job4j.domains.model;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * 3.5.3. Межпроцессорное взаимодействие
 * 1. Синхронный обмен сообщений [#458496]
 * 2. Монолитные системы [#338433 #326394]
 * Модель данных описывает точку координат
 * gpsLng - широта
 * gpsLat - долгота
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 01.11.2022
 */
public class PointPosition {
    private double gpsLng;
    private double gpsLat;
}
