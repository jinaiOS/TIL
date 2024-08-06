# CSS 박스 모델
![스크린샷 2024-08-06 오후 8 33 53](https://github.com/user-attachments/assets/4368203a-e394-407b-a96b-97a47a509b56)

```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0">
    <title>Document</title>
    <style>
        div {
            width: 100px;
            height: 100px;
            background-color: aqua;
        }
        span {
            width: 100px;
            height: 100px;
            background-color: blueviolet;
        }
    </style>
</head>
<body>
    <div></div>
    <span></span>
</body>
</html>
```

- span 태그는 display inline이라는 속성을 가지고 있다. block으로 변경하면 보이게 된다.
- inline은 높이와 너비를 갖지 않는다.

# CSS 박스 모델

- contents - padding - border - margin
<img width="321" alt="스크린샷 2024-08-06 오후 8 41 21" src="https://github.com/user-attachments/assets/d8af084f-f9a2-4fbd-ad8e-26f9fd40ab72">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      div {
        width: 100px;
        height: 100px;
        background-color: aqua;
      }
    </style>
  </head>
  <body>
    <div>♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷</div>
  </body>
</html>
```
<img width="438" alt="스크린샷 2024-08-06 오후 8 42 19" src="https://github.com/user-attachments/assets/ffde8474-0e00-41b6-95b9-7f0d531a72c3">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      div {
        width: 100px;
        height: 100px;
        background-color: aqua;
        padding: 100px;
      }
    </style>
  </head>
  <body>
    <div>♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷</div>
  </body>
</html>
```
<img width="469" alt="스크린샷 2024-08-06 오후 8 43 07" src="https://github.com/user-attachments/assets/3d24018d-f609-4230-82a5-a0d1c2c6df5c">


```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      div {
        width: 100px;
        height: 100px;
        background-color: aqua;
        padding: 100px;
        margin: 30px;
      }
    </style>
  </head>
  <body>
    <div>♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷</div>
  </body>
</html>

```
<img width="455" alt="스크린샷 2024-08-06 오후 8 43 36" src="https://github.com/user-attachments/assets/eb5c8dcb-b0f6-4c97-8555-2d7b584a9ee9">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      div {
        width: 100px;
        height: 100px;
        background-color: aqua;
        padding: 100px;
        margin: 30px;
        border: 1px solid black;
      }
    </style>
  </head>
  <body>
    <div>♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷</div>
  </body>
</html>

```

## border

- solid, dashed, ridge, thick, double 등

## 위 아래 떨어뜨리기

<img width="488" alt="스크린샷 2024-08-06 오후 8 47 32" src="https://github.com/user-attachments/assets/e09d427f-6f0f-4048-9b33-545e356f3025">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      div {
        width: 250px;
        height: 50px;
        background-color: aqua;
        padding: 100px;
        margin-bottom: 100px;
        border: 10px ridge black;
      }
    </style>
  </head>
  <body>
    <div>♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷</div>
    <div>♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷♡̷̷̷</div>
  </body>
</html>
```
