package andefi.furnish.andefifurnishmobilefrontend.product.ui.screen

import andefi.furnish.andefifurnishmobilefrontend.R
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListOfProductCategoryScreen() {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Kategori") })
        },
        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = true, label = { Text("Beranda") },
                    onClick = { },
                    icon = {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_search_24),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    },
                )
                NavigationBarItem(
                    selected = false, label = { Text("Kategori") },
                    onClick = { },
                    icon = {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_category_24),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    },
                )
                NavigationBarItem(
                    selected = false, label = { Text("Keranjang") },
                    onClick = { },
                    icon = {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_shopping_cart_24),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    },
                )
                NavigationBarItem(
                    selected = false, label = { Text("Pesanan") },
                    onClick = { },
                    icon = {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_discount_24),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    },
                )
            }
        },
        contentWindowInsets = WindowInsets.safeContent
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            items(20) { index ->
                Row(modifier = Modifier.padding(16.dp)) {
                    Text(
                        "Furniture Listings",
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.weight(1f)
                    )
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier.size(24.dp)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_arrow_forward_24),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
                if (index < 19)
                    HorizontalDivider()
            }
        }
    }
}