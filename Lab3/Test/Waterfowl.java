package Lab3.Test;


/**Waterfowl - animal who swim*/
public class Waterfowl extends Animals {
    //constructor with no arg
    Waterfowl(){
        //nickname
        nickname="Unknown";
        //weight
        weight=0;
        //age
        age=0;
        //type of aviary
        aviary = aviaryValue.notDefine;
    }
    //constructor with 2 args
    Waterfowl(String name, double weightValue, int ageValue){
        nickname=name;
        weight=weightValue;
        age=ageValue;
        aviary = aviaryValue.aquarium;
    }
    //constructor with another Waterfowl
    Waterfowl(Waterfowl value){
        this.nickname= value.nickname;
        this.weight=value.weight;
        this.age=value.age;
        this.aviary=value.aviary;
    }

    //gives position to Waterfowl
    public void Move(Waterfowl aquariumAviaries[][]){
        Boolean k=false;
        for (int i = 0; i < aquariumAviaries.length; i++) {
            for (int j = 0; j < aquariumAviaries[i].length; j++) {
                if (aquariumAviaries[i][j] == null) {
                    aquariumAviaries[i][j] = new Waterfowl(this);
                    k = true;
                    break;
                }
            }
            if(k == true){
                break;
            }
        }
    }

}
