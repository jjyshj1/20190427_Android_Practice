package com.example.a20190427_android_practice.datas;

public class PizzaStore {
    //가게이름, 동네(구), 영업시간(09:00~21:00), 로고파일

    public String storeName;
    public String location;
    public String openTime;
    public String imageURL; //웹상 이미지 주소 담을 변수

    //생성자는 alt키+insert키
    public PizzaStore(String storeName, String location, String openTime, String imageURL) {
        this.storeName = storeName;
        this.location = location;
        this.openTime = openTime;
        this.imageURL = imageURL;
    }
}
