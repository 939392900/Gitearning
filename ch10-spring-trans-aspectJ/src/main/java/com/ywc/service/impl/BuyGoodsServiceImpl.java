package com.ywc.service.impl;

import com.ywc.dao.GoodsDao;
import com.ywc.dao.SaleDao;
import com.ywc.domain.Goods;
import com.ywc.domain.Sale;
import com.ywc.excep.NotEnoughException;
import com.ywc.service.BuyGoodsService;

/**
 * @author BaiGei
 * @date 2021-03-09 16:11
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("========================buy方法的开始");

        //记录销售信息，向sale表添加记录
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);
        //更新库存
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null) {
            //商品不存在
            throw new NullPointerException("编号为" + goodsId + "商品不存在");
        } else if (goods.getAmount() < nums) {
            //库存不足
            throw new NotEnoughException("编号为" + goodsId + "商品库存不足");
        }
        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("===============================buy方法结束");
    }
}
