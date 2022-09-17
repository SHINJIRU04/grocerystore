package com.example.grocerystore

import androidx.room.*

@Entity(tableName = "grocery_items")
data class GroceryItems(
    @ColumnInfo(name="itemName")
    var itemName: String,

    @ColumnInfo(name="itemQuantity")
    var itemQuantity: Int,

    @ColumnInfo(name="itemPrice")
    var itemPrice: Int,
) {

    @PrimaryKey(autroGenerate = true)
    var id:Int? = null
}