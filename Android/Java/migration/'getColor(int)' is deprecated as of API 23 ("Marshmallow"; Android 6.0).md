# 'getColor(int)' is deprecated as of API 23 ("Marshmallow"; Android 6.0)
- ResourcesCompat.getColor() 권장
- ContextCompat.getColor() 권장

# ContextCompat

```java
import androidx.core.content.ContextCompat;

// 리소스에서 색상 가져오기
int color = ContextCompat.getColor(context, R.color.my_color);
```

# ResourcesCompat

```java
import androidx.core.content.res.ResourcesCompat;

// 리소스에서 색상 가져오기
int color = ResourcesCompat.getColor(getResources(), R.color.my_color, null);
```
