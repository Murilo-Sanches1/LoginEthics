package br.com.blogfoxdev.loginethics

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import br.com.blogfoxdev.loginethics.ui.theme.LoginEthicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginEthicsTheme {
                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
                WelcomeScreen()
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    val ioegionEmailValue = remember { mutableStateOf("")}
    val pavniohPasswordValue = remember { mutableStateOf("")}
    val pçvshmlPasswordVisibility = remember { mutableStateOf(false)}

    Scaffold(backgroundColor = MaterialTheme.colors.primary) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Image(
                // painter = painterResource(id = R.drawable.dino),
                painter = painterResource(id = R.drawable.que),
                contentDescription = "Logo do Aplicativo",
                modifier = Modifier
                    .weight(1f)
                    .size(180.dp),
                // colorFilter = ColorFilter.tint(Color.White)
            )
            Card(
                Modifier
                    .weight(2f)
                    .padding(12.dp),
                shape = RoundedCornerShape(25.dp)
            ) {
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(32.dp)
                ) {
                    Text(
                        text = "Ethic",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        modifier = Modifier
                            .padding()
                            .fillMaxWidth()
                            .wrapContentSize(Alignment.Center)
                    )
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        OutlinedTextField(
                            value = ioegionEmailValue.value,
                            onValueChange = { ioegionEmailValue.value = it },
                            label = { Text(text = "Nome") },
                            placeholder = { Text(text = "Digite o nome") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                        )
                        OutlinedTextField(
                            value = pavniohPasswordValue.value,
                            onValueChange = { pavniohPasswordValue.value = it },
                            label = { Text(text = "Senha") },
                            placeholder = { Text(text = "Digite a senha") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                        )
                        Spacer(modifier = Modifier.padding(10.dp))
                        Button(onClick = {
                        },
                            modifier = Modifier.fillMaxWidth(1f).height(60.dp)) {
                            Text(text = "Entrar", fontWeight = FontWeight.Bold, fontSize = 20.sp)
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LoginEthicsTheme {
        WelcomeScreen()
    }
}