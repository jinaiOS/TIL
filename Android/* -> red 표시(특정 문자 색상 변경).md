# * -> red 표시(특정 문자 색상 변경)

```kotlin
// * -> red 표시
private fun highlightAsterisk(textView: TextView) {
    val text = textView.text.toString()
    val spannableString = SpannableString(text)
    var startIndex = text.indexOf("*")
    while (startIndex >= 0) {
        val endIndex = startIndex + 1
        spannableString.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(requireContext(), R.color.error)),
            startIndex,
            endIndex,
            Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
        )
        startIndex = text.indexOf("*", endIndex)
    }
    textView.text = spannableString
}
```
