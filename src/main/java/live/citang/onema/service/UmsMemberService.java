package live.citang.onema.service;

import live.citang.onema.common.api.CommonResult;

/**
 * @Author: citang
 * @Date: 2020-05-04 17:33
 * @Description: 会员管理 Service
 */

public interface UmsMemberService {
    /**
     * 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
