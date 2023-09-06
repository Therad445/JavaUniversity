package ru.miet.islamov.Lab4.Test;

/**animals - basic class*/
public class Animals {
    //nickname
    protected String nickname;
    //weight
    protected double weight;
    //age
    protected int age;
    //aviary
    protected aviaryValue aviary;
    //enum for aviaries
    protected enum aviaryValue{notDefine,aquarium,aviaryWithGrid,aviaryWithoutGrid,aviaryWithInfraredLight};

    //constructor with no arg
    Animals(){
        nickname="Unknown";
        weight=0;
        age=0;
        aviary = aviaryValue.notDefine;
    }
    //constructor with 3 args
    Animals(String nick, double weightValue, int ageValue){
        nickname=nick;
        weight=weightValue;
        age=ageValue;
        aviary = aviaryValue.notDefine;
    }
    //constructor with another Animal
    Animals(Animals value){
        this.nickname=value.nickname;
        this.weight=value.weight;
        this.age=value.age;
        this.aviary=value.aviary;
    }

    //set nickname
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    //set weight
    public void setWeight(double weight) {
        this.weight = weight;
    }

    //set age
    public void setAge(int age) {
        this.age = age;
    }

    //get nickname
    public String getNickname() {
        return nickname;
    }

    //get age
    public int getAge() {
        return age;
    }

    //get weight
    public double getWeight() {
        return weight;
    }

    //show as String
    public String toString() {
        return "nickname: "+nickname+ "|\t" +"weight: " + weight + "|\t" + "age: " + age +  "|\t" + "aviary: " + aviary;
    }

    public String toShortString() {
        return nickname + " " + weight + " " + age + " " + aviary;
    }

    //gives position to animal
    public void Move(Animals notDefineAviaries[][]){
        Boolean k=false;
        for(int i=0;i<notDefineAviaries.length;i++) {
            for (int j = 0; j < notDefineAviaries[i].length; j++) {
                if (notDefineAviaries[i][j] == null) {
                    notDefineAviaries[i][j] = this;
                    k =true;
                    break;
                }
            }
            if(k==true){
                break;
            }
        }
    }
}


