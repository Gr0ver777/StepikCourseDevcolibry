package com.example.stepikcoursedevcolibry.domein

class EditShopListUseCase(private val shopRepository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem){
        shopRepository.editShopItem(shopItem)
    }
}