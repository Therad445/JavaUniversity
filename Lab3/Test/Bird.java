package Lab3.Test;

/**Bird - animal who fly*/
public class Bird extends Animals {
    //constructor with no arg
    Bird(){
        nickname="Unknown";
        weight=0;
        age=0;
        aviary = aviaryValue.notDefine;
    }
    //constructor with 2 args
    Bird(String name, double weightValue, int ageValue){
        nickname=name;
        weight=weightValue;
        age=ageValue;
        aviary = aviaryValue.aviaryWithGrid;
    }
    //constructor with another Bird
    Bird(Bird value){
        this.nickname= value.nickname;
        this.weight=value.weight;
        this.age=value.age;
        this.aviary=value.aviary;
    }

    //gives position to Bird
    public void Move(Bird withGridAviaries[][]){
        Boolean k=false;
        for(int i=0;i<withGridAviaries.length;i++) {
            for (int j = 0; j < withGridAviaries[i].length; j++) {
                if (withGridAviaries[i][j] == null) {
                    withGridAviaries[i][j] = new Bird(this);
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
