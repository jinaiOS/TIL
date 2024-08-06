# CSS 선택자와 상태
<img width="285" alt="스크린샷 2024-08-06 오후 9 37 10" src="https://github.com/user-attachments/assets/c7b6ef54-87f3-4276-a9cb-38a3cf450f9e">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <div>
      <button>1번 버튼</button>
      <button>2번 버튼</button>
      <button>3번 버튼</button>
      <button>로그인</button>
      <button>뒤로가기</button>
    </div>
  </body>
</html>
```

<img width="285" alt="스크린샷 2024-08-06 오후 9 38 51" src="https://github.com/user-attachments/assets/1c22eb8a-4d4e-4a0f-a886-c53badaf5f4b">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      .btn {
        background-color: yellow;
      }
    </style>
  </head>
  <body>
    <div>
      <button class="btn">1번 버튼</button>
      <button class="btn">2번 버튼</button>
      <button class="btn">3번 버튼</button>
      <button class="btn">로그인</button>
      <button class="btn">뒤로가기</button>
    </div>
  </body>
</html>
```
<img width="289" alt="스크린샷 2024-08-06 오후 9 39 28" src="https://github.com/user-attachments/assets/f2c92758-62f3-4f43-be8b-c7aa8b12223e">


```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      .btn {
        background-color: yellow;
      }
      #btn-1 {
        background-color: red;
      }
    </style>
  </head>
  <body>
    <div>
      <button class="btn" id="btn-1">1번 버튼</button>
      <button class="btn">2번 버튼</button>
      <button class="btn">3번 버튼</button>
      <button class="btn">로그인</button>
      <button class="btn">뒤로가기</button>
    </div>
  </body>
</html>
```

- class 여러 개 줄 땐 띄어쓰기로 구분
    
    <img width="301" alt="스크린샷 2024-08-06 오후 9 41 37" src="https://github.com/user-attachments/assets/aa7041ef-0df4-47b6-83d9-e8cfd329c6bb">


```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      .btn {
        background-color: yellow;
      }
      #btn-1 {
        background-color: red;
      }
      .btn-blue {
        background-color: blue;
      }
    </style>
  </head>
  <body>
    <div>
      <button class="btn" id="btn-1">1번 버튼</button>
      <button class="btn btn-blue">2번 버튼</button>
      <button class="btn">3번 버튼</button>
      <button class="btn">로그인</button>
      <button class="btn">뒤로가기</button>
    </div>
  </body>
</html>
```
<img width="295" alt="스크린샷 2024-08-06 오후 9 44 10" src="https://github.com/user-attachments/assets/7d37acdf-9df3-455c-9286-c03f65fada08">


```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      button:nth-child(3) {
        background-color: blue;
      }
    </style>
  </head>
  <body>
    <div>
      <button class="btn" id="btn-1">1번 버튼</button>
      <button class="btn" id="btn-2">2번 버튼</button>
      <button class="btn" id="btn-3">3번 버튼</button>
      <button class="btn" id="btn-4">로그인</button>
      <button class="btn" id="btn-5">뒤로가기</button>
    </div>
  </body>
</html>
```

<img width="286" alt="스크린샷 2024-08-06 오후 9 44 59" src="https://github.com/user-attachments/assets/f94e1466-9eab-44ef-9668-7085a548ed1f">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      div button:nth-child(3) {
        background-color: blue;
      }
    </style>
  </head>
  <body>
    <div>
      <button class="btn" id="btn-1">1번 버튼</button>
      <button class="btn" id="btn-2">2번 버튼</button>
      <button class="btn" id="btn-3">3번 버튼</button>
      <button class="btn" id="btn-4">로그인</button>
      <button class="btn" id="btn-5">뒤로가기</button>
    </div>
    <main>
      <button class="btn" id="btn-1">1번 버튼</button>
      <button class="btn" id="btn-2">2번 버튼</button>
      <button class="btn" id="btn-3">3번 버튼</button>
      <button class="btn" id="btn-4">로그인</button>
      <button class="btn" id="btn-5">뒤로가기</button>
    </main>
  </body>
</html>
```

### 마우스 커서 댈 때 색상 변경

<img width="306" alt="스크린샷 2024-08-06 오후 9 51 53" src="https://github.com/user-attachments/assets/dc27010a-4b5d-490b-92c3-6c08c9e78896">

```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=<device-width>, initial-scale=1.0" />
    <title>Document</title>
    <style>
      div {
        margin-bottom: 20px;
      }
      div button:nth-child(3) {
        background-color: blue;
      }
      button {
        border: none;
        outline: none;
        background-color: black;
        color: white;
        padding: 5px 10px 5px 10px;
      }
      button:hover {
        background-color: tomato;
      }
    </style>
  </head>
  <body>
    <div>
      <button class="btn" id="btn-1">1번 버튼</button>
      <button class="btn" id="btn-2">2번 버튼</button>
      <button class="btn" id="btn-3">3번 버튼</button>
      <button class="btn" id="btn-4">로그인</button>
      <button class="btn" id="btn-5">뒤로가기</button>
    </div>
    <main>
      <button class="btn" id="btn-1">1번 버튼</button>
      <button class="btn" id="btn-2">2번 버튼</button>
      <button class="btn" id="btn-3">3번 버튼</button>
      <button class="btn" id="btn-4">로그인</button>
      <button class="btn" id="btn-5">뒤로가기</button>
    </main>
  </body>
</html>
```
