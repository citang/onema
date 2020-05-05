package live.citang.onema.dao;

import live.citang.onema.nosql.elasticsearch.document.EsProduct;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: citang
 * @Date: 2020-05-05 23:11
 * @Description: description what the main function of this file
 */
@Repository
public interface EsProductDao {
    List<EsProduct> getAllEsProductList(@Param("id") Long id);
}
