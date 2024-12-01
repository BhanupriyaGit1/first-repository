package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
         val usernameWrapper =  findViewById<TextInputLayout>(R.id.emailInputLayout3)
         val passwordWrappers=  findViewById<TextInputLayout>(R.id.passwordInputLayout)
        val usernameEdittext =  findViewById<TextInputEditText>(R.id.email_edit_text)
        val passwordEdittext =  findViewById<TextInputEditText>(R.id.password_edit_text)
        val enteredUsername=usernameEdittext.text.toString()
        val enteredPassword=passwordEdittext.text.toString()

        val  loginBtn=findViewById<MaterialButton>(R.id.btn_login)
        loginBtn.setOnClickListener {

            // to check if the user fields are empty or not.
            if (TextUtils.isEmpty(usernameEdittext.text.toString()) || TextUtils.isEmpty(passwordEdittext.text.toString())) {
                // this method will call when email and password fields are empty.
                Toast.makeText(this@MainActivity2, "Please Enter Email and Password", Toast.LENGTH_SHORT).show()
            } else {
            //   Toast.makeText(this@MainActivity2),  enteredUsername+" , "+enteredPassword,Toast.LENGTH_SHORT).show()
                // starting new activity.
                Toast.makeText(this@MainActivity2, enteredUsername+" , "+enteredPassword, Toast.LENGTH_SHORT).show()

                val i = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(i)
                finish()
            }
        }

    }
    }
