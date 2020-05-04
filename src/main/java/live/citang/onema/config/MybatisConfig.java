package live.citang.onema.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: citang
 * @Date: 2020-05-04 06:30
 * @Description: description what the main function of this file
 */
@Configuration
@MapperScan("live.citang.onema.mbg.mapper")
public class MybatisConfig {

}
