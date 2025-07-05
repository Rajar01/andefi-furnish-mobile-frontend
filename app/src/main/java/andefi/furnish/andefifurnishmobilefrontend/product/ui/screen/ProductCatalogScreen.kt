package andefi.furnish.andefifurnishmobilefrontend.product.ui.screen

import andefi.furnish.andefifurnishmobilefrontend.R
import androidx.annotation.ColorInt
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.combinedClickable
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SearchBar
import androidx.compose.material3.SearchBarDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.graphics.ColorUtils
import coil3.compose.AsyncImage
import kotlin.math.absoluteValue

@ColorInt
fun String.toHslColor(saturation: Float = 0.5f, lightness: Float = 0.4f): Int {
    val hue = fold(0) { acc, char -> char.code + acc * 37 } % 360
    return ColorUtils.HSLToColor(floatArrayOf(hue.absoluteValue.toFloat(), saturation, lightness))
}

@Composable
fun GenericAvatarMonogram(
    id: String,
    firstName: String,
    lastName: String,
    modifier: Modifier = Modifier,
    size: Dp = 48.dp,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
) {
    Box(modifier.size(size), contentAlignment = Alignment.Center) {
        val color = remember(id, firstName, lastName) {
            val name = listOf(firstName, lastName).joinToString(separator = "").uppercase()
            Color("$id / $name".toHslColor())
        }
        val initials = (firstName.take(1) + lastName.take(1)).uppercase()
        Canvas(modifier = Modifier.size(30.dp)) {
            drawCircle(SolidColor(color))
        }
        Text(
            text = initials, style = textStyle, fontWeight = FontWeight.Bold, color = Color.White
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ProductCatalogScreen() {
    var expanded by rememberSaveable { mutableStateOf(false) }

    val animatedHorizontalPaddingInExpandedSearchBar by animateDpAsState(
        targetValue = if (expanded) 0.dp else 16.dp,
        animationSpec = tween(durationMillis = 300),
    )

    val animatedVerticalPaddingInExpandedSearchBar by animateDpAsState(
        targetValue = if (expanded) 0.dp else 4.dp,
        animationSpec = tween(durationMillis = 300),
    )

    Scaffold(
        topBar = {
            SearchBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        vertical = animatedVerticalPaddingInExpandedSearchBar,
                        horizontal = animatedHorizontalPaddingInExpandedSearchBar,
                    ),
                inputField = {
                    SearchBarDefaults.InputField(
                        query = "",
                        onQueryChange = {},
                        onSearch = { expanded = false },
                        expanded = expanded,
                        onExpandedChange = { expanded = it },
                        placeholder = { Text("Mulai pencarian Anda di sini...") },
                        leadingIcon = {
                            if (expanded) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.outline_arrow_back_24),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(24.dp)
                                        .clickable(
                                            onClick = {
                                                expanded = false
                                            })
                                )
                            } else {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_search_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                            }

                        },
                        trailingIcon = {
                            if (expanded) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_close_24),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .size(24.dp)
                                        .clickable(
                                            onClick = {
                                                expanded = false
                                            })
                                )

                            } else {
                                GenericAvatarMonogram(
                                    id = "1",
                                    firstName = "Awang",
                                    lastName = "Praja",
                                    modifier = Modifier
                                )
                            }
                        })
                },
                expanded = expanded, onExpandedChange = { expanded = it },
            ) {
                LazyColumn(modifier = Modifier.fillMaxWidth()) {
                    items(3) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .combinedClickable(onClick = { expanded = false }, onLongClick = {})
                                .padding(vertical = 8.dp)
                        ) {
                            Box(
                                contentAlignment = Alignment.Center, modifier = Modifier.size(48.dp)
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_history_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            Text(
                                "Lemari",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        HorizontalDivider()
                    }
                    items(2) { index ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .combinedClickable(onClick = { expanded = false }, onLongClick = {})
                                .padding(vertical = 8.dp)
                        ) {
                            Box(
                                contentAlignment = Alignment.Center, modifier = Modifier.size(48.dp)
                            ) {
                                Icon(
                                    imageVector = ImageVector.vectorResource(R.drawable.baseline_search_24),
                                    contentDescription = null,
                                    modifier = Modifier.size(24.dp)
                                )
                            }
                            Text(
                                "Lemari minimalis",
                                style = MaterialTheme.typography.bodyLarge,
                                fontWeight = FontWeight.Normal,
                                modifier = Modifier.weight(1f)
                            )
                        }
                        if (index < 1) HorizontalDivider()
                    }
                }
            }
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
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            LazyVerticalGrid(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(vertical = 20.dp, horizontal = 16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                items(100) {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        AsyncImage(
                            model = "https://placehold.co/400/png",
                            contentDescription = null,
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(186.dp)
                                .clip(MaterialTheme.shapes.medium)
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(4.dp),
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Text(
                                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum dictum dolor quis pharetra eleifend.",
                                style = MaterialTheme.typography.bodyMedium,
                                fontWeight = FontWeight.Normal,
                                maxLines = 2,
                                overflow = TextOverflow.Ellipsis
                            )
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    "Rp77.000",
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    "Rp90.000",
                                    style = MaterialTheme.typography.bodySmall,
                                    fontWeight = FontWeight.Normal,
                                    textDecoration = TextDecoration.LineThrough
                                )
                            }
                            Row(
                                horizontalArrangement = Arrangement.spacedBy(4.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth()
                            ) {

                                Box(
                                    contentAlignment = Alignment.Center,
                                    modifier = Modifier.size(16.dp)
                                ) {
                                    Icon(
                                        imageVector = ImageVector.vectorResource(R.drawable.baseline_star_24),
                                        contentDescription = null,
                                        modifier = Modifier.size(16.dp)
                                    )
                                }
                                Text(
                                    "4.9",
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Normal,
                                )
                                Box(
                                    modifier = Modifier
                                        .size(4.dp)
                                        .background(
                                            color = MaterialTheme.colorScheme.onSurface,
                                            shape = CircleShape
                                        ),
                                )
                                Text(
                                    "20 terjual",
                                    style = MaterialTheme.typography.bodyMedium,
                                    fontWeight = FontWeight.Normal,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}