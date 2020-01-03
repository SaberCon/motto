package cn.sabercon.motto.log.dao;

import cn.sabercon.motto.common.dao.BaseJpaRepository;
import cn.sabercon.motto.log.entity.File;
import cn.sabercon.motto.log.entity.Picture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author ywk
 * @date 2020-01-03
 */
public interface PictureRepository extends BaseJpaRepository<Picture> {

    Page<Picture> findByUserIdAndDelAndNameLike(Long userId, Integer del, String name, Pageable pageable);
}
