package com.lestrades.clientefirebase.product

import com.lestrades.clientefirebase.entities.Product

interface OnProductLisener {
    fun onClick(product: Product)
    fun onLongClick(product: Product)
}