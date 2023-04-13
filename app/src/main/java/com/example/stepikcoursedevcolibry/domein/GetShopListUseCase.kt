package com.example.stepikcoursedevcolibry.domein

class GetShopListUseCase(private val shopRepository: ShopListRepository) {
    fun getShopList(): List<ShopItem>{
        return shopRepository.getShopList()
    }
}