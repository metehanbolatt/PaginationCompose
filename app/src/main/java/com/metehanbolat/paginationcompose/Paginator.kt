package com.metehanbolat.paginationcompose

interface Paginator<Key, Item> {

    suspend fun loadNextItems()
    fun reset()
}