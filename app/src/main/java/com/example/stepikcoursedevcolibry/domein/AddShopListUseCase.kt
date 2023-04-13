package com.example.stepikcoursedevcolibry.domein

class AddShopListUseCase(private val shopRepository: ShopListRepository) {
    fun addShopItem(shopItem: ShopItem){
        shopRepository.addShopItem(shopItem)
    }
}