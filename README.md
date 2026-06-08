# Java Coding Test

Java로 코딩 테스트 문제를 풀이하고 기록하는 저장소입니다.

## 디렉터리 구조

```text
.
├── solutions/
│   ├── inflearn/section01/problem01/Main.java
│   └── programmers/problem12944/
│       ├── Solution.java
│       └── Main.java
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

```bash
./scripts/new-inflearn.sh 1 3
```

위 명령은 `solutions/inflearn/section01/problem03/Main.java`를 만들고
`package inflearn.section01.problem03;`을 자동으로 추가합니다.

프로그래머스:

```bash
./scripts/new-programmers.sh 12944
```

## 실행하기

인프런 문제:

```bash
./scripts/run.sh solutions/inflearn/section01/problem01/Main.java
```

입력 파일 사용:

```bash
./scripts/run.sh solutions/inflearn/section01/problem01/Main.java input.txt
```

프로그래머스 문제는 제출용 `Solution.java`와 로컬 테스트용 `Main.java`를 함께 둡니다.

```bash
./scripts/run.sh solutions/programmers/problem12944/Main.java
```

`run.sh`는 선택한 파일과 같은 디렉터리의 Java 파일을 함께 컴파일합니다. 컴파일 결과는
임시 디렉터리에 생성하므로 저장소에 `.class` 파일을 남기지 않습니다.

## IntelliJ 설정

1. `solutions` 디렉터리를 우클릭합니다.
2. `Mark Directory as` → `Sources Root`를 선택합니다.
3. 실행할 `Main.java`의 `main` 메서드에서 Run 또는 Debug를 선택합니다.

문제마다 패키지가 다르므로 Sources Root를 다시 변경할 필요가 없습니다.

## 커밋 규칙

한 문제당 하나의 커밋을 권장합니다.

```text
solve: 인프런 section 1-1 문자 찾기
solve: 프로그래머스 12944 평균 구하기
refactor: 인프런 section 1-1 풀이 개선
```
