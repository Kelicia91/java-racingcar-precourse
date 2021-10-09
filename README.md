# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 구현할 기능 목록
- car : { 이름, 이동 거리 }
  - 이름 길이 검증
  - 이동
- car factory
  - 이름 리스트를 주면 car 리스트 반환
- winning cars
  - car 중 이동 거리 최대값 구하기
  - 특정 이동 거리를 갖는 car 리스트
  - 우승차 이름 리스트
- view
  - input
  - output
    - 이동하는 자동차
    - 우승차 이름 리스트 (','구분)
    - 오류
- racing
  - 시도 횟수 입력 및 실패 시 재시도
  - 시도 횟수 검증
  - 시도 횟수만큼 자동차들을 움직여 winning cars 반환
- game 
  - 게임 시작
  - car 이름 리스트 입력 및 실패 시 재시도

