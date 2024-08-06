# flexbox와 position
<img width="386" alt="스크린샷 2024-08-06 오후 9 15 45" src="https://github.com/user-attachments/assets/7dd951bc-f4cb-486d-981d-97e6e9823475">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      div {
        display: inline-block;
        /* 박스가 흐트러지는 경우가 생김 */
        width: 50px;
        height: 50px;
        background-color: yellowgreen;
      }
    </style>
  </head>
  <body>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
  </body>
</html>
```

# flex

- 반응형으로 화면을 줄여도 비율에 맞게 줄어듬
<img width="499" alt="스크린샷 2024-08-06 오후 9 16 43" src="https://github.com/user-attachments/assets/bcf97844-170d-4ab5-884b-3d2f0bc8e152">


```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      body {
        display: flex;
      }
      div {
        width: 50px;
        height: 50px;
        margin: 10px;
        background-color: yellowgreen;
      }
    </style>
  </head>
  <body>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
  </body>
</html>
```

# justify-content

- 가로축을 기준으로 정렬

<img width="1258" alt="스크린샷 2024-08-06 오후 9 18 022" src="https://github.com/user-attachments/assets/acd9fa7a-da53-45bf-8060-907652b6f90d">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      body {
        display: flex;
        justify-content: center;
      }
      div {
        width: 50px;
        height: 50px;
        margin: 10px;
        background-color: yellowgreen;
      }
    </style>
  </head>
  <body>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
  </body>
</html>
```

# align-items

- 세로축을 기준으로 정렬
<img width="1268" alt="스크린샷 2024-08-06 오후 9 19 252" src="https://github.com/user-attachments/assets/b9d68daf-31ce-4eba-940f-2df95f9d4ba3">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      body {
        height: 500px;
        border: 1px solid gray;
        display: flex;
        justify-content: center;
        align-items: center;
      }
      div {
        width: 50px;
        height: 50px;
        margin: 10px;
        background-color: yellowgreen;
      }
    </style>
  </head>
  <body>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
  </body>
</html>
```

# flex-direction

- main axis 기준으로 배치하는 옵션

<img width="1259" alt="스크린샷 2024-08-06 오후 9 2233 19" src="https://github.com/user-attachments/assets/1749ef3d-d329-4196-94db-222c6a8a0d79">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      body {
        height: 500px;
        border: 1px solid gray;
        display: flex;
        flex-direction: column;
        justify-content: center;
        align-items: center;
      }
      div {
        width: 50px;
        height: 50px;
        margin: 10px;
        background-color: yellowgreen;
      }
    </style>
  </head>
  <body>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
    <div></div>
  </body>
</html>
```

# 박스 가운데로 옮기기

<img width="217" alt="스크린샷 2024-08-06 오후 9 26 52" src="https://github.com/user-attachments/assets/c9b4a803-de34-4b72-b103-e6954def41b8">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      main {
        width: 200px;
        height: 200px;
        border: 1px solid red;
      }
      div {
        width: 50px;
        height: 50px;
        background-color: tomato;
      }
    </style>
  </head>
  <body>
    <main>
      <div></div>
    </main>
  </body>
</html>
```

## position absolute

- body를 기준으로 배치 되게 됨
- 상위 옵션 중에 relative 옵션을 가지고 있는 기준으로 배치 됨
    
    <img width="211" alt="스크린샷 2024-08-06 오후 9 30 33" src="https://github.com/user-attachments/assets/f0f93fa4-f3a5-4240-9ed8-3971f8965ef9">


```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      main {
        width: 200px;
        height: 200px;
        border: 1px solid red;
        position: relative;
      }
      div {
        width: 50px;
        height: 50px;
        background-color: tomato;
        position: absolute;
        top: 10px;
        left: 20px;
      }
    </style>
  </head>
  <body>
    <main>
      <div></div>
    </main>
  </body>
</html>
```

## 스크롤 내려도 따라다님 floating
<img width="243" alt="스크린샷 2024-08-06 오후 9 32 57" src="https://github.com/user-attachments/assets/ebb3af20-fe19-49b6-a8de-45d056cdeac3">


```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      main {
        width: 200px;
        height: 1500px;
        border: 1px solid red;
      }
      div {
        width: 50px;
        height: 50px;
        background-color: tomato;
        position: fixed;
      }
    </style>
  </head>
  <body>
    <main>
      <div></div>
    </main>
  </body>
</html>
```
