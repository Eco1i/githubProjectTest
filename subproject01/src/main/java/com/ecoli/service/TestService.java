package com.ecoli.service;

/**
 * @author Ecoli
 * @date 23/2/19 10:18
 */

public interface TestService {

    /**
     * 根据id查找信息内容
     *
     * @param id 信息id
     * @return 对应信息
     */
    String getInfoById(Integer id);

}
