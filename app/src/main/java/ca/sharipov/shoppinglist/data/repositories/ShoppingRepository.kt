package ca.sharipov.shoppinglist.data.repositories

import ca.sharipov.shoppinglist.data.db.ShoppingDatabase
import ca.sharipov.shoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(
        private val db: ShoppingDatabase
) {
    suspend fun upsert(item: ShoppingItem) = db.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = db.getShoppingDao().delete(item)

    fun getAllShoppingItems() = db.getShoppingDao().getAllShoppingItems()
}
