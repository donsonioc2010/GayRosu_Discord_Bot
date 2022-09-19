### What's This?
메이플 길드사람들과 같이 놀기위한 플젝, 제작중

### Language

- JDK 11
- Gradle
- JDA

### Issue List

1. onMessageReceived를 Override할 때 발생한 이슈 사항
    - 오류사항
   > Event로 들어온 객체를 getMessage를 통해 Message객체를 받은 이후 해당 Message의 getContentRaw()를 해서 문자열을 받을 경우 문자열이
   Null로 내용이 들어오지 않은 이슈
    - 해결방법
   > Discord의 Developer의 Bot에서 Message Content Intent옵션에 대하여 활성화가 필요함

2. 프로젝트를 실행할 경우 발생하는 SLF4J의 오류
    - 발생한 오류 로그
   ```
   SLF4J: Failed to load class "org.slf4j.impl.StaticLoggerBinder". 
   SLF4J: Defaulting to no-operation (NOP) logger implementation
   SLF4J: See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.
   SLF4J: Failed to load class "org.slf4j.impl.StaticMDCBinder".
   SLF4J: Defaulting to no-operation MDCAdapter implementation.
   SLF4J: See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details.
   ```
    - 오류사항
   > SLF4J에 대한 설정문제로 보임

    - 해결방법
   > [참고](###-참고한-링크들)의 SLF4J의 설정글 처럼 Gradle에서의 LOG추가 및 logback설정
3.

### Reference

- [JDA를 통한 기본 제작방법](https://www.youtube.com/watch?v=xJqjjPqvu_s&ab_channel=%EA%B0%9C%EB%B0%9C%EC%9E%90%ED%86%A0%EB%AF%B8)
- [JDA Repository](https://github.com/DV8FromTheWorld/JDA/tree/v4.3.0#documentation)
- [SLF4J의 설정](https://github.com/DV8FromTheWorld/JDA/wiki/Logging-Setup
  )