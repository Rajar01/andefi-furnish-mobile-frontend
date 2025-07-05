package andefi.furnish.andefifurnishmobilefrontend.order.ui.screen

import andefi.furnish.andefifurnishmobilefrontend.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContent
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatusFilterBottomSheet() {
    ModalBottomSheet(
        onDismissRequest = { },
        sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier.size(24.dp)
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.baseline_close_24),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Text(
                    "Status",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                )
            }
            HorizontalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    "Semua",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f),
                )
                Checkbox(
                    checked = false,
                    onCheckedChange = { },
                )
            }
            HorizontalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    "Belum dibayar",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f),
                )
                Checkbox(
                    checked = false,
                    onCheckedChange = { },
                )
            }
            HorizontalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    "Dikemas",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f),
                )
                Checkbox(
                    checked = false,
                    onCheckedChange = { },
                )
            }
            HorizontalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    "Dikirim",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f),
                )
                Checkbox(
                    checked = false,
                    onCheckedChange = { },
                )
            }
            HorizontalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    "Selesai",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f),
                )
                Checkbox(
                    checked = false,
                    onCheckedChange = { },
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderIntervalFilterBottomSheet() {
    ModalBottomSheet(
        onDismissRequest = { },
        sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
    ) {
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    contentAlignment = Alignment.Center, modifier = Modifier.size(24.dp)
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.baseline_close_24),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                }
                Text(
                    "Tanggal pesanan",
                    style = MaterialTheme.typography.titleMedium,
                    fontWeight = FontWeight.Bold,
                )
            }
            HorizontalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    "Semua",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f),
                )
                Checkbox(
                    checked = false,
                    onCheckedChange = { },
                )
            }
            HorizontalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    "30 hari terakhir",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f),
                )
                Checkbox(
                    checked = false,
                    onCheckedChange = { },
                )
            }
            HorizontalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    "60 hari terakhir",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f),
                )
                Checkbox(
                    checked = false,
                    onCheckedChange = { },
                )
            }
            HorizontalDivider()
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    "90 hari terakhir",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.weight(1f),
                )
                Checkbox(
                    checked = false,
                    onCheckedChange = { },
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrderCatalogScreen() {
    val isOrderEmpty by remember {
        mutableStateOf(true)
    }

    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    Box(
                        contentAlignment = Alignment.Center, modifier = Modifier.size(48.dp)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(R.drawable.outline_arrow_back_24),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                },
                title = { Text("Pesanan") },
            )
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
        contentWindowInsets = WindowInsets.safeContent,
    ) { paddingValues ->
        if (isOrderEmpty) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {
                Column(
                    verticalArrangement = Arrangement.spacedBy(12.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    AsyncImage(
                        model = "https://placehold.co/400/png",
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .size(100.dp)
                            .clip(MaterialTheme.shapes.extraSmall)
                    )
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(4.dp),
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Text(
                            "Belum ada pesanan",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center
                        )
                        Text(
                            "Kamu mau beli apa? Temukan barang yang kamu mau di Andefi",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center
                        )
                    }
                    Button(
                        onClick = { },
                        shape = MaterialTheme.shapes.medium,
                        contentPadding = PaddingValues(
                            horizontal = 16.dp, vertical = 8.dp
                        ),
                    ) { Text("Mulai belanja") }
                }
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {
                item {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
                    ) {
                        FilterChip(
                            selected = false,
                            onClick = {},
                            label = { Text("Status") },
                            trailingIcon = {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_arrow_drop_down_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(20.dp)
                                )
                            }

                        )
                        FilterChip(
                            selected = false,
                            onClick = { },
                            label = { Text("Tanggal pesanan") },
                            trailingIcon = {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_arrow_drop_down_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(20.dp)
                                )
                            }

                        )
                    }
                }
                items(5) {
                    OutlinedCard(modifier = Modifier.padding(horizontal = 16.dp)) {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(12.dp),
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp)
                        ) {
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                                ) {
                                    Icon(
                                        imageVector = ImageVector.vectorResource(R.drawable.baseline_shopping_bag_24),
                                        contentDescription = null,
                                        modifier = Modifier.size(32.dp)
                                    )
                                    Column() {
                                        Text(
                                            "Belanja",
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Normal,
                                        )
                                        Text(
                                            "21 Januari 2025",
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Normal,
                                        )
                                    }
                                }
                                Text(
                                    "Selesai",
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Normal,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer,
                                    modifier = Modifier
                                        .clip(
                                            MaterialTheme.shapes.extraSmall
                                        )
                                        .background(MaterialTheme.colorScheme.primaryContainer)
                                        .padding(horizontal = 8.dp, vertical = 4.dp)

                                )
                            }
                            HorizontalDivider()
                            Column(
                                verticalArrangement = Arrangement.spacedBy(8.dp),
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    AsyncImage(
                                        model = "https://placehold.co/400/png",
                                        contentDescription = null,
                                        contentScale = ContentScale.FillBounds,
                                        modifier = Modifier
                                            .size(72.dp)
                                            .clip(MaterialTheme.shapes.extraSmall)
                                    )
                                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                        Text(
                                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dictum dolor quis pharetra eleifend. ",
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Normal,
                                            maxLines = 2,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                        Text(
                                            "3 x Rp450.000",
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Normal,
                                        )
                                    }
                                }
                                Row(
                                    horizontalArrangement = Arrangement.spacedBy(8.dp),
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier.fillMaxWidth()
                                ) {
                                    AsyncImage(
                                        model = "https://placehold.co/400/png",
                                        contentDescription = null,
                                        contentScale = ContentScale.FillBounds,
                                        modifier = Modifier
                                            .size(72.dp)
                                            .clip(MaterialTheme.shapes.extraSmall)
                                    )
                                    Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                                        Text(
                                            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dictum dolor quis pharetra eleifend. ",
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Normal,
                                            maxLines = 2,
                                            overflow = TextOverflow.Ellipsis,
                                        )
                                        Text(
                                            "3 x Rp450.000",
                                            style = MaterialTheme.typography.bodyMedium,
                                            fontWeight = FontWeight.Normal,
                                        )
                                    }
                                }
                            }
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Column {
                                    Text(
                                        "Total belanja",
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.Normal
                                    )
                                    Text(
                                        "Rp300.000",
                                        style = MaterialTheme.typography.bodyMedium,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                                OutlinedButton(
                                    onClick = { },
                                    shape = MaterialTheme.shapes.medium,
                                    contentPadding = PaddingValues(
                                        horizontal = 12.dp, vertical = 4.dp
                                    ),
                                ) { Text("Selengkapnya") }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(16.dp))
                }
            }
        }
        // OrderIntervalFilterBottomSheet()
    }
}