package com.example.stepikcoursedevcolibry.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.stepikcoursedevcolibry.data.ShopListRepositoryImp
import com.example.stepikcoursedevcolibry.domein.DeleteShopListUseCase
import com.example.stepikcoursedevcolibry.domein.EditShopListUseCase
import com.example.stepikcoursedevcolibry.domein.GetShopListUseCase
import com.example.stepikcoursedevcolibry.domein.ShopItem


class MainViewModel: ViewModel() {

    private val repository = ShopListRepositoryImp

    private val getShopListUsecase = GetShopListUseCase(repository)
    private val deleteShopListUseCase = DeleteShopListUseCase(repository)
    private val editShopListUseCase = EditShopListUseCase(repository)

    val shopList = getShopListUsecase.getShopList()


    fun deleteShopItem(shopItem: ShopItem){
        deleteShopListUseCase.deleteShopItem(shopItem)

    }

    fun changeEnable(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopListUseCase.editShopItem(newItem)

    }

}