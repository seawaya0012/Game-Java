public class ClassServant {
    public String saber;
    public String archer;
    public String lancer;
    public String classes;
  
    public ClassServant(){
        saber = "Class Saber swordWeapon : Excalibur";
        archer = "Class Archer archerWeapon : Caladbolg";
        lancer = "Class Lancer lanceWeapon : Gae Bolg";
    }
    public String choosClassServant(int anw){
        if(anw == 1){
            classes = saber;
            return saber;
        }else if(anw == 2){
            classes = archer;
            return archer;
        }else{
            classes = lancer;
            return lancer;
        }
    }

}
