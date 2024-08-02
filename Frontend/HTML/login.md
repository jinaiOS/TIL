<img width="191" alt="스크린샷 2024-08-02 오후 6 06 18" src="https://github.com/user-attachments/assets/e01fbc3e-66d5-4525-aa59-5ad347ca3856">


```html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
  </head>
  <body>
    <form>
      <h2>이메일로 가입</h2>
      <div><label for="email-input">이메일</label></div>
      <div>
        <input
          id="email-input"
          required
          placeholder="이메일을 입력해 주세요."
          type="email"
        />
      </div>
      <div><label for="password-input">비밀번호</label></div>
      <div>
        <input
          id="password-input"
          required
          placeholder="비밀번호를 입력해 주세요."
          type="password"
        />
      </div>
      <div><label for="password2-input">비밀번호 확인</label></div>
      <div>
        <input
          id="password2-input"
          required
          placeholder="비밀번호를 재입력해 주세요."
          type="password"
        />
      </div>
      <div><label for="name-input">이름</label></div>
      <div>
        <input
          id="name-input"
          required
          placeholder="이름을 입력해 주세요."
          type="text"
        />
      </div>
      <div><label for="phone-input">휴대폰 번호</label></div>
      <div>
        <input
          id="phone-input"
          required
          placeholder="휴대폰 번호를 입력해 주세요."
          type="number"
        />
      </div>
      <div>
        <label for="checkbox-input">여기를 체크해 주세요.</label>
        <input id="checkbox-input" type="checkbox" />
      </div>
      <div>
        <input type="submit" />
      </div>
    </form>
  </body>
</html>
```
