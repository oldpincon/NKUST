
    public class game {
        public static void main(String[] args) {
            person Archer = new person();
            // set the value to data member
            Archer.name = "Archer";
            Archer.hp = 15;
            Archer.att = 30;
            Archer.mp = 10;
            Archer.attack = 5;
            // call the method member
            Archer.ShoutMyName();
            System.out.println("my hp : " + Archer.gethp() );
            System.out.println("my att : " + Archer.getAtt() );
            System.out.println("my mp: " + Archer.getmp() );
            System.out.println("my attack: " + Archer.getAttack() );

            System.out.println("--------------------");
            person Berserker = new person();
            Berserker.name = "Berserker";
            Berserker.hp = 20;
            Berserker.att = 15;
            Berserker.mp = 5;
            Berserker.attack = 10;
            Berserker.attack(Archer);
            Berserker.ShoutMyName();
            System.out.println("my hp : " + Berserker.gethp() );
            System.out.println("my att : " + Berserker.getAtt() );
            System.out.println("my mp: " + Berserker.getmp() );
            System.out.println("my attack: " + Berserker.getAttack() );

            System.out.println("--------------------");

            person Magician = new person();
            // set the value to data member
            Magician.name = "Magician";
            Magician.hp = 10;
            Magician.att = 40;
            Magician.mp = 30;
            Magician.attack = 3;
            Magician.attack(Berserker);

            // call the method member
            Magician.ShoutMyName();
            System.out.println("my hp : " + Magician.gethp() );
            System.out.println("my att : " + Magician.getAtt() );
            System.out.println("my mp: " + Magician.getmp() );
            System.out.println("my attack: " + Magician.getAttack() );

            System.out.println("--------------------");


        }
    }

