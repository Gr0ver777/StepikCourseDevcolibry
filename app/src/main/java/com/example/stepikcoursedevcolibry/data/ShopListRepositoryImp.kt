package com.example.stepikcoursedevcolibry.data

import com.example.stepikcoursedevcolibry.domein.ShopItem
import com.example.stepikcoursedevcolibry.domein.ShopListRepository

object ShopListRepositoryImp: ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var autoIncrementId = 0


    init {
        for(i in 0 until 10){
            val item = ShopItem("Name $i", i, true)
            addShopItem(item)
        }
    }


    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFINED_ID){
            shopItem.id = autoIncrementId++}
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun editShopItem(shopItem: ShopItem) {
        val oldElement = getObjectIdItem(shopItem.id)
        shopList.remove(oldElement)
        addShopItem(shopItem)
    }

    override fun getObjectIdItem(shopItemId: Int): ShopItem {
        return shopList.find {
            it.id == shopItemId } ?:
            throw RuntimeException(
                "Element this id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList.toList()
    }
}