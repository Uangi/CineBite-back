</br>

## 💡 프로젝트 소개

#### ㅣ 요즘 핫한 영화 다모여라~ 🎇

#### ㅣ 영화 관련된 커뮤니티엔 뭘 말하는지 궁금하다고❓

### </br>🍿 CineBite '시네바이트' 에서 알려줄게 !

**"CineBite"** 는 **영화의 정보**(커뮤니티 포함)를 **통합적으로 제공하는 플랫폼**으로, 사용자들에게 작품 정보, 검색, 영화 즐겨찾기, 영화 추천 등을 한 곳에서 제공하는 것을 목표로 합니다.
</br>

---
💻 **참여인원**

| 이름   |  파트  | 역할 |
| --- | :----: | ---|
| 김지은 | BE, FE | 영화 tmdb api로 조회, 영화 상세정보, 랭킹, 오늘의 영화, 메인 css |
| 박진영 | BE | EC2, RDS 배포, 영화 정보 및 상세 정보 tmdb api 로 조회 상세정보, 영화 즐겨찾기, 영화 추천, 영화 즐겨찾기,css|
| 박 솔  | BE, FE | Oauth 로그인, 로그인 및 회원가입, 마이페이지 파일 업로드, 로그인 및 회원가입 css  |
| 윤수인 | BE, FE | 영화 및 커뮤니티 검색해서 조회 (최근검색어 · 연관검색어), 메인 · 검색 및 리뷰 css |
| 이혜민 | BE, FE | AWS S3 배포, 커뮤니티 게시글 및 태그 등록 및 삭제 , 인기 영화 조회, 커뮤니티 css |


<br>

---



## 💡TECH STACK
‍💻 Back-End<br/>

☑️Java 17<br/>
☑️SpringBoot<br/>
☑️AWS EC2 (UBUNTU)<br/>
☑️AWS RDS (MYSQL)<br/>
☑️AWS S3<br/>
☑️Spring Security<br/>
☑️Spring JPA<br/>
☑️카카오 Oauth<br/>
☑️Swagger<br/>
☑️Logging<br/>

‍💻Front-end<br/>

☑️React<br/>

---
<br/>

## 💡주요 기능 소개

☑️ **Ouath 구글·카카오·일반 로그인 / 회원가입**

🎞️ **메인) 핫한 영화 보여주기**

🎬 **영화 평가, 즐겨찾기 / 다른 사용자의 즐겨찾기 영화 목록 기반 작품 추천**

🔎 **작품**(영화명/배우/장르) 및 **커뮤니티**(태그/게시글) **검색 · 조회**

💬 **커뮤니티 작성 및 인기 게시글/태그 기능**


---

<br/>

## 💡 프로젝트 개요

<table>
    <tr>
        <th>프로젝트 명</th>
        <td>CineBite</td>
        <th>개발기간</th>
        <td>2024/06/03 ~ 2024/07/18</td>
    </tr>
    <tr>
        <th>프로젝트 개요</th>
        <td colspan="3"> 영화 커뮤니티 웹사이트</td>
    </tr>
    <tr>
        <th>개발인원</th>
        <td colspan="3">팀/ 5인 </td>
    </tr>
    <tr>
        <th>운영체제</th>
        <td colspan="3">Windows 10</td>
    </tr>
    <tr>
        <th>DB</th>
        <td colspan="3">MySQL (8.3.0)</td>
    </tr>
     <tr>
        <th>형상관리</th>
        <td colspan="3">Git ( dev 브랜치 전략)</td>
    </tr>
</table>
</br>

---
<br/>

