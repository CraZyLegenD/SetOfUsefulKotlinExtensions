package com.crazylegend.setofusefulkotlinextensions.db

import android.content.Context
import com.crazylegend.kotlinextensions.log.debug
import com.crazylegend.setofusefulkotlinextensions.adapter.TestModel

/**
 * Created by crazy on 1/14/21 to long live and prosper !
 * This is for demonstration purposes, do not do this in real app scenario
 */
class TestRepo(context: Context) {

    private val dao = TestDatabase.getInstance(context).dao()

    fun getAllFlow() = dao.getAllFlow()

    suspend fun insertList(list: List<TestModel>) {
        debug { "DATABASE insertList OPERATION" }
        dao.insertList(list)
    }

    suspend fun getAll(): List<TestModel> {
        debug { "DATABASE getAll OPERATION" }
        return dao.getAll()
    }
}