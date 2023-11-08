package com.example.ejercicio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textCategoria = findViewById<EditText>(R.id.txtCategoriaEdit)
        val textPrecio = findViewById<EditText>(R.id.txtPrecioEdit)
        val textIgv = findViewById<TextView>(R.id.txtIgv)
        val textSinDescuento =findViewById<TextView>(R.id.txtSinDescuento)
        val textPdescuento = findViewById<TextView>(R.id.txtPdescuento)
        val textConDescuento = findViewById<TextView>(R.id.txtConDescuento)
        val textPrecioTotal = findViewById<TextView>(R.id.txtPrecioTotal)
        val BtnButtonPago = findViewById<Button>(R.id.BtnButtonPago)

        BtnButtonPago.setOnClickListener {
            val PrecioNormal = textPrecio.text.toString().toDouble()
            //ZAPATOS
            if (textCategoria.text.trim().toString().lowercase() == "zapato") {
                if (PrecioNormal >= 1000) {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal * 0.9))
                    textPdescuento.text ="Porcentaje De Descuento: 10%"
                    textIgv.text = String.format("IGV: $" + (PrecioNormal * 0.9) * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: " + (PrecioNormal * 0.9) * 1.18)

                }

                else {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal))
                    textPdescuento.text ="Porcentaje De Descuento: 0%"
                    textIgv.text = String.format("IGV: $" + PrecioNormal * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: $" + PrecioNormal  * 1.18)
                }
            }
            //PRENDAS PARA DAMAS
            else if (textCategoria.text.trim().toString().lowercase() == "prendas para dama" || textCategoria.text.trim().toString().lowercase() == "ropa mujer") {
                if (PrecioNormal >= 500) {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal * 0.82))
                    textPdescuento.text ="Porcentaje De Descuento: 18%"
                    textIgv.text = String.format("IGV: $" + (PrecioNormal * 0.82) * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: " + (PrecioNormal * 0.82) * 1.18)
            }
                else {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal))
                    textPdescuento.text ="Porcentaje De Descuento: 0%"
                    textIgv.text = String.format("IGV: $" + PrecioNormal * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: $" + PrecioNormal * 1.18)
                }
        }
            //ELECTRODOMESTICOS
            else if (textCategoria.text.trim().toString().lowercase() == "electrodomesticos") {
                if (PrecioNormal >= 6000) {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal * 0.93))
                    textPdescuento.text ="Porcentaje De Descuento: 7%"
                    textIgv.text = String.format("IGV: $" + (PrecioNormal * 0.93) * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: " + (PrecioNormal * 0.93) * 1.18)
                }
                else {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal))
                    textPdescuento.text ="Porcentaje De Descuento: 0%"
                    textIgv.text = String.format("IGV: $" + PrecioNormal * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: $" + PrecioNormal * 1.18)
                }
            }
            //CELULARES
            else if (textCategoria.text.trim().toString().lowercase() == "celulares") {
                if (PrecioNormal >= 3500) {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal * 0.91))
                    textPdescuento.text ="Porcentaje De Descuento: 9%"
                    textIgv.text = String.format("IGV: $" + (PrecioNormal * 0.91) * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: " + (PrecioNormal * 0.91) * 1.18)
                }
                else {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal))
                    textPdescuento.text ="Porcentaje De Descuento: 0%"
                    textIgv.text = String.format("IGV: $" + PrecioNormal * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: $" + PrecioNormal * 1.18)
                }
            }
            //ROPA PARA CABALLERO
            else if (textCategoria.text.trim().toString().lowercase() == "ropa para caballero" || textCategoria.text.trim().toString().lowercase() == "ropa hombre" ) {
                if (PrecioNormal >= 1500) {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal * 0.95))
                    textPdescuento.text ="Porcentaje De Descuento: 5%"
                    textIgv.text = String.format("IGV: $" + (PrecioNormal * 0.95) * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: " + (PrecioNormal * 0.95) * 1.18)
                }
                else {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal))
                    textPdescuento.text ="Porcentaje De Descuento: 0%"
                    textIgv.text = String.format("IGV: $" + PrecioNormal * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: $" + PrecioNormal * 1.18)
                }
            }
            //JUGUETES
            else if (textCategoria.text.trim().toString().lowercase() == "juguetes para niños" || textCategoria.text.trim().toString().lowercase() == "juguetes")  {
                if (PrecioNormal >= 2500) {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal * 0.87))
                    textPdescuento.text ="Porcentaje De Descuento: 13%"
                    textIgv.text = String.format("IGV: $" + (PrecioNormal * 0.87) * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: " + (PrecioNormal * 0.87) * 1.18)
                }
                else {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal))
                    textPdescuento.text ="Porcentaje De Descuento: 0%"
                    textIgv.text = String.format("IGV: $" + PrecioNormal * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: $" + PrecioNormal * 1.18)
                }
            }
            //LAPTOPS
            else if (textCategoria.text.trim().toString().lowercase() == "laptops") {
                if (PrecioNormal >= 8000) {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal * 0.81))
                    textPdescuento.text ="Porcentaje De Descuento: 19%"
                    textIgv.text = String.format("IGV: $" + (PrecioNormal * 0.81) * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: " + (PrecioNormal * 0.81) * 1.18)
                }
                else {
                    textSinDescuento.text = String.format("Precio sin Descuento: " + PrecioNormal)
                    textConDescuento.text = String.format("Precio con Descuento: " + (PrecioNormal))
                    textPdescuento.text ="Porcentaje De Descuento: 0%"
                    textIgv.text = String.format("IGV: $" + PrecioNormal * 0.18)
                    textPrecioTotal.text = String.format("Precio Total a Pagar: $" + PrecioNormal * 1.18)
                }
            }
        }
    }
}