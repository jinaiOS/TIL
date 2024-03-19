# image file 크기 낮추기
```kotlin
fun makeFileFromImageUri(uri: Uri, context: Context): ByteArray? {
    val inputStream: InputStream? = context.contentResolver.openInputStream(uri)
    val originalBitmap = BitmapFactory.decodeStream(inputStream)

    // Calculate the new size you want
    val maxImageSize = 1024 // Use the size you want to scale
    val ratio = Math.min(
        maxImageSize.toDouble() / originalBitmap.width,
        maxImageSize.toDouble() / originalBitmap.height
    )
    val width = (ratio * originalBitmap.width).toInt()
    val height = (ratio * originalBitmap.height).toInt()

    // Resize the Bitmap
    val resizedBitmap = Bitmap.createScaledBitmap(originalBitmap, width, height, true)
    
    // Convert the resized Bitmap back to ByteArray
    val stream = ByteArrayOutputStream()
    resizedBitmap.compress(Bitmap.CompressFormat.JPEG, 80, stream) // You can control the quality

    val byteArray = stream.toByteArray()

    // Cleanup
    originalBitmap.recycle()
    resizedBitmap.recycle()
    stream.close()
    inputStream?.close()

    return byteArray
}

```
