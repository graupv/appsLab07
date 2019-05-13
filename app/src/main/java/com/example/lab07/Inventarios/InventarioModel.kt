package com.example.lab07.Inventarios

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.MutableLiveData
import android.widget.Toast
import com.example.lab07.MainActivity
import com.example.lab07.Productos.ProductoModel


class InventarioModel: ViewModel() {

    var inventarios = MutableLiveData<ProductoModel>()
    var cantidades = MutableLiveData<Int>()

    fun onSkip() {
        cantidades.value = (cantidades.value)?.plus(1)
        val toast = Toast.makeText(MainActivity, "Plus One", Toast.LENGTH_SHORT)
        toast.show()
//        nextWord()
    }

}