## 💡 프로젝트 진행 상황
| 기능 | 개발기간 | 구현 | 담당자 |
|-----|	:----------:|--:|:-------|
| EC2, RDS 배포 설정  | 2024/06/01~2024/06/02 |  ✅ |진영
|  외부 Api 개발 | 2024/06/03~2024/06/11 | ✅|진영
| 영화 목록 기능 리팩토링| 2024/06/11~2024/06/23 | ✅|진영
| Swagger 적용 | 2024/06/16 | ✅|진영
| 영화 평가 기능 구현 | 2024/06/19/~2024/06/24 | ✅|진영
| 영화 즐겨찾기 기능 구현 | 2024/06/24~2024/07/01 | ✅|진영
| 영화 평가, 즐겨찾기 기능 리팩토링 | 2024/07/01~2024/07/05 | ✅|진영
| 영화 즐겨찾기 목록 기반 추천 구현 | 2024/07/05~2024/07/11 | ✅|진영
| 즐겨찾기 목록, 추천 기능 페이징 구현 | 2024/07/11~2024/07/14 | ✅|진영
| 전체적인 리팩토링, css 디자인 | 2024/07/14~2024/07/18 | ✅|진영
***
<br/>

</br>

![](https://velog.velcdn.com/images/jyp423/post/7d0a7ab3-15f7-4901-8b4d-9aaf076a4ded/image.gif)

## 💎 메인 페이지 구현화면
 1. 영화 웹사이트 tmdb에서 api를 활용해 영화들의 기본 정보를 가져와 보여줍니다.


---
<br/>

![](https://velog.velcdn.com/images/jyp423/post/7bf27102-c791-4340-a73f-a7b053cf226b/image.gif)
## 💎 상세정보 페이지 구현 및 영화 평가 기능
1. 즐겨찾기 목록에서 tmdb에서 활용한 api 로 클릭한 영화의 상세정보 페이지로 이동합니다.

2. '신선해요' 나 '썩었어요' 를 누르면 해당 영화의 평가점수에 반영됩니다. (이미 평가한 영화라면 평가를 삭제할 수 있습니다.)

3. 영화 점수가 50% 이하라면 '썩었어요'의 사진을 보여주고 50% 초과라면 '토마토 사진'을 보여줍니다. 단, 아무도 평가하지 않은 영화라면 '-'를 나타냅니다.

4. 평가 삭제하기 버튼을 누른다면 해당 영화에 대해 자신이 평가한 기록을 삭제할 수 있습니다.

5. 기존에 있던 평가 삭제 후 재평가를 하려면 60초가 지난 후에 평가할 수 있도록 했습니다.
(사용자가 언제든 임의로 평가를 조작할 수 있다면 해당 영화의 평가가 객관적이지 않게 될 거라 생각했기 때문에 시간제한을 걸어뒀습니다!)

---
<br/>

![](https://velog.velcdn.com/images/jyp423/post/1a895f2f-2d83-4f95-9df7-00aacfb7b40d/image.gif)

![](https://velog.velcdn.com/images/jyp423/post/a2d1824f-f8ec-4b02-a8fd-0ec49a4f4bdd/image.gif)

## 💎 즐겨찾기 목록에 영화 추가 및 삭제
1. 즐겨찾기 목록에서 임의의 영화의 삭제 버튼을 누르고 삭제한 영화의 상세 정보 페이지에 가면 즐겨찾기 버튼이 비활성화 되어있습니다.

2. 임의의 영화 상세정보 페이지에서 즐겨찾기 버튼을 누르면 활성화가 되며 해당 영화가 즐겨찾기 목록에 추가됩니다.
---
<br/>

![찜 추천](https://github.com/user-attachments/assets/d4b64339-9e35-4056-bf20-46571781b7ff)


## 💎 다른 사용자의 즐겨찾기 목록 기반 영화 추천 시스템
1. Jaccard 유사도를 활용해 나의 즐겨찾기 목록과 유사한 상위 5명의 다른 사용자들의 즐겨찾기 목록을 비교합니다.

2. 추천 페이지에서는 8개까지만 제한해서 추천해줍니다.

3. '비슷한 취향을 가진 회원님들이 즐겨본 영화' 버튼을 누르면 추천 영화의 전체 목록을 보여줍니다.


<br/>

---


