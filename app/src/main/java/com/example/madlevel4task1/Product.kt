package com.example.madlevel4task1

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "ShoppingList")
data class Product(

    @ColumnInfo(name = "productName")
    var productname: String,

    @ColumnInfo(name = "quantity")
    var productquantity: String,

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Long? = null

)