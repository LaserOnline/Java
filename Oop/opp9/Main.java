public class Main {
    
    public static void main(String[] args) {
        
        System.out.print("\n");
        
        Saria saria = new Saria();
            saria.name("Saria");
            saria.tags("Defense, Healing, Support");
            saria.skill("Medicine Preparation");
            saria.gender("Female");
            saria.hp(3150);
            saria.attack(485);
            saria.defense(595);
            saria.level(90);
            saria.redeploy_time(60);
            saria.block(3);
            saria.cost(21);

        System.out.print("\n");

        Exusuau exusuau = new Exusuau();
            exusuau.name("Exusuau");
            exusuau.tags("Ranged");
            exusuau.skill("Overload Mode");
            exusuau.gender("Female");
            exusuau.hp(1673);
            exusuau.attack(540);
            exusuau.defense(164);
            exusuau.level(90);
            exusuau.redeploy_time(60);
            exusuau.block(1);
            exusuau.cost(11);
        System.out.print("\n");
        
        Skadi skadi = new Skadi();
            skadi.name("Skadi");
            skadi.tags("DPS, Survival");
            skadi.skill("Tidal Elegy");
            skadi.gender("Female");
            skadi.hp(3866);
            skadi.attack(1015);
            skadi.defense(263);
            skadi.level(90);
            skadi.redeploy_time(60);
            skadi.block(1);
            skadi.cost(19);
        System.out.print("\n");
        
        SilverAsh silverash = new SilverAsh();
            silverash.name("SilverAsh");
            silverash.tags("DPS, Support");
            silverash.skill("True Silver Slash");
            silverash.gender("Male");
            silverash.hp(2560);
            silverash.attack(713);
            silverash.defense(397);
            silverash.level(90);
            silverash.redeploy_time(60);
            silverash.block(2);
            silverash.cost(16);
        System.out.print("\n");
    }
}
