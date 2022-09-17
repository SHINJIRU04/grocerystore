package com.example.grocerystore

@Database(entities = [GroceryItems::class],version=1)
abstract class GroceryDatabase : RoomDatabse() {

    abstract fun getGroceryDao(): GroceryDao

    companion object{
        @volatile
        private var instance:GroceryDatabase? =null
        private val LOCK=Any()

        operator fun invoke(context: Context)=instance ?: synnchronized(LOCK){

            instance ?: createDatabase(context).also{
                instance=it
            }
        }
    }
    private fun createDatabase(context: Context)=
        Room.databaseBuilder(
            context.applicationContext,
            GroceryDatabase::class.java,
            name:"Grocery.db"
        ).build()
}