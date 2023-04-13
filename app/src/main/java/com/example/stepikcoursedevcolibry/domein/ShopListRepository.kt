package com.example.stepikcoursedevcolibry.domein

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(shopItem: ShopItem)

    fun editShopItem(shopItem: ShopItem)

    fun getObjectIdItem(shopItemId: Int): ShopItem

    fun getShopList(): List<ShopItem>


}