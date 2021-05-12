package com.example.coroutine

import android.database.Cursor
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getContacts()
        //CoroutineScope(Dispatchers.IO).launch { arrayN() } // После работы очищает поток
    }


    // Вывод массива в консоль
    private fun arrayN(){
        val array = arrayOfNulls<Int>(500000)
        array.forEach { print({ it }) }
    }

    private fun getContacts() {
        val uri: Uri = ContactsContract.Contacts.CONTENT_URI
        val contacts: Cursor? = contentResolver.query(uri, null, null, null, null)
        print(contacts)
    }

}