package com.ywc.service;

/**
 * @author BaiGei
 * @date 2021-03-09 16:09
 */
public interface BuyGoodsService {
    /**
     * 购买商品的方法
     *
     * @param goodsId 商品id
     * @param nums    商品数量
     */
    void buy(Integer goodsId, Integer nums);
}
