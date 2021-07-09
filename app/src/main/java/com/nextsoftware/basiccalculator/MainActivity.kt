package com.nextsoftware.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input1 = firstNumber.text.toString().toDoubleOrNull()
        val input2 = secondNumber.text.toString().toDoubleOrNull()

        clean.setOnClickListener {
            if(input1==null || input2==null || !tvResult.text.equals("Result : 0")){
                firstNumber.setText("")
                secondNumber.setText("")
                tvResult.text = "Result : 0"
            }else{
                Toast.makeText(applicationContext,"Clean already :)",Toast.LENGTH_SHORT)
            }
        }

    }


    fun addition(view : View){
        val input1 = firstNumber.text.toString().toDoubleOrNull()
        val input2 = secondNumber.text.toString().toDoubleOrNull()
        if(input1!=null && input2!=null){
            val value = input1 + input2;
            tvResult.text = "Result : $value"
        }else{
            Toast.makeText(this,"Please make sure you're entered everything.",Toast.LENGTH_LONG);
        }
    }

    fun subtraction(view : View){
        val input1 = firstNumber.text.toString().toDoubleOrNull()
        val input2 = secondNumber.text.toString().toDoubleOrNull()
        if(input1!=null && input2!=null){
            val value = input1 - input2;
            tvResult.text = "Result : $value"
        }else{
            Toast.makeText(this,"Please make sure you're entered everything.",Toast.LENGTH_LONG);
        }
    }

    fun multiply(view : View){
        val input1 = firstNumber.text.toString().toDoubleOrNull()
        val input2 = secondNumber.text.toString().toDoubleOrNull()
        if(input1!=null && input2!=null){
            val value = input1 * input2;
            tvResult.text = "Result : $value"
        }else{
            Toast.makeText(this,"Please make sure you're entered everything.",Toast.LENGTH_LONG);
        }
    }

    fun division(view : View){
        val input1 = firstNumber.text.toString().toDoubleOrNull()
        val input2 = secondNumber.text.toString().toDoubleOrNull()
        if(input1!=null && input2!=null){
            val value = input1 / input2;
            tvResult.text = "Result : $value"
        }else{
            Toast.makeText(this,"Please make sure you're entered everything.",Toast.LENGTH_LONG);
        }
    }


    fun getMode(view : View){
        val input1 = firstNumber.text.toString().toDoubleOrNull()
        val input2 = secondNumber.text.toString().toDoubleOrNull()
        if(input1!=null && input2!=null){
            val value = input1 % input2;
            tvResult.text = "Result : $value"
        }else{
            Toast.makeText(this,"Please make sure you're entered everything.",Toast.LENGTH_LONG);
        }
    }

    fun doubleSidedSquare(view : View){

        val input1 = firstNumber.text.toString().toDoubleOrNull()
        val input2 = secondNumber.text.toString().toDoubleOrNull()
        if(input1!=null && input2!=null){
            val value = Math.pow(input1,input2)
            tvResult.text = "Result : $value"
        }else{
            Toast.makeText(this,"Please make sure you're entered everything.",Toast.LENGTH_LONG);
        }
    }

    fun squareRoot(view : View){
        val input1 = firstNumber.text.toString().toDoubleOrNull()
        if(input1!=null){
            val value = Math.sqrt(input1)
            tvResult.text = "Result : $value"
        }else{
            Toast.makeText(this,"Please make sure you're entered correct everything.",Toast.LENGTH_LONG);
        }
    }

}