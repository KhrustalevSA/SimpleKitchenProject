package com.simplekitchen.dao.entity.user;

import com.simplekitchen.dao.entity.user.api.UserList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

/**
 * Класс списка пользователей
 * @author KhrustalevSA
 * @since 16.10.2022
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "userList")
public class UserListImpl implements UserList {
    @Id
    @Column(name = "uuid", nullable = false)
    private Long uuid;

    /**
     * список пользователей
     */
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "userList")
    private List<UserImpl> userList;

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }
}
