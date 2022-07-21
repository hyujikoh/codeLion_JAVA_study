package org.example.untitled.tdi_0721.tdi2;
// 옵저버 패턴
class Main {
    public static void main(String[] args) {
        Button aButton = new Button();
        aButton.setClickEventListener(new 고양이());
        aButton.fireClick();
        // 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.
        aButton.setClickEventListener(new 개());
        aButton.fireClick();
        // 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.
        aButton.setClickEventListener(new 부엉이());
        // 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.
        aButton.fireClick();
    }
}
class 개{
    void 전달(){
        System.out.println("// 나(개)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }

    public void listen(String msg){
        전달();
    }
}
class 고양이{
    void 전달(){
        System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }

    public void listen(String msg){
        전달();
    }
}
class 부엉이{
    void 전달(){
        System.out.println("// 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }

}
class Button{
    Object aListener;
    void setClickEventListener (Object aListener){
        this.aListener=aListener;
    }
    void fireClick(){
        if(aListener instanceof 부엉이){
            ((부엉이)aListener).전달();
        }
        if(aListener instanceof 개){
            ((개)aListener).전달();
        }
        if(aListener instanceof 고양이){
            ((고양이)aListener).전달();
        }
    }
}