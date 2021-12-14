public class person {
    int hp;
    int att;
    int mp;
    String name;

    person(String personName, int personHp, int personAtt, int personMp ) {
        name = personName ;
        hp = personHp;
        att = personAtt;
        mp = personMp;
    }

    void getMyCurrentStatus() {
        System.out.println("i am " + this.getname()+" !!");
        System.out.println("my hp = " + this.gethp());
        System.out.println("my att = " + this.getatt());
        System.out.println("my mp = " + this.getmp()) ;
    }
    String getname() {return this.name;}

    int gethp() {return this.hp; }

    int getmp() {return this.mp;}

    int getatt() {return this.att;}

    // void attack(Person enemy){
    //     int result = this.attack - enemy.attack;
    //     if(result>0){
    //         this.hp = this.hp - result;
    //     }
    // }


//   void ShoutMyName() {
//       method member;
//       System.out.println("I am " + getMyName().toUpperCase() + "."); //於類別內呼叫getMyName函數
//   }
}