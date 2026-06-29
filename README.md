# Java Coding Test

Java로 코딩 테스트 문제를 풀이하고 기록하는 저장소입니다.

## 디렉터리 구조

```text
.
├── solutions/
│   ├── inflearn/section01/problem01/Main.java
│   └── programmers/
│       ├── level1/problem12944/
│       │   ├── Solution.java
│       │   └── Main.java
│       └── level2/
├── templates/
│   ├── inflearn/Main.java
│   └── programmers/
│       ├── Solution.java
│       └── Main.java
└── scripts/
    ├── new-inflearn.sh
    ├── new-programmers.sh
    └── run.sh
```

`solutions`를 IntelliJ의 Sources Root로 한 번만 지정할 수 있도록 각 문제에 고유한
패키지를 사용합니다. 온라인 저지에 제출할 때는 첫 줄의 `package` 선언을 제외합니다.

`templates`에는 새 문제를 시작할 때 복사할 코드 골격만 둡니다. 실제 학습 결과는
모두 `solutions`에 저장합니다.

## 새 문제 시작하기

인프런:
./scripts/new-inflearn.sh <레벨> <문제번호>

프로그래머스:
./scripts/new-programmers.sh <레벨> <문제번호>

예시
./scripts/new-programmers.sh 1 12944


위 명령은 `templates/programmers`의 Java 파일을 복사해
`solutions/programmers/level1/problem12944/`를 만들고
`package programmers.level1.problem12944;`를 자동으로 추가합니다. 레벨은 `1` 또는
`level1`처럼 입력할 수 있습니다. 이미 같은 문제 폴더가 있으면 새로 만들지 않습니다.

## 커밋 규칙

한 문제당 하나의 커밋을 권장합니다.

```text
solve: 인프런 section 1-1 문자 찾기
solve: 프로그래머스 12944 평균 구하기
refactor: 인프런 section 1-1 풀이 개선
```
