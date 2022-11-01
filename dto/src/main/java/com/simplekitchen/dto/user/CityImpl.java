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
    private String cityName;

    /**
     * поле имени области
     * */
    private String regionName;

    /**
     * поле названия улицы
     * */
    private String streetName;

    /**
     * поле номера дома
     * */
    private Long houseNumber;

    /**
     * поле номера подъезда
     * */
    private Long entranceNumber;

    /**
     * поле номера квартиры
     * */
    private Long flatNumber;

    public Long getUuid() {
        return uuid;
    }

    public String getCityName() {
        return cityName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getStreetName() {
        return streetName;
    }

    public Long getHouseNumber() {
        return houseNumber;
    }

    public Long getEntranceNumber() {
        return entranceNumber;
    }

    public Long getFlatNumber() {
        return flatNumber;
    }
}
