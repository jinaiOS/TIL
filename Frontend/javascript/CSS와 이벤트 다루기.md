# CSS와 이벤트 다루기
- DOM을 조작하는 방법

# 태그를 가져오는 방법

```jsx
const timeElement = document.getElementById("time");

const timeElement = document.querySelector("h1");
const timeElement = document.querySelector("#time");
// id 는 # / class 는 . 으로 가져온다
```

```jsx
timeElement.style.color = "orange";
timeElement.innerText = "12:00";
```
<img width="173" alt="스크린샷 2024-08-09 오후 8 36 13" src="https://github.com/user-attachments/assets/1fb2273d-49b9-4c6e-aff2-610ae939d411">


```jsx
document.title = "hi";
```
![ezgif-5-a516e1925d](https://github.com/user-attachments/assets/8e55204c-0a90-4c1d-829d-9f48a40e96b0)


```jsx
function 클릭시_실행될_함수() {
  document.title = "hi";
  timeElement.style.color = "orange";
  timeElement.innerText = "12:00";
}

timeElement.addEventListener("click", 클릭시_실행될_함수);
```
