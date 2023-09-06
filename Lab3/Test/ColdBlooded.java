package Lab3.Test;

/**ColdBlooded - animal who has cold blood*/
public class ColdBlooded extends Animals {
    //constructor with no arg
    ColdBlooded(){
        nickname="Unknown";
        weight=0;
        age=0;
        aviary = aviaryValue.notDefine;
    }
    //constructor with 2 args
    ColdBlooded(String name, double weightValue, int ageValue){
        nickname=name;
        weight=weightValue;
        age=ageValue;
        aviary = aviaryValue.aviaryWithInfraredLight;
    }
    //constructor with another ColdBlooded
    ColdBlooded(ColdBlooded value){
        this.nickname= value.nickname;
        this.weight=value.weight;
        this.age=value.age;
        this.aviary=value.aviary;
    }
    //gives position to ColdBlooded
    public void Move(ColdBlooded withInfraredLightAviaries[][]){
        Boolean k=false;
        for(int i=0;i<withInfraredLightAviaries.length;i++) {
            for (int j = 0; j < withInfraredLightAviaries[i].length; j++) {
                if (withInfraredLightAviaries[i][j] == null) {
                    withInfraredLightAviaries[i][j]=new ColdBlooded(this);
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
