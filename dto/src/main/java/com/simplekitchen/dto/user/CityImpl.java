package com.simplekitchen.dto.user;

import com.simplekitchen.dto.user.api.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс реализовывающий интерфейс City
 * @see City
 * @Author KhrustalevSA
 * @since 28.09.2022
 * */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CityImpl implements City {

    /**
     * поле уникального идентификатора города пользователя
     */
    private Long uuid;

    /**
     * поле имени города
     * */
    String cityName;

    /**
     * поле имени области
     * */
    String regionName;

    /**
     * поле названия улицы
     * */
    String streetName;

    /**
     * поле номера дома
     * */
    Long houseNumber;

    /**
     * поле номера подъезда
     * */
    Long entranceNumber;

    /**
     * поле номера квартиры
     * */
    Long flatNumber;
}
