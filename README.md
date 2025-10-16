# java-calculator-precourse

# Test

- [x] failure
  - [x] 등록된 구분자가 아닌 경우
  - [x] 숫자가 아닌 값이 연산에 참여하는 경우
  - [x] 커스텀 구분자로 숫자를 넣은 경우
  - [x] 커스텀 구분자 등록 양식이 잘못된 경우
- [ ] success
  - [x] 커스텀 구분자가 없는 경우
  - [x] 커스텀 구분자를 사용한 경우
  - [x] -가 커스텀 구분자로 사용된 경우
  - [x] 이스케이프 문자가 커스텀 구분자로 사용된 경우
  - [x] 알파벳이 커스텀 구분자인 경우
  - [ ] 한글이 커스텀 구분자인 경우
  - [x] 구분자만 입력된 경우
  - [x] 커스텀 구분자에 공백이 들어간 경우

# Commit Convention

## Commit Form

```git
<type>(<scope>): <subject>

<body>

<footer>
```

### \<type>

| Allowed type | Description                          |
|:-------------|:-------------------------------------|
| feat         | feature                              |
| fix          | bug fix                              |
| docs         | documentation                        |
| style        | formatting, missing semi colons, ... |
| refactor     | refactoring                          |
| test         | when adding missing tests            |
| chore        | maintain                             |

### \<scope>

+ 변경이 발생한 파일이나 기능 영역을 명시.

### \<subject>

+ 명령문, 현재 시제로 작성한다.
+ 첫 글자를 대문자로 쓰지 않는다.
+ 끝에 마침표를 사용하지 않는다.

### \<body>

+ 명령문, 현재 시제로 작성한다.
+ 무엇을 바꿨고, 왜 바꿨는지, 이전과 뭐가 달라졌는지 기술한다.

### \<footer>

+ BREAKING CHANGE: 주요 변경과 마이그레이션 안내를 반드시 작성한다.
+ 관련 이슈는 `Closes #번호`로 별도 줄에 명시한다.

## Example

```git
feat($browser): onUrlChange event (popstate/hashchange/polling)

Added new event to $browser:
- forward popstate event if available
- forward hashchange event if popstate not available
- do polling when neither popstate nor hashchange available

Breaks $browser.onHashChange, which was removed (use onUrlChange instead)
```
