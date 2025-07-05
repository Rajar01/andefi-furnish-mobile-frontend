package andefi.furnish.andefifurnishmobilefrontend.product.ui.screen

import andefi.furnish.andefifurnishmobilefrontend.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.carousel.HorizontalMultiBrowseCarousel
import androidx.compose.material3.carousel.HorizontalUncontainedCarousel
import androidx.compose.material3.carousel.rememberCarouselState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailsScreen() {
    Scaffold(topBar = {
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
        }, title = { })
    }, bottomBar = {
        BottomAppBar(contentPadding = PaddingValues(16.dp)) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(20.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                OutlinedButton(
                    onClick = { },
                    shape = MaterialTheme.shapes.small,
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                ) { Text("Beli sekarang") }
                Button(
                    onClick = { },
                    shape = MaterialTheme.shapes.small,
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 12.dp),
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth(),
                ) { Text("Masukkan keranjang") }
            }

        }
    }, contentWindowInsets = WindowInsets.safeContent, floatingActionButton = {
        FloatingActionButton(
            onClick = {}, modifier = Modifier.size(80.dp)
        ) {
            Icon(
                imageVector = ImageVector.vectorResource(R.drawable.baseline_camera_alt_24),
                contentDescription = null,
                modifier = Modifier.size(28.dp)
            )
        }
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .verticalScroll(rememberScrollState(0))
        ) {
            HorizontalMultiBrowseCarousel(
                state = rememberCarouselState { 10 },
                preferredItemWidth = 500.dp,
                itemSpacing = 12.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                AsyncImage(
                    model = "https://placehold.co/400/png",
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(360.dp)
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.Bottom
                ) {
                    Text(
                        "Rp77.000",
                        style = MaterialTheme.typography.titleLarge,
                        fontWeight = FontWeight.Bold,
                    )
                    Text(
                        "Rp90.0000",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Normal,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Text(
                        "31%",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                    )
                }
                Text(
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dictum dolor quis pharetra eleifend.",
                    style = MaterialTheme.typography.bodyMedium,
                    fontWeight = FontWeight.Normal,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier.size(16.dp)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_star_24),
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    Text(
                        "4.9 (150)", style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Normal,
                    )
                    Box(
                        modifier = Modifier
                            .size(4.dp)
                            .background(
                                color = MaterialTheme.colorScheme.onSurface, shape = CircleShape
                            ),
                    )
                    Text(
                        "200 terjual", style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Normal,
                    )
                }
            }
            HorizontalDivider()
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Spesifikasi & deskripsi produk",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                    )
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier.size(24.dp)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_arrow_forward_24),
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
                Column {
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
                Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                    Text(
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dictum dolor quis pharetra eleifend. Mauris fringilla gravida feugiat. Quisque eu erat id mi venenatis auctor. In justo ligula, bibendum a volutpat id, aliquam at turpis. Vestibulum dictum augue ut maximus faucibus.",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Normal,
                        maxLines = 5,
                        overflow = TextOverflow.Ellipsis
                    )
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "Baca selengkapnya", style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Normal,
                        )
                        Box(
                            contentAlignment = Alignment.Center, modifier = Modifier.size(16.dp)
                        ) {
                            Icon(
                                imageVector = ImageVector.vectorResource(R.drawable.baseline_arrow_forward_24),
                                contentDescription = null,
                                modifier = Modifier.size(16.dp)
                            )
                        }
                    }
                }
            }
            HorizontalDivider()
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp), modifier = Modifier.padding(16.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Rating & ulasan",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                    )
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier.size(24.dp)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_arrow_forward_24),
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
                Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier.size(16.dp)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.baseline_star_24),
                            contentDescription = null,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                    Text(
                        "4.9", style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold,
                    )
                    Box(
                        modifier = Modifier
                            .size(4.dp)
                            .background(
                                color = MaterialTheme.colorScheme.onSurface, shape = CircleShape
                            ),
                    )
                    Text(
                        "4.9", style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Normal,
                    )
                    Box(
                        modifier = Modifier
                            .size(4.dp)
                            .background(
                                color = MaterialTheme.colorScheme.onSurface, shape = CircleShape
                            ),
                    )
                    Text(
                        "200 terjual",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Normal,
                    )
                }
                HorizontalUncontainedCarousel(
                    state = rememberCarouselState { 10 },
                    itemWidth = 72.dp,
                    itemSpacing = 12.dp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                ) {
                    AsyncImage(
                        model = "https://placehold.co/400/png",
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier.maskClip(MaterialTheme.shapes.extraSmall)

                    )
                }
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text(
                        "Tomz",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Bold
                    )
                    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                        Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                            Box(
                                contentAlignment = Alignment.Center, modifier = Modifier.size(16.dp)
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_star_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                            Box(
                                contentAlignment = Alignment.Center, modifier = Modifier.size(16.dp)
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_star_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                            Box(
                                contentAlignment = Alignment.Center, modifier = Modifier.size(16.dp)
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_star_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                            Box(
                                contentAlignment = Alignment.Center, modifier = Modifier.size(16.dp)
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_star_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(16.dp)
                                )
                            }
                        }
                        Text(
                            "6 bulan lalu",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Normal
                        )
                    }
                    Text(
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dictum dolor quis pharetra eleifend. Mauris fringilla gravida feugiat. Quisque eu erat id mi venenatis auctor. In justo ligula, bibendum a volutpat id, aliquam at turpis. Vestibulum dictum augue ut maximus faucibus. Aliquam non urna eu arcu vehicula accumsan. Integer odio ante, dignissim non euismod in, laoreet a ligula. Donec ultricies ante ut ante tincidunt, et vulputate dolor viverra. Vivamus tempus vitae neque sed faucibus",
                        style = MaterialTheme.typography.bodyMedium,
                        fontWeight = FontWeight.Normal
                    )
                }
            }
        }
    }
}