public class person {
    int hp; //data member
    int att; //data member
    int mp; //data member
    int attack;
    String name; //data member

    int gethp() {
        //method member
        return this.hp; //this 指向此類別本身
    }
    int getAtt(){
        return this.att;
    }
    int getmp(){
        return this.mp;
    }
    int getAttack(){
        return this.attack;
    }
    void attack(person enemy){
        int result = this.attack - enemy.attack;
        if(result>0){
            this.hp = this.hp - result;
        }
    }

    String getMyName() {
        return this.name;
    }
    //this 指向此類別本身

    void ShoutMyName() {
        //method member
        System.out.println("I am " + getMyName().toUpperCase() + "."); //於類別內呼叫getMyName函數
    }
}
