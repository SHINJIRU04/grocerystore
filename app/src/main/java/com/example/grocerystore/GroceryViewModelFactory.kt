package com.example.grocerystore

import androidx.lifecycle.ViewModelProvider

class GroceryViewModelFactory(private val repository: GroceryRepository): ViewModelProvider.NewInstanceFactory() {
    override fum <T: ViewModel?> create(modelClass: Class<T>):T{
        return GroceryViewModel(repository) as T
    }
}