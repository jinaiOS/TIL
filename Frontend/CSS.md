# CSS (Cascading Style Sheets)
- 색상, 크기, 폰트, 레이아웃 등의 시각적인 표현
- 순차적으로 적용되는 스타일 시트 → 중복해서 작성하다 보면 나중에 거가 적용됨

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <style>
      div {
        /* internal 방식 */
        background-color: blue;
      }
    </style>
  </head>
  <body>
    <!-- inline 방식 -->
    <!-- <div style="background-color: red">hello world</div> -->
    <div>hello world</div>
    <!-- external 방식 -->
    <link rel="stylesheet" href="style.css" />
  </body>
</html>

가장 나중에 적용된 css가 반영됨 inline 방식이 최우선 적용 !important가
최최우선인데 웬만하면 쓰지 말자
```

```css
div {
  background-color: beige;
  font-size: 20px;
}
```
