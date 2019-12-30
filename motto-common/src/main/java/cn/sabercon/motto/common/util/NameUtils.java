package cn.sabercon.motto.common.util;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 处理名称的工具类
 *
 * @author ywk
 * @date 2019-12-30
 */
@UtilityClass
@Slf4j
public class NameUtils {

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss_");

    /**
     * 在文件名前面加上时间，防止重复
     *
     * @param filename 初始文件名称
     * @return 加上时间的文件名称
     */
    public String getFilename(String filename) {
        LocalDateTime now = LocalDateTime.now();
        String prefix = now.format(formatter);
        return prefix + filename;
    }
}
