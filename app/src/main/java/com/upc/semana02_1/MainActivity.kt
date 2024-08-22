package com.upc.semana02_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.upc.semana02_1.ui.theme.Semana02_1Theme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Semana02_1Theme {

                var txtUsu by remember { mutableStateOf("" ) }
                var txtPass by remember { mutableStateOf("" ) }

                Column (modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    TopAppBar(
                        title = { Text("UPC MOVIL") },
                        navigationIcon = {
                            Icon(
                                imageVector = Icons.Default.Home,
                                contentDescription = null
                            )
                        }
                    )
                    Image(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = "Logo UPC",
                        modifier = Modifier
                            .padding(16.dp)
                            .height(200.dp)
                            .clip(CircleShape)
                    )
                    Text(text = "Login Student",
                        fontSize = 30.sp,
                        color = Color.Blue,
                        textAlign = TextAlign.Center)

                    OutlinedTextField(value = txtUsu,
                        modifier = Modifier.padding(vertical = 20.dp),
                        label = { Text(text = "Ingrese Usuario")},
                        onValueChange = {
                            txtUsu = it
                        })
                    OutlinedTextField(value = txtPass,
                        modifier = Modifier.padding(vertical = 20.dp),
                        label = { Text(text = "Ingrese Contraseña")},
                        onValueChange = {
                            txtPass = it
                        })
                    Button(onClick = {
                     colors = ButtonDefaults.buttonColors(backgroundColor = Color.Blue)
                    }
                    ) {
                       Text(text = "Iniciar Sesion")
                    }

                }

            }
        }
    }
}

