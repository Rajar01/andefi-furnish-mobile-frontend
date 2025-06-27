package andefi.furnish.andefifurnishmobilefrontend.account.ui.screen

import andefi.furnish.andefifurnishmobilefrontend.R
import andefi.furnish.andefifurnishmobilefrontend.common.ui.theme.RobotoFamily
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun RegisterFillUpInformationScreen() {
    Scaffold(
        topBar = {
            Column {
                TopAppBar(
                    title = {
                        Text(
                            "Pendaftaran",
                            fontFamily = RobotoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 16.dp)
                        )
                    }, navigationIcon = {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.outline_arrow_back_24),
                            contentDescription = "Favorite Icon"
                        )
                    }, modifier = Modifier.padding(horizontal = 16.dp)
                )
                HorizontalDivider(
                    modifier = Modifier.fillMaxWidth(), thickness = 1.dp, color = Color.DarkGray
                )
            }
        },
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding)) {
            Column(
                verticalArrangement = Arrangement.spacedBy(24.dp),
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState(0))
                    .padding(horizontal = 16.dp, vertical = 24.dp)
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(4.dp),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Selamat Datang di Andefi Furnish",
                        fontFamily = RobotoFamily,
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp
                    )
                    Text(
                        "Mari mulai membuat akun Anda",
                        fontFamily = RobotoFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 16.sp
                    )
                }

                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            "Nama lengkap",
                            fontFamily = RobotoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp
                        )
                        OutlinedTextField(
                            value = "", onValueChange = {}, placeholder = {
                                Text(
                                    "Contoh: Peter Smith",
                                    fontFamily = RobotoFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 14.sp
                                )
                            }, modifier = Modifier.fillMaxWidth(), textStyle = TextStyle(
                                fontFamily = RobotoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp
                            )
                        )
                    }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            "Email",
                            fontFamily = RobotoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp
                        )
                        OutlinedTextField(
                            value = "", onValueChange = {}, placeholder = {
                                Text(
                                    "Contoh: email@address.com",
                                    fontFamily = RobotoFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 14.sp
                                )
                            }, modifier = Modifier.fillMaxWidth(), textStyle = TextStyle(
                                fontFamily = RobotoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp
                            )
                        )
                    }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            "Nomor telepon",
                            fontFamily = RobotoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp
                        )
                        OutlinedTextField(
                            value = "", onValueChange = {}, placeholder = {
                                Text(
                                    "Contoh: (+XXX) XXX-XXX-XXX",
                                    fontFamily = RobotoFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 14.sp
                                )
                            }, modifier = Modifier.fillMaxWidth(), textStyle = TextStyle(
                                fontFamily = RobotoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp
                            )
                        )
                    }
                    Column(
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(
                            "Kata sandi",
                            fontFamily = RobotoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp
                        )
                        OutlinedTextField(
                            value = "", onValueChange = {}, placeholder = {
                                Text(
                                    "Masukkan setidaknya 8 karakter",
                                    fontFamily = RobotoFamily,
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 14.sp
                                )
                            }, trailingIcon = {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_visibility_off_24),
                                    contentDescription = "Favorite Icon"
                                )
                            }, modifier = Modifier.fillMaxWidth(), textStyle = TextStyle(
                                fontFamily = RobotoFamily,
                                fontWeight = FontWeight.Normal,
                                fontSize = 14.sp
                            )
                        )
                    }
                }
                Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
                    Button(
                        onClick = { },
                        contentPadding = PaddingValues(16.dp),
                        shape = RoundedCornerShape(4.dp),
                        modifier = Modifier.fillMaxWidth(),
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color.White, containerColor = Color(0xFF807773)
                        )
                    ) {
                        Text(
                            "Daftar",
                            fontFamily = RobotoFamily,
                            fontWeight = FontWeight.Normal,
                            fontSize = 14.sp
                        )
                    }
                    Text(
                        "Sudah punya akun? Masuk",
                        fontFamily = RobotoFamily,
                        fontWeight = FontWeight.Normal,
                        fontSize = 14.sp
                    )
                }
            }
        }
    }
}