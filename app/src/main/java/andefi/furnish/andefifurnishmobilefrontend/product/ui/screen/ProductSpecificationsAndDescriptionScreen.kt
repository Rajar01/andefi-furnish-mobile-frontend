package andefi.furnish.andefifurnishmobilefrontend.product.ui.screen

import andefi.furnish.andefifurnishmobilefrontend.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductSpecificationsAndDescriptionScreen() {
    Scaffold(
        topBar = {
            TopAppBar(navigationIcon = {
                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier.size(48.dp)
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.outline_arrow_back_24),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }, title = { Text("Spesifikasi & deskripsi produk") })
        },
        contentWindowInsets = WindowInsets.safeContent
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .verticalScroll(rememberScrollState(0))
        ) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp),
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                AsyncImage(
                    model = "https://placehold.co/400/png",
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(72.dp)
                        .clip(MaterialTheme.shapes.extraSmall)
                )
                Text(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dictum dolor quis pharetra eleifend.",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Normal,
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(
                    "Spesifikasi produk",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                )
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Text(
                            "Warna", modifier = Modifier.width(200.dp),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Normal,
                        )
                        Text(
                            "Cokelat",
                            modifier = Modifier.fillMaxWidth(),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Normal,
                        )
                    }
                    HorizontalDivider()
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Text(
                            "Ukuran",
                            modifier = Modifier.width(200.dp),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Normal,
                        )
                        Text(
                            "100 cm",
                            modifier = Modifier.fillMaxWidth(),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Normal,
                        )
                    }
                    HorizontalDivider()
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 4.dp)
                    ) {
                        Text(
                            "Berat",
                            modifier = Modifier.width(200.dp),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Normal,
                        )
                        Text(
                            "44 kg",
                            modifier = Modifier.fillMaxWidth(),
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Normal,
                        )
                    }
                }
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            ) {
                Text(
                    "Deskripsi produk", style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Bold,
                )
                Text(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dictum dolor quis pharetra eleifend. Mauris fringilla gravida feugiat. Quisque eu erat id mi venenatis auctor. In justo ligula, bibendum a volutpat id, aliquam at turpis. Vestibulum dictum augue ut maximus faucibus. Aliquam non urna eu arcu vehicula accumsan. Integer odio ante, dignissim non euismod in, laoreet a ligula. Donec ultricies ante ut ante tincidunt, et vulputate dolor viverra. Vivamus tempus vitae neque sed faucibus. Nullam lacinia finibus gravida. Pellentesque facilisis, nulla id hendrerit sollicitudin, justo tellus lobortis enim, in rhoncus lectus orci et lacus. Proin sed dolor sed dui lobortis consectetur. Phasellus congue, justo ut elementum vestibulum, dolor sem laoreet nisi, et iaculis tellus massa a lorem. Vestibulum dolor felis, imperdiet sit amet ligula nec, imperdiet rutrum quam. Vivamus sed dui ante.\n" +
                            "\n" +
                            "Cras non sollicitudin urna, et tincidunt dolor. In non augue sit amet lectus mattis venenatis non in urna. Nunc et ante vitae eros consequat consequat. Nam vitae tortor elit. Duis ante purus, lacinia et cursus quis, consequat sit amet dui. Nunc non scelerisque lorem. Proin nec massa eu eros ultrices venenatis. Duis vestibulum ipsum metus, sed vehicula ante bibendum at. Suspendisse dui leo, rhoncus sit amet egestas in, sodales non justo. Proin cursus leo id sapien fringilla consectetur. Maecenas consectetur eleifend dolor dignissim sodales. Phasellus malesuada congue blandit.",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Normal,
                )
            }
        }
    }
}