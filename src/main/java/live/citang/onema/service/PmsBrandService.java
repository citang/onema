package live.citang.onema.service;

import live.citang.onema.mbg.model.PmsBrand;

import java.util.List;

/**
 * @Author: citang
 * @Date: 2020-05-04 07:41
 * @Description: description what the main function of this file
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
