class Exusuau extends Operator implements Skill_Operator {
    
    private String name;
    private String skill;
    private String tags;
    private String gender;
    private int hp;
    private int defense;
    private int attack;
    private int level;
    private int cost;
    private int block;
    private int redeploy_time;

        public void name(String name){
            this.name = name;
            System.out.println("Name: "+ name);
        }
        
        public void skill(String skill){
            this.skill = skill;
            System.out.println("Skill: "+ skill);
        }

        public void gender(String gender){
            this.gender = gender;
            System.out.println("Gender: "+ gender);
        }

        public void tags(String tags){
            this.tags = tags;
            System.out.println("Tags: "+ tags);
        }   

        public void level(int level){
            this.level = level;
            System.out.println("Level: "+ level);
        }

        public void defense(int defense){
            this.defense = defense;
            System.out.println("Defense: "+ defense);
        }

        public void hp(int hp){
            this.hp = hp;
            System.out.println("HP: "+ hp);
        }  

        public void attack(int attack){
            this.attack = attack;
            System.out.println("Attack: "+ attack);
        }
        
        public void redeploy_time(int redeploy_time){
            this.redeploy_time = redeploy_time;
            System.out.println("Redeploy time: "+ redeploy_time);
        }

        public void cost(int cost){
            this.cost = cost;
            System.out.println("Cost: "+ cost);
        }

        public void block(int block){
            this.block = block;
            System.out.println("Block: "+ block);
        } 
}
