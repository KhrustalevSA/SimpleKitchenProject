package com.simplekitchen.dao.entity.user;

import com.simplekitchen.dao.entity.user.api.City;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

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
@Entity
@Table
public class CityImpl implements City {

    /**
     * поле уникального идентификатора города пользователя
     */
    @Id
    @Column(name = "id", nullable = false)
    private Long uuid;

    /**
     * поле имени города
     * */
    @Column(name = "town")
    private String cityName;

    /**
     * поле имени области
     * */
    @Column(name = "region")
    private String regionName;

    /**
     * поле названия улицы
     * */
    @Column(name = "street")
    private String streetName;

    /**
     * поле номера дома
     * */
    @Column(name = "house")
    private Long houseNumber;

    /**
     * поле номера подъезда
     * */
    @Column(name = "entrance")
    private Long entranceNumber;

    /**
     * поле номера квартиры
     * */
    @Column(name = "flat")
    private Long flatNumber;

    @OneToMany(mappedBy = "city")
    private List<UserImpl> userList;

}
