package com.example.stepikcoursedevcolibry.domein

class GetObjectIdShopListUseCase(private val shopRepository: ShopListRepository) {
    fun getObjectIdItem(shopItemId: Int): ShopItem{
        return shopRepository.getObjectIdItem(shopItemId)
    }
}