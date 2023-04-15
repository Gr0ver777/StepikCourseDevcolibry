package com.example.stepikcoursedevcolibry.domein

import androidx.lifecycle.LiveData

class GetShopListUseCase(private val shopRepository: ShopListRepository) {
    fun getShopList(): LiveData<List<ShopItem>>{
        return shopRepository.getShopList()
    }
}