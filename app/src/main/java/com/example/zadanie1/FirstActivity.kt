package com.example.zadanie1

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.EditText
import android.widget.Toast

class FirstActivity : AppCompatActivity() {
    private val APP_PREFERENCES = "mysettings"
    private val PREF_LOGIN="login"
    private val PREF_PASSWORD="password"
    private val PREF_Scan="0"
    lateinit var login: EditText
    lateinit var pass: EditText
    lateinit var pref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        login = findViewById(R.id.editTextLogin);
        pass = findViewById(R.id.editTextPassword);
        pref=getSharedPreferences(APP_PREFERENCES, MODE_PRIVATE)
    }

    fun setPreference(view: View) {
if (pref.getString(PREF_Scan,"")=="0" && login!=null && pass!=null)
{
    val message = AlertDialog.Builder(this)
    message.setTitle("Сообщение")
    message.setMessage("Сохранить данную информацию?")
    message.setPositiveButton("OK", DialogInterface.OnClickListener { dialog, which ->
        val passwords = pass.text.toString()
        val log = login.text.toString()
        if (passwords != "" && log != "") {
            val prefEditor = pref.edit()
            prefEditor.putString(PREF_PASSWORD, passwords)
            prefEditor.putString(PREF_LOGIN, log)
            prefEditor.putString(PREF_Scan,"1")
            prefEditor.apply()
            val text = "Вы зарегистрировали данные для входа!"
            val duration = Toast.LENGTH_SHORT
            Toast.makeText(applicationContext, text, duration).show()
        } else {
            val text = "Найдены пустые поля!"
            val duration = Toast.LENGTH_SHORT
            Toast.makeText(applicationContext, text, duration).show()
        }
    })
    message.setNegativeButton("Oтмена", DialogInterface.OnClickListener{ dialog, which->
        val text = "Вы отменили сохранение!"
        val duration = Toast.LENGTH_SHORT
        Toast.makeText(applicationContext, text , duration).show()
    })
    val dialog=message.create()
    message.show()
}
        else
        {
            val inputlogin=login.text.toString()
            val inputpassword=pass.text.toString()
            val savelogin=pref.getString(PREF_LOGIN,"")
            val savepassword=pref.getString(PREF_PASSWORD,"")
            if (inputpassword==savepassword && inputlogin==savelogin && inputpassword!="" && inputlogin!="") {
                login.setText(savelogin)
                pass.setText(savepassword)
                val text = "Успешный вход!"
                val duration = Toast.LENGTH_SHORT
                Toast.makeText(applicationContext, text , duration).show()
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
                finish()
            }
            else
            {
                val text = "Вы ввели не правильные данные при входе или у вас пустые строки!"
                val duration = Toast.LENGTH_SHORT
                Toast.makeText(applicationContext, text , duration).show()
            }
        }
    }

}