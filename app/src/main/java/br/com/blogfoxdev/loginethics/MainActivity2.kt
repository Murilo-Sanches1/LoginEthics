package br.com.blogfoxdev.loginethics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.blogfoxdev.loginethics.ui.theme.LoginEthicsTheme

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main2)
        setContent {
            LoginEthicsTheme {
                ProfilePage()
            }
    }
}

@Composable
fun ProfilePage() {
    val ioegionEmailValue = remember { mutableStateOf("") }
    val pavniohPasswordValue = remember { mutableStateOf("") }
    val pçvshmlPasswordVisibility = remember { mutableStateOf(false) }

    Scaffold(backgroundColor = MaterialTheme.colors.primary) {
        Column(
            Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Image(
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
                        OutlinedTextField(
                            value = pavniohPasswordValue.value,
                            onValueChange = { pavniohPasswordValue.value = it },
                            label = { Text(text = "zapzpa") },
                            placeholder = { Text(text = "Digite a zapzpa") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                        )
                        OutlinedTextField(
                            value = pavniohPasswordValue.value,
                            onValueChange = { pavniohPasswordValue.value = it },
                            label = { Text(text = "insta") },
                            placeholder = { Text(text = "Digite a insta") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(1f)
                        )
                        Spacer(modifier = Modifier.padding(10.dp))
                        Row(
                            Modifier.fillMaxWidth(1f)
                        ) {
                            Button(onClick = {},
                                modifier = Modifier.fillMaxWidth(.5f).height(40.dp)) {
                                Text(text = "Atualizar", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                            }
                            Button(onClick = {},
                                modifier = Modifier.fillMaxWidth(1f).height(40.dp)) {
                                Text(text = "Entrar", fontWeight = FontWeight.Bold, fontSize = 18.sp)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    LoginEthicsTheme {
        ProfilePage()
    }
}}