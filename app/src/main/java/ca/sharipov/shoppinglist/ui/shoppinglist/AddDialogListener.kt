package ca.sharipov.shoppinglist.ui.shoppinglist

import ca.sharipov.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListener {

    fun onAddButtonClicked(item: ShoppingItem)
}