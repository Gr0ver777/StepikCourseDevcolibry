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

    private val getShopList = GetShopListUseCase(repository)
    private val deleteShopList = DeleteShopListUseCase(repository)
    private val editShopList = EditShopListUseCase(repository)

    val shopList = MutableLiveData<List<ShopItem>>()

    fun getShopList(){
        val list = getShopList.getShopList()
        shopList.value = list
    }

    fun deleteShopItem(shopItem: ShopItem){
        deleteShopList.deleteShopItem(shopItem)
        getShopList()
    }

    fun changeEnable(shopItem: ShopItem){
        val newItem = shopItem.copy(enabled = !shopItem.enabled)
        editShopList.editShopItem(newItem)
        getShopList()
    }

}