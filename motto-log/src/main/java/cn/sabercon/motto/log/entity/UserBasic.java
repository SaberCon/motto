package cn.sabercon.motto.log.entity;

import cn.sabercon.motto.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 * @author ywk
 * @date 2019-10-15
 */
@Data
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(indexes = {@Index(columnList = "username"), @Index(columnList = "phone")})
public class UserBasic extends BaseEntity {

    @Column(nullable = false, unique = true)
    String username;

    @Column(nullable = false)
    String password;

    @Column(nullable = false, unique = true)
    String phone;

}
