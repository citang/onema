package live.citang.onema.dao;

import live.citang.onema.mbg.model.UmsPermission;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: citang
 * @Date: 2020-05-05 09:58
 * @Description: description what the main function of this file
 */
@Repository
public interface UmsAdminRoleRelationDao {
    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);
}
