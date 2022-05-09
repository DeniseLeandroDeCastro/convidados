package com.example.convidados.service.repository

/**
 * Classe que se encarrega da conexão com o banco de dados
 */

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.convidados.service.constants.DataBaseConstants

class GuestDataBaseHelper(context: Context
) : SQLiteOpenHelper (context, NAME, null, VERSION) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(CREATE_TABLE_GUEST)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {}

    /**
     * Este objeto é útil para criar constantes de forma estática no código
     * ou até mesmo métodos.
     */
    companion object {
        private const val VERSION = 1
        private const val NAME = "convidados.db"

        private const val CREATE_TABLE_GUEST =
            ("create table " + DataBaseConstants.GUEST.TABLE_NAME + " ("
                    + DataBaseConstants.GUEST.COLUMNS.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + DataBaseConstants.GUEST.COLUMNS.NAME + " TEXT, "
                    + DataBaseConstants.GUEST.COLUMNS.PRESENCE + " INTEGER);")
    }
}