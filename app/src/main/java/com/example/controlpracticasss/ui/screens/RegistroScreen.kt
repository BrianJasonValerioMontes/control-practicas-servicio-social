package com.example.controlpracticasss.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun RegistroScreen() {

    var fecha by remember { mutableStateOf("") }
    var horas by remember { mutableStateOf("") }
    var actividad by remember { mutableStateOf("") }
    var tipo by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Text(
            text = "Control de Prácticas",
            style = MaterialTheme.typography.headlineMedium
        )

        OutlinedTextField(
            value = fecha,
            onValueChange = { fecha = it },
            label = { Text("Fecha") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = horas,
            onValueChange = { horas = it },
            label = { Text("Horas") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = actividad,
            onValueChange = { actividad = it },
            label = { Text("Actividad") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = tipo,
            onValueChange = { tipo = it },
            label = { Text("Tipo") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = { },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Guardar")
        }
    }
}