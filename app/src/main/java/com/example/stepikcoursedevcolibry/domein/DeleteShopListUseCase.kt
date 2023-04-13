package com.example.stepikcoursedevcolibry.domein

class DeleteShopListUseCase(private val shopRepository: ShopListRepository) {
    fun deleteShopItem(shopItem: ShopItem){
        shopRepository.deleteShopItem(shopItem)
    }
}