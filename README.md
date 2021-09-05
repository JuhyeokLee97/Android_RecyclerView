# RecyclerView & RecyclerView Adapter Example

축구 선수의 이름, 포지션  그리고 번호를 입력 받아서 “저장하기” 버튼을 눌렀을 때, 선수의 정보를 RecyclerView를 통해 나타내는 예제입니다.


# 실행화면 
![demo](https://user-images.githubusercontent.com/40654227/132125298-6fbaad9a-3109-41a5-b4f1-3fb8babcfe7a.gif)


## MainActivity Layout: activity_main.xml 작성 
축구 선수의 이름, 포지션  그리고 번호를 입력 받아서 “저장하기” 버튼을 눌렀을 때, RecyclerView에 정보가 보여지는 레이아웃입니다.
!(main_UI)(C:/Users/juhyeok/Desktop/Study/Android Layout or View/RecyclerView Main UI.jpg)

RecycerView  속성 중 “app:layoutManager”은 RecyclerView에서 아이템들을 어떤 형태로 보여줄 지 정보를 담는 중요한 속성입니다. 이번 예제에서는 “LinearLayoutManager”를 사용해 일렬로 나타내 보겠습니다.

## RecyclerView ItemLayout: item_view.xml 작성

“res/layout” 디렉토리에 “Layout Resource File”을 생성합니다. 파일 이름은 “item_view”로 했습니다.
하나의 줄에 선수의 이름, 포지션 그리고 번호를 보여주기 위해 LinearLayout 안에 3개의 TextView를 사용했습니다.

## Init View: MainActivity 작성 

“res/layout/activity_main.xml” 에서 만든 View들을 사용하기 위해 변수들을 초기화 합니다.

## SoccerPlayer.class
사용자에게 입력 받을 선수 이름, 포지션, 번호 데이터를 저장할 수 있는 SoccerPlayer.Class를 만듭니다.
MainActivity.kt와 같은 위치에 생성하면 됩니다.

## SoccerPlayer 저장

MainActivity.kt에 저장하기 버튼이 눌렸을 때, SoccerPlayer 객체를 playerList에 저장하도록 btnAddPlayer의 setOnClickListener를 정의해줍니다.

## Adapter 생성


RecyclerView에 데이터를 연결해주기 위해서 Adapter를 생성(MainActivity.kt와 같은 위치)합니다. 연결해줄 데이터인 playerList를 인자로 받아서 ReclcyerView.Adpater  구현에 필요한 ViewHolder를 구현하고 override 함수인 onCreateViewHolder, onBindViewHolder, getItemCount를 구현합니다.

추가적으로 버튼이 눌렸을 때 입력 받을 선수데이터를 playerList에 삽입하고 RecyclerView에 데이터를 업데이트 해줄 addItem을 구현합니다.

##  RecyclerView에 Adapter 연결하기
축구 선수 데이터를 갖는 playerList를 인자로 MyRecyclerViewAdapter()를 생성하여 recyclerView.adapter에 연결합니다.
그리고 저장하기 버튼의 setOnClickListener에서 playerList에 직접 데이터를 삽입하지 않고 adapter.addItem()을 이용해서 데이터를 삽입하고 recyclerView에 보여지도록 합니다.


## RecyclerView Adaper 이해하기 

추가적으로 ViewHolder와 각 함수들이 왜 필요한지를 제 생각을 담아 정리했습니다. 정답은 아니겠지만 이해하는데 참고하시면 도움이 될 것 같습니다.
![Adapter Structure](https://user-images.githubusercontent.com/40654227/132125500-7ab3af5f-8b35-4491-888a-42125ceaec9d.png)
