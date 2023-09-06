package Lab3.Test;


/**Ungulate - animal who has hooves*/
public class Ungulate extends Animals {
    //constructor with no arg
    Ungulate(){
        nickname="Unknown";
        weight=0;
        age=0;
        aviary = aviaryValue.notDefine;
    }
    //constructor with 2 args
    Ungulate(String name, double weightValue, int ageValue){
        nickname=name;
        weight=weightValue;
        age=ageValue;
        aviary = aviaryValue.aviaryWithoutGrid;
    }
    //constructor with another Ungulate
    Ungulate(Animals value){
        this.nickname= value.nickname;
        this.weight=value.weight;
        this.age=value.age;
        this.aviary=value.aviary;
    }
    //gives position to Ungulate
    public void Move(Ungulate withoutGridAviaries[][]){
        Boolean k=false;
        for(int i=0;i<withoutGridAviaries.length;i++) {
            for (int j = 0; j < withoutGridAviaries[i].length; j++) {
                if (withoutGridAviaries[i][j] == null) {
                    withoutGridAviaries[i][j] =new Ungulate(this);
                    k=true;
                    break;
                }
            }
            if(k==true){
                break;
            }
        }
    }
}
