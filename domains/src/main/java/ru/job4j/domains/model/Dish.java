package ru.job4j.domains.model;

import lombok.*;

/**
 * 3. Мидл
 * 3.5. Микросервисы
 * 3.5.3. Межпроцессорное взаимодействие
 * 1. Синхронный обмен сообщений [#458496]
 * 2. Монолитные системы [#338433 #326394]
 * Доменная модель описывает БЛЮДО.
 *
 * @author Dmitry Stepanov, user Dmitry
 * @since 01.11.2022
 */
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@RequiredArgsConstructor
public class Dish {
    @Getter
    @Setter
    @EqualsAndHashCode.Include
    private int id;
    @NonNull
    @Getter
    @Setter
    private String dishName;
}
