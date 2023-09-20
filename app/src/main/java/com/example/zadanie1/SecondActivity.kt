package com.example.zadanie1

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast


lateinit var input: EditText
lateinit var FirstSelect:Spinner
lateinit var SecondSelect:Spinner
class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        input = findViewById(R.id.editTextInput);
        FirstSelect=findViewById(R.id.firstspinner);
        SecondSelect=findViewById(R.id.secondspinner)
    }

    fun selectSpinner (view: View)
    {
        if (input !=null)
        {
            //Проверка выбора в Spinner
            if (FirstSelect.getSelectedItemPosition()==0 && SecondSelect.getSelectedItemPosition()==0)
            {
                val intent = Intent(this, FierdActivity::class.java)
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${input.getText().toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==0 && SecondSelect.getSelectedItemPosition()==1)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()/1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==0 && SecondSelect.getSelectedItemPosition()==2)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()/1024/1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==0 && SecondSelect.getSelectedItemPosition()==3)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()/1024/1024/1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
                    //2 элемент выбора в первом Spiner
            else if (FirstSelect.getSelectedItemPosition()==1 && SecondSelect.getSelectedItemPosition()==0)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()*1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.selectedItemPosition ==1 && SecondSelect.getSelectedItemPosition()==1)
            {
                val intent = Intent(this, FierdActivity::class.java)
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${input.getText().toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==1 && SecondSelect.getSelectedItemPosition()==2)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()/1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==1 && SecondSelect.getSelectedItemPosition()==3)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()/1024/1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
                    //3 элемент выбора в первом Spinner
            else if (FirstSelect.getSelectedItemPosition()==2 && SecondSelect.getSelectedItemPosition()==0)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()*1024*1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==2 && SecondSelect.getSelectedItemPosition()==1)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()*1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==2 && SecondSelect.getSelectedItemPosition()==2)
            {
                val intent = Intent(this, FierdActivity::class.java)
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${input.getText().toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==2 && SecondSelect.getSelectedItemPosition()==3)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()/1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }

                    //4 элемент выбора в первом Spinner
            else if (FirstSelect.getSelectedItemPosition()==3 && SecondSelect.getSelectedItemPosition()==0)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()*1024*1024*1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==3 && SecondSelect.getSelectedItemPosition()==1)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()*1024*1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==3 && SecondSelect.getSelectedItemPosition()==2)
            {
                val intent = Intent(this, FierdActivity::class.java)
                var res=input.getText().toString().toDouble()*1024
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${res.toString()}")
                startActivity(intent)
            }
            else if (FirstSelect.getSelectedItemPosition()==3 && SecondSelect.getSelectedItemPosition()==3)
            {
                val intent = Intent(this, FierdActivity::class.java)
                intent.putExtra("Number", "${input.getText().toString()}")
                intent.putExtra("Res", "${input.getText().toString()}")
                startActivity(intent)
            }

        }
        else
        {
            val text = "Найдено пустое поле!"
            val duration = Toast.LENGTH_SHORT
            Toast.makeText(applicationContext, text, duration).show()
        }
    }

}