package com.ywc.dao;

import com.ywc.domain.Sale;

/**
 * @author BaiGei
 * @date 2021-03-09 15:58
 */
public interface SaleDao {
    /**
     * 增加销售记录
     *
     * @param sale sale
     * @return 记录
     */
    int insertSale(Sale sale);
}
