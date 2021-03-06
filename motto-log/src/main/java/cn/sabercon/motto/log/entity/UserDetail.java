package cn.sabercon.motto.log.entity;

import cn.sabercon.motto.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * @author ywk
 * @date 2019-10-15
 */
@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(indexes = @Index(columnList = "userId"))
public class UserDetail extends BaseEntity {

    @Column(nullable = false, unique = true)
    Long userId;

    String nickname;

    String profile;

    String avatar;

    Integer gender;

    LocalDate birthday;

    String country;

    String province;

    String city;

}
