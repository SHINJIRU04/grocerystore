package com.example.grocerystore

import androidx.lifecycle.ViewModel

class GroceryViewModel(private val repository: GroceryRepository) : ViewModel() {
    fun insert(items: GroceryItems)=GlobalScope.launch{this:CoroutineScope
        repository.insert(items)
    }

    fun delete(items: GroceryItems)=GlobalScope.launch{this:CoroutineScope
        repository.delete(items)
    }
    fun getAllGroceryItems() = repository.getAllItems()
}