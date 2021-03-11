package com.ywc.dao;

import com.ywc.domain.Goods;

/**
 * @author BaiGei
 * @date 2021-03-09 16:01
 */
public interface GoodsDao {
    /**
     * 更新库存
     *
     * @param goods 本次用户购买的商品信息 id，购买数量
     * @return 库存
     */
    int updateGoods(Goods goods);

    /**
     * 查询商品
     *
     * @param id 商品id
     * @return 商品
     */
    Goods selectGoods(Integer id);
}
